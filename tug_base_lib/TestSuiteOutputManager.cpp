/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#include "TestSuiteOutputManager.h"

#include <iostream>
#include <cassert>
#include <exception>
#include <fstream>
#include <unistd.h>

#include "TUGSettings.h"

#include <QStringList>
#include <QFile>
#include <QTextStream>
#include <QDir>
#include <QResource>
#include <QXmlStreamWriter>
#include <QXmlQuery>



TestSuiteOutputManager::TestSuiteOutputManager()
{
}

TestSuiteOutputManager::~TestSuiteOutputManager()
{
}


void TestSuiteOutputManager::initOutput(const std::string& project_name,
                                        const std::string& output_dir,
                                        const std::string& final_filepath, const std::string& temp_filepath,
                                        const std::string& coverage_dir,
                                        std::list<std::string>* coverage_files, std::list<std::string>* coverage_dirs,
                                        bool do_profiling)
{

    assert(output_dir.length());
    assert(final_filepath.length());
    assert(temp_filepath.length());
    assert(coverage_dir.length());

    _project_name = project_name;
    _output_dir = output_dir;
    _final_output_filepath = final_filepath;
    _temp_output_filepath = temp_filepath;
    _output_style_filepath = output_dir + std::string("/") +
            TUGSettings::value(KEY_OUTPUT_STYLE_FILENAME);

    _coverage_dir = coverage_dir;
    _coverage_files_list = coverage_files;
    _coverage_dirs_list = coverage_dirs;

    _do_profiling = do_profiling;

    std::cout << "+-------------------------------------------------------------" << std::endl;
    std::cout << "  Output configuration:" << std::endl;
    char cwd[1024];
    getcwd(cwd, sizeof(cwd));
    std::cout << "   - current_dir = " << cwd << std::endl;
    std::cout << "   - output_dir = " << _output_dir << std::endl;
    std::cout << "   - final_output_filepath = " << _final_output_filepath << std::endl;
    std::cout << "   - temp_output_filepath = " << _temp_output_filepath << std::endl;
    std::cout << "   - output_style_filepath = " << _output_style_filepath << std::endl;
    std::cout << "   - coverage_dir = " << _coverage_dir << std::endl;

    ///
    /// delete temp file if it exists
    QFile::remove(_temp_output_filepath.c_str());

    ///
    /// create output file (create dirs if needed)

    // create directories (if needed)
    QDir dir;
    dir.mkpath(output_dir.c_str());

    // load output file preface
    std::string preface = TUGSettings::value(KEY_OUTPUT_FILE_PREFACE);

    // create (+erase) final file + add preface
    // start trial XML object
    try{
        QFile::remove(_final_output_filepath.c_str());
        QFile outfile(_final_output_filepath.c_str());
        outfile.open(QIODevice::WriteOnly);

        // create XML stream
        QXmlStreamWriter xmlstream(&outfile);
        xmlstream.setAutoFormatting(true);

        // write preface
        outfile.write(preface.c_str());

        // add 'trial' element start
        // - added by hand because it is done in two different steps
        const std::string trial_tag = TUGSettings::value(KEY_OUTPUT_FILE_TRIAL_TAG);
        std::string start_tag = "<" + trial_tag + " name=\"" + _project_name.c_str() + "\">";
        outfile.write(start_tag.c_str());
    }
    catch(std::exception& f){
        std::cerr << "(TestSuiteOutputManager) " << f.what() << std::endl;
    }

    ///
    /// create xslt file

    // copy xslt file into directory (always remove existing one)

    try{
        if (!QFile::remove(_output_style_filepath.c_str()))
            std::cerr << "(TestSuiteOutputManager) " << _output_style_filepath << " not removed." << std::endl;

        if (!QFile::copy(OUTPUT_STYLE_FILEPATH,_output_style_filepath.c_str()))
            std::cerr << "(TestSuiteOutputManager) " << _output_style_filepath << " not copied." << std::endl;


        /* // open input file from resources
        QFile infile(OUTPUT_STYLE_FILEPATH.c_str());
        if (infile.open((QIODevice::ReadOnly | QIODevice::Text))){
            infile.copy (_output_style_filepath.c_str());
            infile.close();

            // create output file
            //outfile.open(output_file.c_str(), std::ofstream::app);
            //if (infile.isOpen() && outfile.is_open())
            //{
            //outfile << infile.
            //infile.close();
            //  outfile.close();
            //  std::cout << "File created" << std::endl;
            //}
        }
        else{
            std::cerr << OUTPUT_STYLE_FILEPATH << " not open" << std::endl;
        }*/
    }
    catch(std::ifstream::failure& f){
        std::cerr << "(TestSuiteOutputManager) " << f.what() << std::endl;
    }
}

