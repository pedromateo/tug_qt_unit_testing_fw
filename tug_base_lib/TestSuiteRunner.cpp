/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#include "TestSuiteRunner.h"

#include "qt_TestUtils.hpp"




///

TestSuiteRunner::TestSuiteRunner() : BaseRunner()
{
}

TestSuiteRunner::TestSuiteRunner(int argc, char *argv[]) : BaseRunner(argc,argv)
{
}

TestSuiteRunner::TestSuiteRunner(QApplication* app) : BaseRunner(app)
{
}



///
void TestSuiteRunner::add_testsuite(TestSuiteBase* tsb)
{
    _testsuites.push_back(tsb);
}

///
void TestSuiteRunner::_run_stuff()
{
    // execute testsuites
    for (std:: list<TestSuiteBase*>::const_iterator ci = _testsuites.begin();
         ci != _testsuites.end();
         ++ci){

        // get testsuite id
        _running_testsuite_id = (*ci)->id();

        // execute testsuite
        std::cout << "+---------------------------------------------------------" << std::endl
                  << "  Executing new testsuite: " << std::endl;

        try{
            TestSuiteBase::launch(*ci,_app);

            //*(int*) 0 = 0;//segfault

            // do output stuff
            _do_output_options();
        }
        // recover from exception of sigfault (if recovery enabled)
        catch(std::exception& e){
            // do recover output
            _do_recover_output_options(e.what());
            std::cout << "Catched segmentation fault or another unhandled exception: "
                      << e.what() << std::endl;
        }
        // sleep if set
        _check_pause_between();
    }
}


///
void TestSuiteRunner::reset()
{
    BaseRunner::reset();
    _testsuites.clear();
}



