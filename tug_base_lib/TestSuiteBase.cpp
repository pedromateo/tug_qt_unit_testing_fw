/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#include "TestSuiteBase.h"

#include <iostream>
#include <QApplication>
#include "segvcatch.h"
#include <cassert>

TestSuiteBase::TestSuiteBase()
{
    _id = "";
    _description = "";
}

TestSuiteBase::~TestSuiteBase()
{}

std::string TestSuiteBase::id(){
    return _id;
}

std::string TestSuiteBase::description(){
    return _description;
}

static int s_argc;
static char **s_argv;

int TestSuiteBase::launch_standalone(TestSuiteBase* tsb, int argc, char *argv[])
{
    QApplication app(argc,argv);
    return TestSuiteBase::launch(tsb,&app);
}

int TestSuiteBase::launch (TestSuiteBase* tsb, QApplication* app)
{
    if (!app)
        throw new std::exception();

    return launch(tsb,app,app->arguments());
}

int TestSuiteBase::launch (TestSuiteBase* tsb, QApplication* app, QStringList arguments)
{
    if (!app)
        throw new std::exception();

    s_argc = app->arguments().size();

    s_argv = new char*[s_argc + 1];
    //
    for (int i = 0; i < s_argc; i++) {
        // current arg
        std::string arg = app->arguments().at(i).toStdString();
        // copy arg to char** structure
        s_argv[i] = new char[strlen(arg.c_str()) + 1];
        memcpy(s_argv[i],
               arg.c_str(),
               strlen(arg.c_str()) + 1); //one more for '\0'
    }
    s_argv[s_argc] = ((char)NULL);


    // launch app
    launch(tsb,app,s_argc,s_argv);
}

int TestSuiteBase::launch (TestSuiteBase* tsb, QApplication* app, int argc, char** argv)
{
    if (!app)
        throw new std::exception();
    s_argc = argc;
    s_argv = argv;
    //app->syncX();
    tug::random_reset();// FIXME remove from here

    app->postEvent(tsb, new QEvent((QEvent::Type)1001));
    return app->exec();
}


///
/// events are allowed to call methods of base class:
/// event 1000 -> just for configuration
/// event 1001 -> just for executing tests (including configuration and finalization)
/// event 1002 -> just for finalization
bool TestSuiteBase::event (QEvent *e)
{
    if (e && e->type() == 1000)
    {
        configure_testsuite();
        return true;
    }
    else if (e && e->type() == 1001)
    {
        do_tests();
        return true;
    }
    else if (e && e->type() == 1002)
    {
        finish_testsuite();
        return true;
    }
    return false;
}

/////////////////

void TestSuiteBase::initTestCase(){
    configure_testsuite();
}

void TestSuiteBase::cleanupTestCase(){
    finish_testsuite();
}

void TestSuiteBase::init(){
    configure_test();
}

void TestSuiteBase::cleanup(){
    finish_test();
}

/////////////////

void TestSuiteBase::configure_testsuite()
{
    std::cout << "Configuring testsuite..." << std::endl;
    //do nothing
}

void TestSuiteBase::finish_testsuite()
{
    std::cout << "Finishing testsuite execution..." << std::endl;
    qApp->exit();
}

void TestSuiteBase::configure_test()
{
    std::cout << "Configuring test..." << std::endl;
    //do nothing
}

void TestSuiteBase::finish_test()
{
    std::cout << "Finishing test..." << std::endl;
    //do nothing
}

void TestSuiteBase::do_tests()
{
    // enable segfault and fpe handling
    segvcatch::init_segv();
    segvcatch::init_fpe();
    std::cout << "Signal handlers enabled." << std::endl;

    try{
        std::cout << "Launching tests..." << std::endl;
        QTest::qExec(this,s_argc,s_argv);
    }
    catch (segvcatch::SegfaultCatchedException& e ){
        std::cerr << "Recovering from signal->exception conversion." << std::endl;
        std::cerr << e.what() << std::endl;
        // try to recover from disaster
        finish_test();
        finish_testsuite();
    }
}
