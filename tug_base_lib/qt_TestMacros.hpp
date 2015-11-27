#ifndef QT_TESTMACROS_H
#define QT_TESTMACROS_H

// QTest reference: http://qt-project.org/doc/qt-4.7/qtest.html
// QTest reference: http://doc.qt.digia.com/4.7/qtestlib-manual.html

#include <qt_TestUtils.hpp>
#include <ctime>

////////////////////////////////////////////////////////////////////////////////
///
/// TESTSUITE MACROS
///
////////////////////////////////////////////////////////////////////////////////

///
/// test suite execution
///

// (mandatory) This macro executes all the tests declared in this test suite.
// In addition, the private slots initTestCase(), cleanupTestCase(), init()
// and cleanup() are executed if they exist.

/// #define t_TESTSUITE_EXEC() QTest::qExec(this)
/// #define t_TESTSUITE_EXEC_ARGS(args) QTest::qExec(this,args)


////////////////////////////////////////////////////////////////////////////////
///
/// TESTS EXECUTION MACROS
///
////////////////////////////////////////////////////////////////////////////////

///
/// execution: dump results to files
///

/*
// (optional) This macro represents the generic option to dump the testsuite
// execution results to a file with pretty format.
#define t_RESULTS_TO_FILE(filename) argv[argc] = "-xunitxml"; argc++; \
    argv[argc] = "-o"; argc++; \
    argv[argc] = filename; argc++

// (optional) This macro sets an option to dump the testsuite execution results
// to a file with plain text format.
#define t_RESULTS_TO_PLAIN(filename) argv[argc] = "-o"; argc++; \
    argv[argc] = filename; argc++

// (optional) This macro sets an option to dump the testsuite execution results
// to a file with XML format.
#define t_RESULTS_TO_XML(filename) argv[argc] = "-xml"; argc++; \
    argv[argc] = "-o"; argc++; \
    argv[argc] = filename; argc++

// (optional) This macro sets an option to dump the testsuite execution results
// to a file with XUNITXML format.
#define t_RESULTS_TO_XUNITXML(filename) argv[argc] = "-xunitxml"; argc++; \
    argv[argc] = "-o"; argc++; \
    argv[argc] = filename; argc++

// (optional) This macro sets an option to dump the testsuite execution results
// to a file with a light XML format.
#define t_RESULTS_TO_LIGHTXML(filename) argv[argc] = "-lightxml"; argc++; \
    argv[argc] = "-o"; argc++; \
    argv[argc] = filename; argc++
*/

///
/// execution: select verbose level
///

/*
// (optional) Silent output, only shows warnings, failures and minimal
// status messages
#define t_OUTPUT_SILENT() argv[argc] = "-silent"; argc++

// (optional) Verbose output; outputs information on entering and exiting
// test functions.
#define t_OUTPUT_VERBOSE() argv[argc] = "-v1"; argc++

// (optional) Extended verbose output; also outputs each QCOMPARE() and
// QVERIFY()
#define t_OUTPUT_EXTENDED() argv[argc] = "-v2"; argc++

// (optional) Outputs every signal that gets emitted
#define t_OUTPUT_ALL() argv[argc] = "-vs"; argc++
*/


////////////////////////////////////////////////////////////////////////////////
///
/// TESTS DEFINITION MACROS
///
////////////////////////////////////////////////////////////////////////////////


///
/// tests: deploy/destroy a panel
///

/*
// (optional) This macro helps you to create and deploy a new panel.
// As alternative, you can create a panel and launch it manually. Remember
// that the panel you created has to be hidden and destroyed properly.
#define t_LAUNCH_PANEL(w, panel_name) w panel_name; \
    panel_name.show(); \
    QTest::qWaitForWindowShown(&panel_name)

#define t_SHOW_PANEL(panel_pointer) if (panel_pointer == 0) \
    QFAIL("#panel_pointer is NULL"); \
    panel_pointer->show(); \
    QTest::qWaitForWindowShown(panel_pointer)
*/

///
/// tests: update/repaint a panel
///

