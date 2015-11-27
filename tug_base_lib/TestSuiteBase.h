/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef TESTSUITEBASE_H
#define TESTSUITEBASE_H

#include <QObject>
#include <qt_TestUtils.hpp>

///
/// test suite class
///

class TestSuiteBase : public QObject {

    Q_OBJECT

public:
    TestSuiteBase();
    ~TestSuiteBase();

    std::string id();
    std::string description();

protected:
    std::string _id;
    std::string _description;

    /// /////////////////////////////////////////////////////
    ///
    /// funcionalidad básica de una test suite (clase base)
    ///
    /// /////////////////////////////////////////////////////

public:

    ///
    /// Método para lanzar una testuite referenciada con puntero.
    static int launch_standalone (TestSuiteBase* tsb, int argc = 0, char *argv[] = 0);


    ///
    /// Método para lanzar una testuite referenciada con puntero sin app
    static int launch (TestSuiteBase* tsb, QApplication* app);
    static int launch (TestSuiteBase* tsb, QApplication* app, QStringList arguments);
    static int launch (TestSuiteBase* tsb, QApplication* app, int argc, char** argv);

protected:

    ///
    /// permitimos el uso de eventos para llamar a los métodos
    /// de la clase base
    /// evento 1000 -> para configuración
    /// evento 1001 -> para ejecución de tests
    virtual bool event (QEvent *e);

    /// /////////////////////////////////////////////////////
    /// slots para la ejecución automática de los métodos de
    /// configuración y finalización de la testsuite y los tests
    /// /////////////////////////////////////////////////////

private Q_SLOTS:

    void initTestCase();

    void cleanupTestCase();

    void init();

    void cleanup();


    /// /////////////////////////////////////////////////////
    ///
    /// métodos de test suite a implementar opcionalmente
    /// implementa: SAES
    ///
    /// /////////////////////////////////////////////////////

public:


    ///
    /// Método de configuración que se llama al inicio de una test suite.
    /// Su sobrecarga es opcional.
    virtual void configure_testsuite();

    ///
    /// Método de finalización que se llama al final de una test suite.
    /// Su sobrecarga es opcional.
    virtual void finish_testsuite();

    ///
    /// Método de configuración que se llama al inicio de cada uno de los tests.
    /// Su sobrecarga es opcional.
    virtual void configure_test();

    ///
    /// Método de finalización que se llama al final de cada uno de los tests.
    /// Su sobrecarga es opcional.
    virtual void finish_test();

    ///
    /// Método que ejecuta todos los tests incluídos en la testsuite.
    /// Su sobrecarga es opcional.
    virtual void do_tests();
};

#endif //
