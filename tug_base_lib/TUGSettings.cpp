/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#include "TUGSettings.h"
#include <iostream>
#include <cassert>


TUGSettings& TUGSettings::instance()
{
    static TUGSettings _instance;
    return _instance;
}


std::string TUGSettings::value(const char* key)
{
    return std::string(instance().getValue(key));
}


QString TUGSettings::qvalue(const char* key)
{
    return instance().getQValue(key);
}

QString TUGSettings::uniqueTmpDir()
{
    return instance()._tmp_dir.path();
}


TUGSettings::TUGSettings(){
    _settings = new QSettings(QString(SETTINGS_FILEPATH), QSettings::NativeFormat);

    // initialize unique temporary directory
#if QT_VERSION >= 0x050000
    // in Qt5.x, do nothing
#else
    // in Qt 4.x, create unique temp directory
    QString tmp_path(QDir::tempPath() + QDir::separator() + QUuid::createUuid().toString() + QDir::separator());
    _tmp_dir = QDir(tmp_path);
    if (!_tmp_dir.exists()) _tmp_dir.mkpath(".");
    if (!_tmp_dir.exists()) assert(0);
    std::cout << "Created unique tmp dir: " << _tmp_dir.path().toStdString() << std::endl;
#endif
}


TUGSettings::~TUGSettings(){
    delete _settings;

    // delete unique temporary directory
#if QT_VERSION >= 0x050000
    // in Qt5.x, do nothing
#else
    // in Qt 4.x, delete
    if (_tmp_dir.exists()){
        std::cout << "Cleaning unique temp dir: " << _tmp_dir.path().toStdString() << std::endl;
        _cleanDir(_tmp_dir.path());
    }
#endif
}


char* TUGSettings::getValue(const char* key)
{
    return const_cast<char*>(_settings->value(QString(key)).toString().toStdString().c_str());
}

QString TUGSettings::getQValue(const char* key)
{
    return _settings->value(QString(key)).toString();
}


#if QT_VERSION >= 0x050000
#else
bool TUGSettings::_cleanDir(const QString &dirName)
{
    bool result = true;
    QDir dir(dirName);

    if (dir.exists(dirName)) {
        Q_FOREACH(QFileInfo info, dir.entryInfoList(QDir::NoDotAndDotDot | QDir::System | QDir::Hidden  | QDir::AllDirs | QDir::Files, QDir::DirsFirst)) {
            if (info.isDir()) {
                result = _cleanDir(info.absoluteFilePath());
            }
            else {
                result = QFile::remove(info.absoluteFilePath());
            }

            if (!result) {
                return result;
            }
        }
        result = dir.rmdir(dirName);
    }

    return result;
}
#endif

