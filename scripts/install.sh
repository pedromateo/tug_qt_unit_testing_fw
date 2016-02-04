#!/bin/sh

### check arguments ############################################################

# number
if [ $# -eq 0 ] || [ $# -gt 1 ]; then
   echo "Usage: './install.sh install_directory'"
   echo "Type './install.sh --help' for further help."
   exit 1
fi

if [ "$1" = "--help" ] || [ "$1" = "-h" ]; then
   echo "This is the installer for libTUG library."
   echo ""
   echo "Usage: './install.sh install_directory'"
   echo ""
   echo "Installation results in the following structure:"
   echo "  - install_directory/lib ........ Compiled library"
   echo "  - install_directory/include .... Library includes"
   echo "  - install_directory/tools ...... TUGWizard application"
   echo "  - install_directory/doc ........ libTUG and TUGWizard documentation"
   echo ""
   echo ""
   echo "Type './install.sh --help' to show this message."
   exit 1
fi
1.7.
### create and clean directory #################################################

echo "Creating target directory..."
TARGET_DIR=$1
mkdir -p -v $TARGET_DIR

### compile library ############################################################

mkdir -p -v $TARGET_DIR/lib
rm -rf $TARGET_DIR/lib/*
mkdir -p -v $TARGET_DIR/include
rm -rf $TARGET_DIR/include/*
cd ./libTUG_project/

echo "Executing qmake..."
qmake gui_testsuite_library.pro -r -spec linux-g++ CONFIG+=debug CONFIG+=declarative_debug DESTDIR=$TARGET_DIR/lib

echo "Executing make and installing lib into target directory..."
make clean
make
make install

echo "Copying includes..."
cp *.h *.hpp $TARGET_DIR/include

cd ..

### copy TUGWizard and doc #####################################################

echo "Copying tools..."

mkdir -p -v $TARGET_DIR/tools/TUG_wizard
mkdir -p -v $TARGET_DIR/tools/TUG_wizard/config
rsync --copy-links ./TUG_wizard/* $TARGET_DIR/tools/TUG_wizard
#rsync -r --copy-links ./TUG_wizard/resources $TARGET_DIR/tools/TUG_wizard
rsync -r --copy-links ./TUG_wizard/TUGWizard_lib $TARGET_DIR/tools/TUG_wizard
rsync -r --copy-links ./TUG_wizard/config/generation_templates $TARGET_DIR/tools/TUG_wizard/config
if [ -d "$TARGET_DIR/tools/TUG_wizard/config/includes/" ]; then
  echo "WARNING: TUG Wizard 'includes' folder (in config/) not copied. They already exist."
else
   rsync -r --copy-links ./TUG_wizard/config/includes $TARGET_DIR/tools/TUG_wizard/config
fi

echo "Copying doc..."

mkdir -p -v $TARGET_DIR/doc
rsync -r --copy-links ./doc $TARGET_DIR/

### modify libTUG includes into TUGWizard config files #########################

echo "Updating libTUG includes into TUGWizard config files..."

echo TUG_LIB_PATH = $TARGET_DIR/lib/ \\nTUG_INCLUDE_PATH = $TARGET_DIR/include/ \\nDEPENDPATH += '$${TUG_LIB_PATH}' \\nINCLUDEPATH += '$${TUG_INCLUDE_PATH}' \\nLIBS += -L'$${TUG_LIB_PATH}' -lTUG > $TARGET_DIR/tools/TUG_wizard/config/includes/tuglib_include
cat $TARGET_DIR/tools/TUG_wizard/config/includes/tuglib_include > $TARGET_DIR/tools/TUG_wizard/config/includes/tuglib_include_bak

### end ########################################################################

echo "Done."


