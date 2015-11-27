/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#include "GcovUtils.h"

#include <cassert>
#include <iostream>
#include <stdlib.h>
#include <fstream>

#include "TUGSettings.h"

///
/// LCOV
///

///
/// \brief GcovUtils::GenerateLcovData
/// \param dir : directory to analyze
/// \param id  : name to identify coverage web output
/// \return a directory in which the resulting html files are stored
///
std::string GcovUtils::GenerateLcovData(const std::string& sourcedir,
                                        const std::string &destdir,
                                        const std::string &testname){


    // get and generate commands and dirs
    const QString id = "dir_" +
            QString(sourcedir.c_str()).replace("/","__");
    const QString DEST_DIR = QString(destdir.c_str()) + "/" + id + "/";

    const QString LCOV_PRE_CMD = TUGSettings::qvalue(KEY_LCOV_PRE_CMD);
    QString LCOV_PRE_OPTIONS = TUGSettings::qvalue(KEY_LCOV_PRE_OPTIONS);
    LCOV_PRE_OPTIONS.replace(QString("##SOURCEDIR##"),QString(sourcedir.c_str()));

    const QString LCOV_POST_CMD = TUGSettings::qvalue(KEY_LCOV_POST_CMD);
    QString LCOV_POST_OPTIONS = TUGSettings::qvalue(KEY_LCOV_POST_OPTIONS);
    LCOV_POST_OPTIONS.replace(QString("##TESTNAME##"),QString(testname.c_str()));
    LCOV_POST_OPTIONS.replace(QString("##SOURCEDIR##"),QString(sourcedir.c_str()));
    LCOV_POST_OPTIONS.replace(QString("##DESTDIR##"),DEST_DIR);
    LCOV_POST_OPTIONS.replace(QString("##TEMPDIR##"),TUGSettings::uniqueTmpDir());

    const QString PRE_CMD = LCOV_PRE_CMD + " " + LCOV_PRE_OPTIONS;
    const QString POST_CMD = LCOV_POST_CMD + " " + LCOV_POST_OPTIONS;

    std::cout << "+-------------------------------------------------------------" << std::endl;
    std::cout << "  Executing Lcov using:" << std::endl;
    std::cout << "   - dest dir = " << DEST_DIR.toStdString() << std::endl;
    std::cout << "   - pre cms = " << PRE_CMD.toStdString() << std::endl;
    std::cout << "   - post cmd = " << POST_CMD.toStdString() << std::endl;

    ///
    /// execute commands

    try{
        // lcov command
        std::cout << GcovUtils::Exec_and_result(POST_CMD.toStdString().c_str()) << std::endl;
        // clean command, for next execution
        std::cout << GcovUtils::Exec_and_result(PRE_CMD.toStdString().c_str()) << std::endl;
        return DEST_DIR.toStdString();
    }
    catch(std::fstream::failure& f){
        std::cerr << "(GcovUtils::GetLcovData) " << f.what() << std::endl;
        return "";
    }
}

///
/// \brief GcovUtils::CleanLcovData
///
void GcovUtils::CleanLcovData(){

    QString LCOV_CLEAN_CMD = QString(TUGSettings::value(KEY_LCOV_CLEAN_CMD).c_str());
    LCOV_CLEAN_CMD.replace(QString("##TEMPDIR##"),TUGSettings::uniqueTmpDir());

    // delete lcov generated files
    system(LCOV_CLEAN_CMD.toStdString().c_str());
}

///
/// GCOV
///

