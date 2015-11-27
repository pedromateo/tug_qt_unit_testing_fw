/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef TESTSUITEOUTPUTMANAGER_H
#define TESTSUITEOUTPUTMANAGER_H

#include <string>
#include <list>
#include <map>

#include <GcovUtils.h>
#include <TestSuiteDescriptor.h>

class TestSuiteOutputManager
{
public:
    TestSuiteOutputManager();
    virtual ~TestSuiteOutputManager();

    ///
    /// handle output stages
    ///

    void initOutput(const std::string &project_name, const std::string& output_dir,
                    const std::string& final_filepath, const std::string& temp_filepath,
                    const std::string& coverage_dir,
                    std::list<std::string>* coverage_files, std::list<std::string>* coverage_dirs,
                    bool do_profiling);
    void doIntermediateOutput(const TestSuiteDescriptor& executed_item);
    void finalizeOutput();

    ///
    /// variables
    ///

private:

    std::string _project_name;
    std::string _output_dir;
    std::string _panel_filepath;
    std::string _final_output_filepath;
    std::string _temp_output_filepath;
    std::string _output_style_filepath;
    //
    std::string _coverage_dir;
    std::list<std::string>* _coverage_files_list;
    std::list<std::string>* _coverage_dirs_list;
    //
    bool _do_profiling;
    std::map<std::string,std::string> _profiling_files_map;

};

#endif // TESTSUITEOUTPUTMANAGER_H
