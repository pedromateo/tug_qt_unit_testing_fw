#-------------------------------------------------
#
# Project created by QtCreator 2013-07-12T09:17:59
#
#-------------------------------------------------

TARGET = TUG
TEMPLATE = lib


QT += gui xmlpatterns

equals(QT_MAJOR_VERSION, 5) {
  message(" ================ QT 5 ================ ")
   QT += widgets testlib
   CONFIG +=
}
else {
  message(" ================ QT 4 ================ ")
   QT +=
   CONFIG += qtestlib
}

#-------------------------------------------------

DEFINES += GUI_TESTSUITE_LIBRARY_LIBRARY

SOURCES += TestSuiteBase.cpp \
    TestSuiteRunner.cpp \
    segvcatch.cpp \
    TestSuiteOutputManager.cpp \
    GcovUtils.cpp \
    TestBinRunner.cpp \
    QtOutputBinder.cpp \
    BaseRunner.cpp \
    TUGSettings.cpp

HEADERS += gui_testsuite_library_global.h \
    qt_TestUtils.hpp \
    TestSuiteBase.h \
#qt_TestMacros.hpp \
    TestSuiteRunner.h \
    i386-signal.h \
    x86_64-signal.h \
    segvcatch.h \
    TestSuiteOutputManager.h \
    GcovUtils.h \
    TestBinRunner.h \
    QtOutputBinder.h \
    BaseRunner.h \
    TUGSettings.h \
    qt_TestSupport.hpp \
    TestSuiteDescriptor.h

OTHER_FILES += \
    settings \
    output_beautifier/TUG_output_transformation.xsl

RESOURCES += \
    resources.qrc
