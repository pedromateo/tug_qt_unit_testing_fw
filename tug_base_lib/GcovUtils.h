/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef GCOVUTILS_H
#define GCOVUTILS_H

#include <string>

class GcovUtils
{
public:
    static std::string GenerateLcovData(const std::string& sourcedir,
                                        const std::string& destdir,
                                        const std::string& testname = "testname_not_set");
    static void CleanLcovData();

    static std::string GetGcovData(const std::string& filepath);
    static void CleanGcovData();

    static std::string GetGprofData(const std::string& binname);
    static void CleanGprofData();

    static std::string Exec_and_result(const char* cmd);
};

#endif // GCOVUTILS_H
