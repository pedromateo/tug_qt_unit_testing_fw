/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef TESTSUITERUNNER_H
#define TESTSUITERUNNER_H

#include "BaseRunner.h"
#include <TestSuiteBase.h>


class TestSuiteRunner : public BaseRunner
{

    Q_OBJECT

public:


    TestSuiteRunner();
    TestSuiteRunner(int argc, char *argv[]);
    TestSuiteRunner(QApplication* app);

    //
    // main functionality
    //

    ///
    /// Adds a new testsuite to the list
    void add_testsuite(TestSuiteBase* tsb);

    ///
    /// Launches the execution of all stored testsuites
    virtual void _run_stuff();

    ///
    /// Resets the runner
    virtual void reset();

private:

    std:: list<TestSuiteBase*> _testsuites;
    std::string _running_testsuite_id;





};

///
///
///
/*
#include <QThread>

class TestSuiteThread : public QThread {

    Q_OBJECT

  public:
    TestSuiteThread(TestSuiteBase& ts, int argc, char *argv[]) : _testsuite(&ts), _argc(argc), _argv(argv)
    {

    }

    ~TestSuiteThread(){}

private:
    TestSuiteBase* _testsuite;
    int _argc;
    char** _argv;

  protected:
    void run(){
        TestSuiteBase::launch(_testsuite,_argc,_argv);
    }
};
*/

#endif // TESTSUITERUNNER_H
