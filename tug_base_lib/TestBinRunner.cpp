/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#include "TestBinRunner.h"

#include <stdexcept>

#include "QtOutputBinder.h"
#include "qt_TestUtils.hpp"
#include <cassert>

///

TestBinRunner::TestBinRunner() : BaseRunner()
{
}

TestBinRunner::TestBinRunner(int argc, char *argv[]) : BaseRunner(argc,argv)
{
}

TestBinRunner::TestBinRunner(QApplication* app) : BaseRunner(app)
{
}

///
void TestBinRunner::add_testbin(const std::string &binid, const std::string &binpath, const std::string &bindesc)
{
    TestSuiteDescriptor bind;
    bind.id = binid;
    bind.path = binpath;
    bind.description = bindesc;

    _testbins.push_back(bind);
}

///
void TestBinRunner::_run_stuff()
{
    ///
    /// initialization

    // get arguments
    // avoid first argument (i.e., parent binary)
    QStringList args;
    for (int i = 1; i < _argc; i++)
        args << _argv[i];

    // declare process and output binder
    QProcess* pro;
    QtOutputBinder* qob;

    ///
    /// execute tests binaries
    for (std::list<TestSuiteDescriptor>::const_iterator ci = _testbins.begin();
         ci != _testbins.end();
         ++ci){

        // get path and name
        QString binid((*ci).id.c_str());
        QString binpath((*ci).path.c_str());
        QString bindesc((*ci).description.c_str());

        _running_instance = (*ci);

        std::cout << "+---------------------------------------------------------" << std::endl
                  << "  Executing: " << binpath.toStdString() << std::endl;

        // execute test bin

        // create process and connect output
        pro = new QProcess();
        qob = new QtOutputBinder(pro);
        qob->set_enabled(true);// enable for debugging

        // connect signal handlers
        pro->connect(pro,SIGNAL(error(QProcess::ProcessError)),this, SLOT(_qprocess_error_handler(QProcess::ProcessError)));
        //pro->connect(pro,SIGNAL(finished(int,QProcess::ExitStatus)),this, SLOT(_qprocess_finished_handler(int,QProcess::ExitStatus)));

        // execute binary and wait for it
        pro->start(binpath,args,QIODevice::ReadWrite | QIODevice::Text);

        if(!pro->waitForFinished()) // beware the timeout default parameter
        {
            std::cerr << "Error: Executing program failed with exit code " << pro->exitCode() << std::endl;
            _qprocess_error_handler(pro->error());
        }

        // do output stuff
        std::cout << "  Collecting output" << std::endl;
        _do_output_options();

        // clean
        pro->close();
        delete pro; delete qob;
        std::cout << "  Finished" << std::endl;

        // sleep if set
        _check_pause_between();
    }
}

///
void TestBinRunner::reset()
{
    BaseRunner::reset();
    _testbins.clear();
}

//
// error handler
///

void TestBinRunner::_qprocess_error_handler(QProcess::ProcessError error){
    std::cerr << "  Handled QProcess error: " << error << std::endl;

    if (error == QProcess::FailedToStart) std::cerr << "  - Info: QProcess::FailedToStart" << std::endl;
    else if (error == QProcess::Crashed) std::cerr << "  - Info: QProcess::Crashed" << std::endl;
    else if (error == QProcess::Timedout) std::cerr << "  - Info: QProcess::Timedout" << std::endl;
    else if (error == QProcess::WriteError) std::cerr << "  - Info: QProcess::WriteError" << std::endl;
    else if (error == QProcess::ReadError) std::cerr << "  - Info: QProcess::ReadError" << std::endl;
    else if (error == QProcess::UnknownError) std::cerr << "  - Info: QProcess::UnknownError" << std::endl;
}

void TestBinRunner::_qprocess_finished_handler(int exitCode, QProcess::ExitStatus exitStatus){
    std::cerr << "  Handled QProcess finished: " << exitCode << "::" << exitStatus << std::endl;
}

