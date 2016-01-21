#ifndef Testsuite_base_MainWindow_hpp
#define Testsuite_base_MainWindow_hpp

#include "TestSuiteBase.h"

#include "test_MainWindow.h"



/// protected code area, kept after roundtrip        
/// >>>>>

/// <<<<< 

///
/// \brief The Testsuite_base_MainWindow class
///

class Testsuite_base_MainWindow : public TestSuiteBase {

    Q_OBJECT /// (mandatory) Our test suite has to execute Q_OBJECT macros

public:

    /// TestSuite constructor
    Testsuite_base_MainWindow()
    {
        _id = "Testsuite_base_MainWindow";
    }


    /// TestSuite destructor
    ~Testsuite_base_MainWindow()
    {
    }

protected:

    ///
    /// TestSuite objects 
    ///

    ///
    /// objects used to configure the test scenario
    
    


public:

    ///
    /// TestSuiteBase overloaded methods
    ///

    /// additional configurations performed before test suite execution
    virtual void configure_testsuite()
    {
        TestSuiteBase::configure_testsuite();
        // create and configure modal and signals here
        
        
        
        /// >>>>>

        /// <<<<<
    }

    /// tests execution 
    virtual void do_tests()
    {
        TestSuiteBase::do_tests();
    }

    /// additional actions executed after test suite execution
    virtual void finish_testsuite()
    {
        TestSuiteBase::finish_testsuite(); 
        
        /// >>>>>

        /// <<<<< 
    }

    ///
    /// Tests definition
    ///

private Q_SLOTS: /// (mandatory) Tests have to be declared as "private slots"



protected:

    ///
    /// Supporting code
    /// 
       
    /// >>>>>

    /// <<<<<

};

#endif // Testsuite_base_MainWindow_hpp

