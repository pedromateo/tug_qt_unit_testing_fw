/// generation start ////////////////////////////////////////////////////////////

///
/// test_MainWindow.cpp automatically generated by TUG Wizard at 2016-01-21 14:03:01.856
///

#include "test_MainWindow.h"

// test support include
#include <qt_TestSupport.hpp>
#include <qt_TestUtils.hpp>

///
/// additional includes (protected area)

/// >>>>>

/// <<<<<

///
/// constructors

test_MainWindow::test_MainWindow()
    : MainWindow()
{
}

test_MainWindow::test_MainWindow(QWidget* parent)
    : MainWindow(parent)
{
}

test_MainWindow::~test_MainWindow()
{
}

///
/// supporting code (protected area)

/// >>>>>

/// <<<<<

///
/// widget methods
   
   
   // label
   void test_MainWindow::set_label(const std::string& s)
   {
       qt_test::setText(ui.label,s);
   }
   
   const std::string test_MainWindow::get_label()
   {
       return qt_test::getText(ui.label);
   }
   
   QLabel* test_MainWindow::acc_label()
   {
       return ui.label;
   }
   
   
   // label_3
   void test_MainWindow::set_label_3(const std::string& s)
   {
       qt_test::setText(ui.label_3,s);
   }
   
   const std::string test_MainWindow::get_label_3()
   {
       return qt_test::getText(ui.label_3);
   }
   
   QLabel* test_MainWindow::acc_label_3()
   {
       return ui.label_3;
   }
   
   
   // le_password
   void test_MainWindow::set_le_password(const std::string& s)
   {
       qt_test::setText(ui.le_password,s);
   }
   
   const std::string test_MainWindow::get_le_password()
   {
       return qt_test::getText(ui.le_password);
   }
   
   QLineEdit* test_MainWindow::acc_le_password()
   {
       return ui.le_password;
   }
   
   
   // le_username
   void test_MainWindow::set_le_username(const std::string& s)
   {
       qt_test::setText(ui.le_username,s);
   }
   
   const std::string test_MainWindow::get_le_username()
   {
       return qt_test::getText(ui.le_username);
   }
   
   QLineEdit* test_MainWindow::acc_le_username()
   {
       return ui.le_username;
   }
   
   
   // pb_login
   void test_MainWindow::doClick_pb_login()
   {
       qt_test::doLeftClick(ui.pb_login);
   }
   
   QPushButton* test_MainWindow::acc_pb_login()
   {
       return ui.pb_login;
   }
   
   
   // lbl_status
   void test_MainWindow::set_lbl_status(const std::string& s)
   {
       qt_test::setText(ui.lbl_status,s);
   }
   
   const std::string test_MainWindow::get_lbl_status()
   {
       return qt_test::getText(ui.lbl_status);
   }
   
   QLabel* test_MainWindow::acc_lbl_status()
   {
       return ui.lbl_status;
   }
   
   
   
   
   
   

/// generation end ////////////////////////////////////////////////////////////
