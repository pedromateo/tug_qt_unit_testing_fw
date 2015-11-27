/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef BASERUNNER_H
#define BASERUNNER_H

#include <QApplication>
#include <QTest>
#include <QObject>

#include <TestSuiteOutputManager.h>
#include <TestSuiteDescriptor.h>
#include <iostream>

class BaseRunner : public QObject
{

    Q_OBJECT

public:

    BaseRunner();
    BaseRunner(int argc, char *argv[]);
    BaseRunner(QApplication* app);

    ///
    /// Resets the runner
    virtual void reset();

public:

    ///
    /// Run method
    int run();

protected:

    ///
    /// Core implementation of running process (to be implemented in subclasses)
    virtual void _run_stuff() = 0;



    ///
    /// Returns identifier of running instance (to be implemented in subclasses)
    TestSuiteDescriptor& _get_running_instance();

    //
    // QApplication management
    //

protected:
    QApplication* _app;
    TestSuiteDescriptor _running_instance;

    ///
    /// Checks if QApplication is OK
    inline void _check_qapplication()
    {
        // check QApplication object
        if (_app == NULL){
            _app = new QApplication(_argc,_argv);
        }
    }


    //
    // arguments management
    //

protected:

    int _argc;
    char** _argv;


    //
    // output management
    //

public:

    ///
    /// Provides arguments to the test execution
 /*   inline BaseRunner& output_to_file(const std::string& filepath)
    {
        strcpy(_argv[_argc],"-xunitxml");
        _argc++;
        strcpy(_argv[_argc],"-o");
        _argc++;
        _argv[_argc] = new char[filepath.size() + 1];
        strcpy(_argv[_argc],const_cast<char*>(filepath.c_str()));
        _argc++;

        return *this;
    }*/

    ///
    /// project name

public:

    inline BaseRunner& project_name(const std::string name)
    {
        _project_name = name;
        return *this;
    }

protected:

    std::string _project_name;

    ///
    /// output timestamp

public:

    inline BaseRunner& add_timestamp_to_output_filename()
    {
        _add_timestamp_to_output_filename = true;
        return *this;
    }

protected:

    bool _add_timestamp_to_output_filename;

    ///
    /// output levels

public:

    inline BaseRunner& output_silent()
    {
        _argv[_argc] = new char[8];
        strcpy(_argv[_argc],"-silent");
        _argc++;

        return *this;
    }

    inline BaseRunner& output_verbose()
    {
        _argv[_argc] = new char[4];
        strcpy(_argv[_argc],"-v1");
        _argc++;

        return *this;
    }

    inline BaseRunner& output_extended()
    {
        _argv[_argc] = new char[4];
        strcpy(_argv[_argc],"-v2");
        _argc++;

        return *this;
    }

    inline BaseRunner& output_all()
    {
        _argv[_argc] = new char[4];
        strcpy(_argv[_argc],"-vs");
        _argc++;

        return *this;
    }


protected:

    ///
    /// Checks if there is a predefined file for output
    //void _check_output_options();

    ///
    /// Checks if there is a predefined file for output
    void _initialize_output_options();

    ///
    /// Merges the output for all testsuites in a single file
    /// (the predefined one)
    void _do_output_options();

    ///
    /// Checks if there is still output to merges after a sigfault
    void _do_recover_output_options(const std::string &msg);

    ///
    /// Revert the changes in the arguments related to output
    void _finalize_output_options();

    TestSuiteOutputManager _tom;
    std::string _temp_output_file;
    std::string _final_output_file;

    //
    // coverage management
    //

public:

    ///
    /// do coverage on file - gcov
    inline BaseRunner& coverage_on_file(const std::string& filepath)
    {
        _coverage_file_list.push_back(filepath);
        return *this;
    }

    ///
    /// do coverage on dir - lcov
    inline BaseRunner& coverage_on_dir(const std::string& dir)
    {
        _coverage_dir_list.push_back(dir);
        return *this;
    }

protected:

    std::list<std::string> _coverage_file_list;
    std::list<std::string> _coverage_dir_list;


    //
    // profiling management
    //

public:

    ///
    /// do profiling - gprof
    inline BaseRunner& do_profiling()
    {
        _do_profiling = true;
        return *this;
    }

protected:

    bool _do_profiling;

    //
    // segmentation fault handling
    //

protected:

    ///
    /// Checks if segfault recovery has to be enabled
    /*inline void _enable_handle_segfault()
    {
        segvcatch::init_segv();
        segvcatch::init_fpe();
    }*/

    //
    // options between-tests management
    //

protected:

    bool _do_pause_between;
    int _pause_between;

public:

    ///
    /// Pauses between the execution of two testsuites
    inline BaseRunner& pause_between(int ms){
        _do_pause_between = true;
        _pause_between = ms;
        return *this;
    }

protected:
    ///
    /// does, if set, a pause between tests
    inline void _check_pause_between()
    {
        if (_do_pause_between)
            QTest::qSleep(_pause_between);
    }


    //
    // console management
    //

protected:

    ///
    /// console output
    inline void _console_new_section(const char* s){
        std::cout << "+---------------------------------------------------------" << std::endl
                  << "  " << s << std::endl;
    }

    ///
    /// console output
    inline void _console_new_line(const char* s){
        std::cout << "  " << s << std::endl;
    }
};

#endif // BASERUNNER_H
