/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#include "BaseRunner.h"

#include <cassert>
#include <cstring>
#include <stdexcept>
#include <ctime>
#include "TUGSettings.h"


BaseRunner::BaseRunner()
{
    _app = NULL;
    _argc = 0;
    _argv = NULL;

    reset();
}

BaseRunner::BaseRunner(int argc, char *argv[])
{
    _app = NULL;
    _argc = argc;
    _argv = argv;

    reset();
}

BaseRunner::BaseRunner(QApplication* app)
{
    assert(app);
    _app = app;

    _argc = app->arguments().size();

    _argv = new char*[_argc + 1];
    //
    for (int i = 0; i < _argc; i++) {
        // current arg
        std::string arg = app->arguments().at(i).toStdString();
        // copy arg to char** structure
        _argv[i] = new char[strlen(arg.c_str()) + 1];
        memcpy(_argv[i],
               arg.c_str(),
               strlen(arg.c_str()) + 1); //one more for '\0'
    }
    _argv[_argc] = ((char)NULL);

    reset();
}

void BaseRunner::reset()
{
    // reset variables
    _project_name = "TUGProject";
    _final_output_file = "";
    _temp_output_file = "";
    _add_timestamp_to_output_filename = false;
    _do_pause_between = false;
    _pause_between = 0;
    _do_profiling = false;

    _coverage_file_list.clear();
    _coverage_dir_list.clear();
}

//
// running process
//

///
int BaseRunner::run()
{
    // initial checks
    _check_qapplication();
    _initialize_output_options();

    // print arguments
    std::cout << "+-------------------------------------------------------------" << std::endl;
    std::cout << "  Running arguments:" << std::endl;
    for(int i = 0; i < _argc;i++){
        std::cout << "   - arg " << i << "= " << _argv[i] << std::endl;
    }

    // run process
    std::cout << "+-------------------------------------------------------------" << std::endl;
    std::cout << "  Running process:" << std::endl;
    _run_stuff();

    // finalization
    std::cout << "+-------------------------------------------------------------" << std::endl;
    std::cout << "  Ending process:" << std::endl;
    _finalize_output_options();

    return 0;
}


///
TestSuiteDescriptor& BaseRunner::_get_running_instance()
{
    return _running_instance;
}

//
// output management
//

///
/*void BaseRunner::_check_output_options()
{
    // init
    _do_output = false;

    //std::cout << "argc " << _argc << std::endl; sleep(5);

    // check if "-o" option is set. If so, change the file
    for (int i = 0; i < _argc; i++){
        std::string param(_argv[i]);
        if (param == "-o"){
            // change final file
            _final_output_file = _argv[i+1];
            _argv[i+1] = const_cast<char*>(_temp_output_file.c_str());
            _do_output = true;

            // initialize output manager
            _tom.initOutput(TUGSettings::value(KEY_DIR_OUTPUT),
                            "test_PlotCenterPanel.cpp",
                            _final_output_file,_temp_output_file,
                            TUGSettings::value(KEY_DIR_COVERAGE),
                            &_coverage_file_list,&_coverage_dir_list);

                    ///
                    //std::cout << "_do_output " << _do_output << std::endl;
                    //std::cout << "_final_output_file " << _final_output_file << std::endl;
                    //std::cout << "_argv[i+1] " << _argv[i+1] << std::endl;
                    ///

                    break;
        }
    }
}*/

///
void BaseRunner::_initialize_output_options()
{
    //
    // get filenames and dirs
    std::string DIR_OUTPUT = TUGSettings::value(KEY_DIR_OUTPUT);
    std::string DIR_COVERAGE = TUGSettings::value(KEY_DIR_COVERAGE);
    std::string DIR_TMP = TUGSettings::uniqueTmpDir().toStdString();

    _final_output_file =  DIR_OUTPUT + "/";
    if (_add_timestamp_to_output_filename){
        time_t rawtime;
        struct tm* timeinfo;
        char buffer [80];
        time (&rawtime);
        timeinfo = localtime (&rawtime);
        strftime (buffer,80,"%Y%m%d_%H%M",timeinfo);

        _final_output_file += std::string(buffer) + "_";
    }
    _final_output_file += TUGSettings::value(KEY_OUTPUT_FINAL_FILENAME);

    _temp_output_file = DIR_TMP + QDir::separator().toLatin1() + TUGSettings::value(KEY_OUTPUT_TMP_FILENAME);


    //
    // add options to arguments
    // (send output to temp file)
    _argv[_argc] = new char[10];
    strcpy(_argv[_argc],"-xunitxml");
    _argc++;
    _argv[_argc] = new char[3];
    strcpy(_argv[_argc],"-o");
    _argc++;
    _argv[_argc] = new char[_temp_output_file.size() + 1];
    strcpy(_argv[_argc],const_cast<char*>(_temp_output_file.c_str()));
    _argc++;

    //
    // initialize output manager
    _tom.initOutput(_project_name, DIR_OUTPUT,
                    _final_output_file, _temp_output_file,
                    DIR_COVERAGE,
                    &_coverage_file_list,&_coverage_dir_list,
                    _do_profiling);

    ///
    //std::cout << "_do_output " << _do_output << std::endl;
    //std::cout << "_final_output_file " << _final_output_file << std::endl;
    //std::cout << "_argv[i+1] " << _argv[i+1] << std::endl;
    ///
}


///
void BaseRunner::_do_output_options()
{
    _tom.doIntermediateOutput(_get_running_instance());
}

///
void BaseRunner::_do_recover_output_options(const std::string& msg)
{
    std::cout << "(BaseRunner::_do_recover_output_options) Message: " << msg << std::endl;
    _do_output_options();
    _finalize_output_options();
}

///
void BaseRunner::_finalize_output_options()
{
    // finalize output
    _tom.finalizeOutput();

    // revert change in "-o" option
    for (int i = 0; i < _argc; i++){
        if (0 == std::strcmp(_argv[i], "-o")){
            _argv[i+1] = const_cast<char*>(_final_output_file.c_str());
            break;
        }
    }
}
