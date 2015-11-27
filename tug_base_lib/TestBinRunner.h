/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef TESTBINRUNNER_H
#define TESTBINRUNNER_H


#include <BaseRunner.h>
#include <QProcess>

class TestBinRunner : public BaseRunner
{

    Q_OBJECT

public:

    TestBinRunner();
    TestBinRunner(int argc, char *argv[]);
    TestBinRunner(QApplication* app);

    //
    // main functionality
    //

    ///
    /// Adds a new testsuite to the list
    void add_testbin(const std::string& binid, const std::string& binpath, const std::string& bindesc);

    ///
    /// Launches the execution of all stored test binaries
    virtual void _run_stuff();

    ///
    /// Resets the runner
    virtual void reset();

    //
    // error handler
    //

private Q_SLOTS:

    void _qprocess_error_handler(QProcess::ProcessError error);
    void _qprocess_finished_handler(int exitCode, QProcess::ExitStatus exitStatus);


private:

    std::list<TestSuiteDescriptor> _testbins;
};

#endif // TESTBINRUNNER_H
