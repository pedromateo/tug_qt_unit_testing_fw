/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef TESTSUITEDESCRIPTOR_H
#define TESTSUITEDESCRIPTOR_H

///
/// \brief Describes all properties for a testsuite binary
struct TestSuiteDescriptor{
    std::string id;
    std::string path;
    std::string description;
};

#endif // TESTSUITEDESCRIPTOR_H