/*
// (optional) This macro forces a panel repaint for developers to notice the
// changes done by code.
#define t_REPAINT(panel) qt_test::UPDATE(panel)

// (optional) This macro hides and show the panel in order to create
// a blink effect
#define t_BLINK_PANEL(panel) panel.hide(); \
    panel.show(); \
    QTest::qWaitForWindowShown(panel)

// (optional) This macro hides and show the panel in order to create
// a blink effect
#define t_BLINK_PANEL_PTR(panel_pointer) if (panel_pointer == 0) \
    QFAIL("#panel_pointer is NULL"); \
    panel_pointer->hide(); \
    panel_pointer->show(); \
    QTest::qWaitForWindowShown(panel_pointer)
*/

///
/// tests: test flow control
///

/*
// (optional) This macro sleeps 'ms' milliseconds
#define t_SLEEP(ms) \
    QTest::qSleep(ms)

// (optional) This macro sleeps 1000 milliseconds
#define t_SLEEP_1() \
    QTest::qSleep(1000)

// (optional) This macro sleeps 2000 milliseconds
#define t_SLEEP_2() \
    QTest::qSleep(2000)

// (optional) This macro sleeps 3000 milliseconds
#define t_SLEEP_3() \
    QTest::qSleep(3000)

// (optional) This macro sleeps 5000 milliseconds
#define t_SLEEP_5() \
    QTest::qSleep(5000)
*/

// (optional) This macro executes 'action' after 'ms' milliseconds
//#define t_DELAYED(action,ms) \
//    QTest::qSleep(ms); \
//    action;

///
/// tests: random values
///

/*
// (optional) This macro resets the seed used for the value generation
#define t_RESET_RANDOM() \
    qsrand(std::time(0))

// (optional) This macro returns a random number smaller than n
#define t_RANDOM(n) \
    qrand() % n

// (optional) This macro returns a random number between 'low' and
// 'high', both included
#define t_RANDOM_RANGE(low,high) \
    qrand() % ((high + 1) - low) + low

// (optional) This macro returns a random boolean
#define t_RANDOM_BOOL() \
    static_cast<bool>(qrand() % 2)
*/

///
/// tests: value ranges
///

// (optional) This macro simulates an integer range between 'min'
// and 'max', both included. 'val' is the name of the generated value.
//#define t_INT_RANGE(val,min,max) \
//   for (int val = min; val <= max; val++)

// (optional) This macro simulates an integer range between 'min'
// and 'max', both included, using 'inc' as increment.
// 'val' is the name of the generated value.
//#define t_INT_RANGE_INC(val,min,max,inc) \
//    for (int val = min; val <= max; val += inc)

// (optional) This macro simulates a float range between 'min' and
// 'max', both included, using 'inc' as increment.
// 'val' is the name of the generated value.
//#define t_FLOAT_RANGE(val,min,max,inc) \
//    for (int val = min; val <= max; val += inc)


///
/// tests assertions
///

// t_COMPARE(actual,expected)
// This macro compares an actual value to an expected value using the equals
// operator. If actual and expected are identical, execution continues. If not,
// a failure is recorded in the test log and the test won't be executed further.

//#define t_COMPARE(actual,expected) \
//    QCOMPARE(actual,expected)

/*
// t_FAIL(msg)
// This macro can be used to force a test failure. The test stops executing and
// the failure message is appended to the test log.

#define t_FAIL(msg) \
    QFAIL(msg)

// t_ASSERT(condition)
// The QVERIFY() macro checks whether the condition is true or not. If it is
// true, execution continues. If not, a failure is recorded in the test log and
// the test won't be executed further.

#define t_ASSERT(condition) \
    QVERIFY(condition)

// t_ASSERT_MSG(condition,msg)
// This macro behaves exactly like t_ASSERT(condition), except that it outputs a
// verbose message when condition is false. The message is a plain C string.

#define t_ASSERT_MSG(condition,msg) \
    QVERIFY2(condition,msg)

// t_WARN(msg)
// Appends message as a warning to the test log. This macro can be used anywhere
// in your tests.

#define t_WARN(msg) \
    QWARN(msg)
*/

/*
// t_LOG(msg)
// Displays 'msg' in the standard output.
#define t_LOG(text) qDebug(text)

*/



#endif // QT_TESTMACROS_H
