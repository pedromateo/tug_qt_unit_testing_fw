#!/bin/sh
if [ -z "$1" ]
then
  echo "This script needs a version number as first and unique argument."
  exit 1
fi

###
### wizard jar
###

# regenerate wizard .jar
cd ./standalone_generator/
sh create_standalone_TUGWizard
cd ../
sleep 2

###
### standalone
###

# creating wizard folder
REL_FOLDER=TUG_v$1
REL_DIR=../releases
DIR=$REL_DIR/$REL_FOLDER
rm -rf $DIR
mkdir $DIR
mkdir $DIR/TUG_wizard
#rsync -r --exclude=.svn --exclude="*.o" --copy-links ./standalone_generator/ $DIR/TUG_wizard
cp ./standalone_generator/launch_TUGWizard $DIR/TUG_wizard
#cp ../standalone_generator/buildstandalone_tugwizard.xml $DIR/TUG_wizard
cp ./standalone_generator/README $DIR/TUG_wizard
cp ./standalone_generator/tmp/TUGWizard.jar $DIR/TUG_wizard

###
### TUG wizard lib, config and resources
###

#rsync -r --exclude=.svn --exclude="*.o" --exclude="*~" --copy-links ../standalone_generator/TUGWizard_lib $DIR/TUG_wizard/
rsync -r --exclude=.svn --exclude="*.o" --exclude="*~" --copy-links ../tug_generation_wizard/config $DIR/TUG_wizard/
#rsync -r --exclude=.svn --exclude="*.o" --exclude="*~" --copy-links ../tug_generation_wizard/resources $DIR/TUG_wizard/
#rm $DIR/TUG_wizard/*~

###
### TUG base lib and project
###

# creating test library folder
#mkdir $DIR/TUG_lib
#rsync -r --exclude=.svn --exclude="*.o" --exclude="*~" --copy-links ../tug_base_lib/lib/#libcasa_gui_testing.so* $DIR/TUG_lib

# creating test library project folder
mkdir $DIR/libTUG_project
rsync -r --exclude=.svn --exclude="*.o" --exclude="moc_*" --exclude="lib" --exclude="*~" --exclude="*.user*" --copy-links ../tug_base_lib/* $DIR/libTUG_project

###
### example sources
###

#mkdir $DIR/example_sources
#rsync -r --exclude=.svn --exclude="*.o" --exclude="*.so" --exclude="*.so.*" --exclude="moc_*" --exclude="*~" --copy-#links ../example_test_sources/* $DIR/example_sources

###
### installer
###

cp install.sh $DIR/

###
### doc
###

# creating doc folder
mkdir $DIR/doc
#cp doc/README.org $DIR/doc
cp ../doc/TUG_doc.pdf $DIR/doc

# copy main readme file
cp ../README.md $DIR/

# creating tar.gz file
tar -zcvf $DIR.tar.gz --directory=$DIR/../ $REL_FOLDER
echo $DIR


echo Done.



