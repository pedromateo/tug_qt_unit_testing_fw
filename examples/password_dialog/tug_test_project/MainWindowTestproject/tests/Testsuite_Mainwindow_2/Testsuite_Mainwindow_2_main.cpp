/// generation start ////////////////////////////////////////////////////////////

///
/// Testsuite_Mainwindow_2_main.cpp automatically generated by TUG Wizard at (TODO add timestamp here)
///

/// testsuite includes
#include "../Testsuite_Mainwindow_2.hpp"

/// main function
int main(int argc, char *argv[])
{
    // enable signal handling
    tug::signal_handling();
    
    // create and launch testsuite
    Testsuite_Mainwindow_2 ts;
    return TestSuiteBase::launch(&ts,new QApplication(argc,argv));
}

/// generation end ////////////////////////////////////////////////////////////


