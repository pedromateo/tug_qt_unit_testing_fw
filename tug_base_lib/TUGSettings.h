/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef SETTINGS_H
#define SETTINGS_H

#include <QSettings>

#if QT_VERSION >= 0x050000
    #include <QTemporaryDir>
#else
    #include <QDir>
    #include <QUuid>
#endif

/// files

static const char* OUTPUT_STYLE_FILEPATH = ":/tug_resources/output_beautifier/TUG_output_transformation.xsl";
static const char* SETTINGS_FILEPATH = ":/tug_resources/settings";

/// keys

static const char* KEY_DIR_BIN = "dir_bin";
static const char* KEY_DIR_COVERAGE = "dir_coverage";
static const char* KEY_DIR_OUTPUT = "dir_output";
static const char* KEY_DIR_TESTS = "dir_tests";


static const char* KEY_OUTPUT_TMP_FILENAME = "output_tmp_filename";
static const char* KEY_OUTPUT_STYLE_FILENAME = "output_style_filename";
static const char* KEY_OUTPUT_FINAL_FILENAME = "output_final_filename";


static const char* KEY_OUTPUT_FILE_PREFACE = "output_file_preface";
static const char* KEY_OUTPUT_FILE_ENDING = "output_file_ending";
static const char* KEY_OUTPUT_FILE_TRIAL_TAG = "output_file_trial_tag";
//static const char* KEY_OUTPUT_FILE_GCOV_OPEN = "output_file_gcov_open";
//static const char* KEY_OUTPUT_FILE_GCOV_CLOSE = "output_file_gcov_close";
static const char* KEY_OUTPUT_FILE_GCOV_TAG = "output_file_gcov_tag";
static const char* KEY_OUTPUT_FILE_GCOV_ITEM_TAG = "output_file_gcov_item_tag";
static const char* KEY_OUTPUT_FILE_GPROF_TAG = "output_file_gprof_tag";
static const char* KEY_OUTPUT_FILE_GPROF_ITEM_TAG = "output_file_gprof_item_tag";
static const char* KEY_OUTPUT_FILE_LCOV_TAG = "output_file_lcov_tag";
static const char* KEY_OUTPUT_FILE_LCOV_ITEM_TAG = "output_file_lcov_item_tag";

static const char* KEY_GCOV_PRE_CMD = "gcov_pre_command";
static const char* KEY_GCOV_PRE_OPTIONS = "gcov_pre_options";
static const char* KEY_GCOV_POST_CMD = "gcov_post_command";
static const char* KEY_GCOV_POST_OPTIONS = "gcov_post_options";
static const char* KEY_GCOV_CLEAN_CMD = "gcov_clean_command";

static const char* KEY_GPROF_PRE_CMD = "gprof_pre_command";
static const char* KEY_GPROF_PRE_OPTIONS = "gprof_pre_options";
static const char* KEY_GPROF_POST_CMD = "gprof_post_command";
static const char* KEY_GPROF_POST_OPTIONS = "gprof_post_options";
static const char* KEY_GPROF_CLEAN_CMD = "gprof_clean_command";

static const char* KEY_LCOV_PRE_CMD = "lcov_pre_command";
static const char* KEY_LCOV_PRE_OPTIONS = "lcov_pre_options";
static const char* KEY_LCOV_POST_CMD = "lcov_post_command";
static const char* KEY_LCOV_POST_OPTIONS = "lcov_post_options";
static const char* KEY_LCOV_CLEAN_CMD = "lcov_clean_command";

/// singleton class

class TUGSettings{

    ///
    /// singleton interface

public:
    static TUGSettings& instance();
    static std::string value(const char* key);
    static QString qvalue(const char* key);

    static QString uniqueTmpDir();

private:
    ///
    /// \brief Settings constructor
    ///
    TUGSettings();
    virtual ~TUGSettings();

    QSettings* _settings;

    char* getValue(const char* key);
    QString getQValue(const char* key);

    /// unique temporary directory
    #if QT_VERSION >= 0x050000
    QTemporaryDir _tmp_dir;
    #else
    QDir _tmp_dir;
    bool _cleanDir(const QString& dirname);
    #endif

};





#endif // SETTINGS_H
