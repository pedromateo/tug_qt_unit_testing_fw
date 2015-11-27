/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef QTOUTPUTBINDER_H
#define QTOUTPUTBINDER_H

#include <QObject>
#include <QProcess>
#include <iostream>

class QtOutputBinder : public QObject
{

    Q_OBJECT

public:
    QtOutputBinder(QProcess*);

    void set_enabled(bool e);

private:
    QProcess* _process;
    bool _enabled;

public Q_SLOTS:

    void readStdOutput();
    void readErrOutput();
};

#endif // QTOUTPUTBINDER_H
