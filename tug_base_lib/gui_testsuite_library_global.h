/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef GUI_TESTSUITE_LIBRARY_GLOBAL_H
#define GUI_TESTSUITE_LIBRARY_GLOBAL_H

#include <QtCore/qglobal.h>

#if defined(GUI_TESTSUITE_LIBRARY_LIBRARY)
#  define GUI_TESTSUITE_LIBRARYSHARED_EXPORT Q_DECL_EXPORT
#else
#  define GUI_TESTSUITE_LIBRARYSHARED_EXPORT Q_DECL_IMPORT
#endif

#endif // GUI_TESTSUITE_LIBRARY_GLOBAL_H
