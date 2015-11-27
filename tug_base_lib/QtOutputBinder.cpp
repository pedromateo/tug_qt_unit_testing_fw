/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#include "QtOutputBinder.h"


QtOutputBinder::QtOutputBinder(QProcess* p) : _enabled(true)
{
    _process = p;
    _process->connect(_process,SIGNAL(readyReadStandardOutput()),this,SLOT(readStdOutput()));
    _process->connect(_process,SIGNAL(readyReadStandardError()),this,SLOT(readErrOutput()));
}

void QtOutputBinder::readStdOutput()
{
    if (_enabled) std::cout << _process->readAllStandardOutput().data();
}

void QtOutputBinder::readErrOutput()
{
    if (_enabled) std::cerr << _process->readAllStandardError().data();
}



void QtOutputBinder::set_enabled(bool e){
    _enabled = e;
}