///
/// \brief GcovUtils::GetGcovData
/// \param filepath : file on which coverage has to be analyzed
/// \return the result of applying Gcov on file pointed by filepath
///
std::string GcovUtils::GetGcovData(const std::string& filepath){

    //return "this is content";

    std::string result = "";

    QString GCOV_PRE_CMD = QString(TUGSettings::value(KEY_GCOV_PRE_CMD).c_str());
    QString GCOV_PRE_OPTIONS = QString(TUGSettings::value(KEY_GCOV_PRE_OPTIONS).c_str());
    GCOV_PRE_OPTIONS = GCOV_PRE_OPTIONS.replace("##FILEPATH##",filepath.c_str());

    //QString GCOV_POST_CMD = QString(TUGSettings::value(KEY_GCOV_POST_CMD).c_str());
    //QString GCOV_POST_OPTIONS = QString(TUGSettings::value(KEY_GCOV_POST_OPTIONS).c_str());

    std::string gcov_command = GCOV_PRE_CMD.toStdString()
            + " " + GCOV_PRE_OPTIONS.toStdString();

    //std::string gcovfilename = filepath.substr(filepath.find_last_of('/')+1);
    //std::string gcovfilepath = gcovfilename + ".gcov";

    try{
        // do gcov
        std::cout << "  Executing gcov: " << gcov_command  << std::endl;


        return GcovUtils::Exec_and_result(gcov_command.c_str());

        /*system(gcov_command.c_str());


        std::cout << "@@@@@ DUMPING from: " << gcovfilepath << std::endl;

        // dump gcov file to a string
        std::ifstream infile;
        infile.open(gcovfilepath.c_str());
        if (infile.is_open())
        {
            std::string line = "";
            while (std::getline(infile,line))
            {
                result += line + '\n';
                //std::cout << "line: " << line  << std::endl;
            }
            infile.close();
        }
        else{
            std::cerr << "(GcovUtils::GetGcovData) File not opened: " << gcovfilepath << std::endl;
        }*/
    }
    catch(std::fstream::failure& f){
        std::cerr << "(GcovUtils::GetGcovData) " << f.what() << std::endl;
    }

    return result;
}

///
/// \brief GcovUtils::CleanGcovData
///
void GcovUtils::CleanGcovData(){

    QString GCOV_CLEAN_CMD = QString(TUGSettings::value(KEY_GCOV_CLEAN_CMD).c_str());

    // delete gcov generated files
    system(GCOV_CLEAN_CMD.toStdString().c_str());
}

///
/// GPROF
///

///
/// \brief GcovUtils::GetGprofData
/// \param filepath : file on which coverage has to be analyzed
/// \return the result of applying Gprof on file pointed by filepath
///
std::string GcovUtils::GetGprofData(const std::string& binname){

    //return "this is content";

    std::string result = "";

    QString GPROF_PRE_CMD = QString(TUGSettings::value(KEY_GPROF_PRE_CMD).c_str());
    QString GPROF_PRE_OPTIONS = QString(TUGSettings::value(KEY_GPROF_PRE_OPTIONS).c_str());
    GPROF_PRE_OPTIONS = GPROF_PRE_OPTIONS.replace("##BINNAME##",binname.c_str());

    std::string gprof_command = GPROF_PRE_CMD.toStdString()
            + " " + GPROF_PRE_OPTIONS.toStdString();

    try{
        // do gprof
        std::cout << "  Executing Gprof: " << gprof_command  << std::endl;


        return GcovUtils::Exec_and_result(gprof_command.c_str());
    }
    catch(std::fstream::failure& f){
        std::cerr << "(GcovUtils::GetGprofData) " << f.what() << std::endl;
    }

    return result;
}

///
/// \brief GcovUtils::CleanGprofData
///
void GcovUtils::CleanGprofData(){

    QString GPROF_CLEAN_CMD = QString(TUGSettings::value(KEY_GPROF_CLEAN_CMD).c_str());

    // delete gprof generated files
    system(GPROF_CLEAN_CMD.toStdString().c_str());
}

///
/// \brief GcovUtils::Exec_and_result
/// \param cmd : the command to be executed
/// \return output returned by command
///
std::string GcovUtils::Exec_and_result(const char *cmd) {
    FILE* pipe = popen(cmd, "r");
    if (!pipe) return "ERROR";
    char buffer[128];
    std::string result = "";
    while(!feof(pipe)) {
        if(fgets(buffer, 128, pipe) != NULL)
            result += buffer;
    }
    pclose(pipe);
    return result;
}

/*std::string TestSuiteOutputManager::GetGcovData_all(){

    std::string result = "";
    std::string command = "gcov " + filepath;


    try{
        system(command.c_str());
        // dump gcov file to a string

        std::string gcovfilepath = filepath + ".gcov";
        //std::cout << "file: " << gcovfilepath << std::endl;

        std::ifstream infile;
        infile.open(gcovfilepath.c_str());
        if (infile.is_open())
        {
            std::string line = "";
            while (std::getline(infile,line))
            {
                result += line + '\n';
                std::cout << "line: " << line  << std::endl;
            }
            infile.close();
        }
        else{
            std::cerr << "(TestSuiteOutputManager::GetGcovData) File not opened: " << gcovfilepath << std::endl;
        }
    }
    catch(std::fstream::failure& f){
        std::cerr << "(TestSuiteOutputManager::GetGcovData) " << f.what() << std::endl;
    }

    // delete gcov generated files
    system("rm *.gcov");

    return result;
}*/
