#ifndef Testsuite_Mainwindow_2_hpp
#define Testsuite_Mainwindow_2_hpp

#include "Testsuite_base_MainWindow.hpp"
        
/// protected code area, kept after roundtrip        
/// >>>>>

/// <<<<< 

///
/// \brief The Testsuite_Mainwindow_2 class
///

class Testsuite_Mainwindow_2 : public Testsuite_base_MainWindow {

    Q_OBJECT /// (mandatory) Our test suite has to execute Q_OBJECT macros

public:

    /// TestSuite constructor
    Testsuite_Mainwindow_2()
    {
        _id = "Testsuite_Mainwindow_2";
    }


public:

    ///
    /// TestSuiteBase overloaded methods
    ///

    /// additional configurations performed before test suite execution
    virtual void configure_testsuite()
    {
        Testsuite_base_MainWindow::configure_testsuite();
        
        /// >>>>>

        /// <<<<<
    }

    /// additional actions executed after test suite execution
    virtual void finish_testsuite()
    {
        Testsuite_base_MainWindow::finish_testsuite();
        
        /// >>>>>

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

      test_MainWindow panel;
      tug::log("Executing test 'Testsuite_Mainwindow_2::test1'");
      tug::panel_launch(panel);
      tug::sleep2();

      // remove this statement - fail by default
      tug::fail("'Testsuite_Mainwindow_2::test1' Empty test.");

      /// <<<<< 
   }

  

protected:

    ///
    /// Supporting code
    /// 
   
    /// >>>>>

    /// <<<<<

};

#endif // Testsuite_Mainwindow_2_hpp