void TestSuiteOutputManager::doIntermediateOutput(const TestSuiteDescriptor &executed_item)
{
    ///
    /// dump the content of temp file to the final file
    ///

    std::ifstream infile;
    std::ofstream outfile;

    try{
        infile.open(_temp_output_filepath.c_str(), std::ios_base::in);
        outfile.open(_final_output_filepath.c_str(), std::ofstream::app);

        // dump content of temp file

        if (infile.is_open() && outfile.is_open())
        {
            std::string line = "";

            // avoid first line
            // (first line = <?xml version="1.0" encoding="UTF-8" ?>)
            std::getline(infile,line);

            // \n to insert new content below
            outfile << '\n';

            // get first line and add description property
            // replace 'name="' with 'description="<value>" name="'
            if (std::getline(infile,line))
            {
                QString soriginal("name=\"");
                QString snew("description=\"");
                snew.append(executed_item.description.c_str()).append("\" name=\"");

                QString result(line.c_str());
                result.replace(soriginal,snew);

                outfile << result.toStdString() << '\n';
            }

            // get the rest of the lines
            while (std::getline(infile,line))
            {
                outfile << line << '\n';
            }

            infile.close();
            outfile.close();
        }
    }
    catch(std::fstream::failure& f){
        std::cerr << "(TestSuiteOutputManager) " << f.what() << std::endl;
    }

    ///
    /// execute gprof and store output (if selected)
    ///

    if (_do_profiling){
        _profiling_files_map[executed_item.id] = GcovUtils::GetGprofData(executed_item.id);
    }
}

