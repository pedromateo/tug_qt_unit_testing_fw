#ifndef Testsuite_MainWindow_1_hpp
#define Testsuite_MainWindow_1_hpp

#include "Testsuite_base_MainWindow.hpp"
        
/// protected code area, kept after roundtrip        
/// >>>>>

/// <<<<< 

///
/// \brief The Testsuite_MainWindow_1 class
///

class Testsuite_MainWindow_1 : public Testsuite_base_MainWindow {

    Q_OBJECT /// (mandatory) Our test suite has to execute Q_OBJECT macros

public:

    /// TestSuite constructor
    Testsuite_MainWindow_1()
    {
        _id = "Testsuite_MainWindow_1";
        _panel = NULL;
    }

    ///
    /// TestSuite objects
    ///

protected:

    test_MainWindow* _panel;


public:

    ///
    /// TestSuiteBase overloaded methods
    ///

    /// additional configurations performed before test suite execution
    virtual void configure_testsuite()
    {
        Testsuite_base_MainWindow::configure_testsuite();
        
        /// >>>>>
        
        // create the panel and show it here
        _panel = new test_MainWindow();
        tug::panel_launch(_panel);

        /// <<<<<
    }

    /// additional actions executed after test suite execution
    virtual void finish_testsuite()
    {
        Testsuite_base_MainWindow::finish_testsuite();
        
        /// >>>>>
        
        tug::panel_destroy(_panel);

        /// <<<<< 
    }

    ///
    /// Tests definition
    ///

private Q_SLOTS: /// (mandatory) Tests have to be declared as "private slots"

   /// Test name: test1
   void test1()
   {
      /// >>>>>

      tug::log("Executing test 'Testsuite_MainWindow_1::test1' (panel already launched)");
      tug::sleep2();

      // remove this statement - fail by default
      tug::fail("'Testsuite_MainWindow_1::test1' Empty test.");

      /// <<<<< 
   }

   /// Test name: test2
   void test2()
   {
      /// >>>>>

      tug::log("Executing test 'Testsuite_MainWindow_1::test2' (panel already launched)");
      tug::sleep2();

      // remove this statement - fail by default
      tug::fail("'Testsuite_MainWindow_1::test2' Empty test.");

      /// <<<<< 
   }



protected:

    ///
    /// Supporting code
    /// 
   
    /// >>>>>

    /// <<<<<

};

#endif // Testsuite_MainWindow_1_hpp