void TestSuiteOutputManager::finalizeOutput()
{
    std::cout << "+-------------------------------------------------------------" << std::endl;
    std::cout << "  Collecting output from different sources:" << std::endl;

    // load output file ending
    const std::string file_ending = TUGSettings::value(KEY_OUTPUT_FILE_ENDING);
    const std::string gcov_tag = TUGSettings::value(KEY_OUTPUT_FILE_GCOV_TAG);
    const std::string gcov_item_tag = TUGSettings::value(KEY_OUTPUT_FILE_GCOV_ITEM_TAG);
    const std::string gprof_tag = TUGSettings::value(KEY_OUTPUT_FILE_GPROF_TAG);
    const std::string gprof_item_tag = TUGSettings::value(KEY_OUTPUT_FILE_GPROF_ITEM_TAG);
    const std::string lcov_tag = TUGSettings::value(KEY_OUTPUT_FILE_LCOV_TAG);
    const std::string lcov_item_tag = TUGSettings::value(KEY_OUTPUT_FILE_LCOV_ITEM_TAG);

    ///
    /// get GCOV data for all files (may be none)

    std::cout << "   - GCOV" << std::endl;

    std::list<std::string> gcov_data;
    for (std::list<std::string>::const_iterator ci = _coverage_files_list->begin();
         ci != _coverage_files_list->end(); ++ci){
        gcov_data.push_back(GcovUtils::GetGcovData(*ci));
    }

    ///
    /// GPROF is done in doIntermediateOutput()

    std::cout << "   - GPROF" << std::endl;

    ///
    /// get LCOV data for all directories (may be none)

    std::list<std::string> lcov_paths;
    for (std::list<std::string>::const_iterator ci = _coverage_dirs_list->begin();
         ci != _coverage_dirs_list->end(); ++ci){
        lcov_paths.push_back(GcovUtils::GenerateLcovData(*ci,_coverage_dir,_project_name));
    }
    GcovUtils::CleanLcovData();

    ///
    /// create final XML file

    std::cout << "   - QtTest" << std::endl;

    try{
        QFile outfile(_final_output_filepath.c_str());
        outfile.open(QIODevice::Append);

        QXmlStreamWriter xmlstream(&outfile);
        xmlstream.setAutoFormatting(true);

        //
        // add gcov section to the file
        if (gcov_data.size() == 0){
            xmlstream.writeEmptyElement(gcov_tag.c_str());
            xmlstream.writeAttribute("items",QString::number(gcov_data.size()));
            xmlstream.writeEndElement();
        }
        else{
            xmlstream.writeStartElement(gcov_tag.c_str());
            xmlstream.writeAttribute("items",QString::number(gcov_data.size()));

            assert(_coverage_files_list->size() == gcov_data.size());
            std::list<std::string>::const_iterator idata = gcov_data.begin();
            std::list<std::string>::const_iterator ifiles = _coverage_files_list->begin();
            while (idata != gcov_data.end() && ifiles != _coverage_files_list->end()){
                //xmlstream.writeTextElement(gcov_item_tag.c_str(),(*idata).c_str());
                xmlstream.writeStartElement(gcov_item_tag.c_str());
                xmlstream.writeAttribute("file",(*ifiles).c_str());
                xmlstream.writeCharacters((*idata).c_str());
                //xmlstream.writeStartElement(gcov_item_tag.c_str());
                //xmlstream.writeCharacters((*ci).c_str());
                xmlstream.writeEndElement();
                idata++; ifiles++;
            }
            xmlstream.writeEndElement();
        }

        //
        // add gprof section to the file
        if (_profiling_files_map.size() == 0){
            xmlstream.writeEmptyElement(gprof_tag.c_str());
            xmlstream.writeAttribute("items",QString::number(_profiling_files_map.size()));
            xmlstream.writeEndElement();
        }
        else{
            xmlstream.writeStartElement(gprof_tag.c_str());
            xmlstream.writeAttribute("items",QString::number(_profiling_files_map.size()));

            assert(_profiling_files_map.size());
            std::map<std::string,std::string>::const_iterator idata = _profiling_files_map.begin();
            while (idata != _profiling_files_map.end()){
                xmlstream.writeStartElement(gprof_item_tag.c_str());
                xmlstream.writeAttribute("bin",(*idata).first.c_str());
                xmlstream.writeCharacters((*idata).second.c_str());
                xmlstream.writeEndElement();
                idata++;
            }
            xmlstream.writeEndElement();
        }

        //
        // add lcov section to the file
        if (lcov_paths.size() == 0){
            xmlstream.writeEmptyElement(lcov_tag.c_str());
            xmlstream.writeAttribute("items",QString::number(lcov_paths.size()));
            xmlstream.writeEndElement();
        }
        else{
            xmlstream.writeStartElement(lcov_tag.c_str());
            xmlstream.writeAttribute("items",QString::number(lcov_paths.size()));

            assert(_coverage_dirs_list->size() == lcov_paths.size());
            std::list<std::string>::const_iterator idata = lcov_paths.begin();
            std::list<std::string>::const_iterator ifiles = _coverage_dirs_list->begin();

            while (idata != lcov_paths.end() && ifiles != _coverage_dirs_list->end()){
                xmlstream.writeStartElement(lcov_item_tag.c_str());
                xmlstream.writeAttribute("dir",(*ifiles).c_str());
                xmlstream.writeCharacters((*idata).c_str());
                xmlstream.writeEndElement();
                idata++; ifiles++;
            }
            xmlstream.writeEndElement();
        }

        //
        // add ending to file and close main XML 'trial' object
        outfile.write(file_ending.c_str());
        const std::string trial_tag = TUGSettings::value(KEY_OUTPUT_FILE_TRIAL_TAG);
        std::string end_tag = "</" + trial_tag + ">";
        outfile.write(end_tag.c_str());

        outfile.close();
    }
    catch(std::exception& e){
        std::cerr << "(TestSuiteOutputManager) " << e.what() << std::endl;
    }

    ///
    /// load XSLT transformation code

    std::cout << "   - Generating HTML" << std::endl;

    std::string xslt_code = "";

    try{

        // open input file from resources
        QFile infile(OUTPUT_STYLE_FILEPATH);
        if (infile.open((QIODevice::ReadOnly | QIODevice::Text))){
            QTextStream instream(&infile);
            xslt_code = instream.readAll().toStdString();
        }
        else{
            std::cerr << OUTPUT_STYLE_FILEPATH << " not open" << std::endl;
        }
    }
    catch(std::ifstream::failure& f){
        std::cerr << "(TestSuiteOutputManager) " << f.what() << std::endl;
    }

    ///
    /// generate HTML from XML file and xslt code

    std::string html_filepath = _final_output_filepath + ".html";

    try{
        // generate output string
        QXmlQuery query(QXmlQuery::XSLT20);
        QString output;
        query.setFocus(QUrl(_final_output_filepath.c_str()));
        //query.setQuery(QUrl(_output_style_filepath.c_str()));
        query.setQuery(xslt_code.c_str());
        query.evaluateTo(&output);

        // dump string to file
        QFile outfile(html_filepath.c_str());
        outfile.open(QIODevice::WriteOnly);
        outfile.write(output.toUtf8());
        outfile.close();
    }
    catch(std::exception& e){
        std::cerr << "(TestSuiteOutputManager) " << e.what() << std::endl;
    }
}


