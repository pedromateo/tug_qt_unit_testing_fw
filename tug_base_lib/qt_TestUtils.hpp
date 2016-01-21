/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef QT_TESTUTILS_H
#define QT_TESTUTILS_H

// QTest reference: http://qt-project.org/doc/qt-4.7/qtest.html
// QTest reference: http://doc.qt.digia.com/4.7/qtestlib-manual.html

#include <iostream>
#include <ctime>

#include <QTest>
#include <QDebug>

#include <qt_TestSupport.hpp>
#include <segvcatch.h>

#include <csignal>
#include <sstream>
#include <cassert>

///
/// constants
///

//static const char* C_RED_BEG = "\033[1;31m";
//static const char* C_RED_END = "\033[0m";
//static const char* C_GRE_BEG = "\033[1;32m";
//static const char* C_GRE_END = "\033[0m";

///
/// test generic actions
///

namespace tug{

///
/// launch and destroy panels //////////////////////////////////////////////////
///

///
/// \brief panel_launch launches a panel/window object
/// \param panel
///
inline void panel_launch(QWidget* panel){
    if (panel == 0)
        QFAIL("(qt_TestUtils) panel pointer is NULL");
    panel->show();

#if QT_VERSION >= 0x050000
    QTest::qWaitForWindowActive(panel);
#else
    QTest::qWaitForWindowShown(panel);
#endif


}

///
inline void panel_launch(QWidget& panel){
    panel_launch(&panel);
}

///
/// \brief panel_destroy deletes a panel/window object
/// \param panel
///
inline void panel_destroy(QWidget* panel){
    if (panel == 0)
        QFAIL("(qt_TestUtils) panel pointer is NULL");
    panel->hide();
    delete panel;
}

///
inline void panel_destroy(QWidget& panel){
    panel.hide();
}

///
/// assertions /////////////////////////////////////////////////////////////////
///

/*inline void assert_msg(bool expr, char* text_id){
    if(expr)
        std::cout << C_GRE_BEG << "Testing '" << text_id << "': OK" << C_GRE_END <<  std::endl;
    else
        std::cout << C_RED_BEG << "Testing '// (optional) This macro executes 'action' after 'ms' milliseconds
#define t_DELAYED(action,ms) \
    QTest::qSleep(ms); \
    action;" << text_id << "': FAILED" << C_RED_END << std::endl;
}*/

///
/// \brief assert_expr checks a boolean expression
/// \param expr
///
inline void assert_expr(bool expr){
    QVERIFY(expr);
}

///
/// \brief assert_expr_msg checks a boolean expression and displays 'a message'msg' if error
/// \param expr
///
inline void assert_expr_msg(bool expr, const char* msg){
    QVERIFY2(expr,msg);
}

///
/// \brief warning prints a warning message in a test
/// \param msg
///
inline void warning(const char* msg){
    QWARN(msg);
}

///
/// \brief fail simulates an error in a test
/// \param msg
///
inline void fail(const char* msg){
    QFAIL(msg);
}

///
/// \brief compare compares 2 values to be the same
/// \param actual, expected
///
template<typename T>
void compare(T current, T expected)
{
    QCOMPARE(current,expected);
}


///
/// update/repaint panels //////////////////////////////////////////////////////
///

///
/// \brief panel_repaint repaints a panel
/// \param panel
///
inline void panel_repaint(QWidget* panel){
    if (panel == 0)
        QFAIL("(qt_TestUtils) panel pointer is NULL");
    panel->repaint();
    qApp->processEvents();//force
}

///
inline void panel_repaint(QWidget& panel){
    panel_repaint(&panel);
}

///
/// \brief panel_blink hides and shows a panel. It forces repaint and update of
/// all widgets int he panel
/// \param panel
///
inline void panel_blink(QWidget* panel){
    if (panel == 0)
        QFAIL("(qt_TestUtils) panel pointer is NULL");
    panel->hide();
    panel->show();

#if QT_VERSION >= 0x050000
    QTest::qWaitForWindowActive(panel);
#else
    QTest::qWaitForWindowShown(panel);
#endif
}

///
inline void panel_blink(QWidget& panel){
    panel_blink(&panel);
}

///
/// sleeps /////////////////////////////////////////////////////////////////////
///

///
/// \brief sleep sleeps 'ms' milliseconds
/// \param ms
///
inline void sleep(int ms){
    QTest::qSleep(ms);
}

///
/// \brief sleep1 sleeps 1 second
///
inline void sleep1(){
    QTest::qSleep(1000);
}

///
/// \brief sleep2 sleeps 2 second
///
inline void sleep2(){
    QTest::qSleep(2000);
}

///
/// \brief sleep3 sleeps 3 second
///
inline void sleep3(){
    QTest::qSleep(3000);
}

///
/// \brief sleep5 sleeps 5 second
///
inline void sleep5(){
    QTest::qSleep(5000);
}

///
/// random values //////////////////////////////////////////////////////////////
///

///
/// \brief random_reset resets random numbers generator
///
inline void random_reset(){
    qsrand(std::time(0));
}

///
/// \brief random generates a random number between 0 and 'n'
/// \param n
/// \return
///
inline int random(int n){
    return qrand() % n;
}

///
/// \brief random_in_range generates a random number between 'low' and 'high'
/// \param low
/// \param high
/// \return
///
inline int random_in_range(int low, int high){
    return qrand() % ((high + 1) - low) + low;
}

///
/// \brief random_bool generates true or false randomly
/// \return
///
inline bool random_bool(){
    return static_cast<bool>(qrand() % 2);
}

///
/// timers ///////////////////////////////////////////////////////////////////
///


static QElapsedTimer timer;

///
/// \brief starts timer
///
inline void timer_start(){
    timer.start();
}

///
/// \brief returns milliseconds elapsed from last call to timer_start
/// \return
///
inline long timer_elapsed_ms(){
    return (long)timer.elapsed();
}




///
/// log ////////////////////////////////////////////////////////////////////////
///

///
/// \brief log adds a log line to a test
/// \param s
///
inline void log(const char* s){
    //std::cout << text_id << std::endl;
    qDebug("%s",s);
}

///
/// \brief log
/// \return returns qDebug stream
///
inline QDebug log(){
    return qDebug();
    //QDebug(QtDebugMsg);
}

///
/// signals ///////////////////////////////////////////////////////////////////
///


inline void signal_connect(void(*handler)(int)){
    //signal(SIGSEGV, handler);//SIGSEGV      11       Core    Invalid memory reference
    //signal(SIGFPE, handler);//SIGFPE        8       Core    Floating point exception

#ifndef __MINGW32__
    signal(SIGCONT, handler);//
    signal(SIGQUIT, handler);//SIGQUIT       3       Core    Quit from keyboard
    signal(SIGTERM, handler);//
#endif
    //signal(SIGCHLD, handler);//
    signal(SIGINT, handler);//SIGINT        2       Term    Interrupt from keyboard
    signal(SIGILL, handler);//SIGILL        4       Core    Illegal Instruction
    signal(SIGABRT, handler);//SIGABRT       6       Core    Abort signal from abort(3)

    //signal(SIGKILL, handler);//SIGKILL       9       Term    Kill signal
    //signal(SIGSTOP, handler);//
}

inline void signal_handle(int signal){
    std::stringstream str;
    str << "TUG: System signal catched: " << signal << ". "<< std::endl;
    tug::log() << str.str().c_str();
    QFAIL(str.str().c_str());
}

inline void signal_handling(){
    signal_connect(signal_handle);
}

///
/// \brief segfault simulates a segmentation fault
///
inline void signal_segfault(){
    int* p = NULL;
    *p = 13;
}

///
/// \brief signal_zerodivision
///
inline void signal_zerodivision(){
    int a = 1;
    int b = 0;
    a = a/b;
}

///
/// \brief signal_raise
/// \param signal
///
inline void signal_raise(int signal){
    raise(signal);
}


///
/// ranges /////////////////////////////////////////////////////////////////////
///

template <typename T>
class CallerBase
{
public:
    virtual void call(T val) = 0;
};

template <typename Q, typename C, typename T>
class ObjCaller : public CallerBase<T>
{
private:
    Q (C::*_ppp)(T);
    C* _c;

public:
    ObjCaller(C* c, Q (C::*ppp)(T)) : _ppp(ppp), _c(c)
    {
    }

    virtual void call(T val)
    {
        (_c->*_ppp)(val);
    }
};

template <typename Q, typename C, typename T>
class ObjCallerVoid : public CallerBase<T>
{
private:
    Q (C::*_ppp)();
    C* _c;

public:
    ObjCallerVoid(C* c, Q (C::*ppp)()) : _ppp(ppp), _c(c)
    {
    }

    virtual void call(T val)
    {
        (_c->*_ppp)();
    }
};

///
/// \brief The ForRange class
/// Executes a range of values allowing to call functions having such a value
/// as unique parameter.
///
template <typename T>
class ForRange
{
public:

    ForRange(T l, T u) : _lower(l), _upper(u)
    {
        _inc = static_cast<T>(1);
        _sleep = 0;
        _repaint_w = NULL;
    }

    ForRange& increment(T inc){
        _inc = inc;
        return *this;
    }

    ForRange& sleep_ms(int s){
        _sleep = s;
        return *this;
    }

    ForRange& repaint(QWidget* w){
        _repaint_w = w;
        return *this;
    }

    template<typename C>
    ForRange& call(C* c, void (C::*fp)(T)){
        _calls_regular_vector.push_back(new ObjCaller<void, C, T>(c, fp ));
        return *this;
    }

    //template<typename C>
    //ForRange& call_inverse(C* c, void (C::*fp)(T)){
    //    _calls_inverse_vector.push_back(new ObjCaller<void, C, T>(c, fp ));
    //    return *this;
    //}

    template<typename C>
    ForRange& call_void(C* c, void (C::*fp)()){
        _calls_void_vector.push_back(new ObjCallerVoid<void, C, T>(c, fp ));
        return *this;
    }

    virtual void run()
    {
        typename std::vector<CallerBase<T>*>::iterator it;
        for (T i = _lower; i <= _upper; i += _inc){
            //
            for (it = _calls_regular_vector.begin(); it != _calls_regular_vector.end(); ++it){
                (*it)->call(i);
            }
            //
            //for (it = _calls_inverse_vector.begin(); it != _calls_inverse_vector.end(); ++it){
            //    (*it)->call(_upper - i);
            //}
            //
            for (it = _calls_void_vector.begin(); it != _calls_void_vector.end(); ++it){
                (*it)->call(0);
            }
            //
            _postrun();
        }
    }

protected:

    virtual void _postrun()
    {
        if (_repaint_w != NULL)
            tug::panel_repaint(_repaint_w);
        //
        if (_sleep > 0) tug::sleep(_sleep);
    }

protected:
    T _lower;
    T _upper;
    T _inc;
    int _sleep;
    QWidget* _repaint_w;
    std::vector<CallerBase<T>* > _calls_regular_vector;
    //std::vector<CallerBase<T>* > _calls_inverse_vector;
    std::vector<CallerBase<T>* > _calls_void_vector;
};

///
/// \brief The ForNestedRange class
/// Executes two value ranges, one nested into another. It allows to call
/// functions in both ranges, and having such a value as unique parameter.
///
template <typename T>
class ForNestedRange : public ForRange<T>
{
public:

    ForNestedRange(T l, T u, T li, T ui) : ForRange<T>(l,u),
        _lower_nested(li), _upper_nested(ui)
    {
    }

    template<typename C>
    ForNestedRange& call(C* c, void (C::*fp)(T)){
        ForRange<T>::call(c,fp);
        return *this;
    }

    template<typename C>
    ForNestedRange& call_void(C* c, void (C::*fp)()){
        ForRange<T>::call_void(c,fp);
        return *this;
    }

    template<typename C>
    ForNestedRange& call_inner(C* c, void (C::*fp)(T)){
        _calls_inner_vector.push_back(new ObjCaller<void, C, T>(c, fp ));
        return *this;
    }

    virtual void run()
    {
        typename std::vector<CallerBase<T>* >::iterator it;
        for (T i = ForRange<T>::_lower; i <= ForRange<T>::_upper; i += ForRange<T>::_inc){
            for (T j = _lower_nested; j <= _upper_nested; j += ForRange<T>::_inc){
                //
                for (it = ForRange<T>::_calls_regular_vector.begin(); it != ForRange<T>::_calls_regular_vector.end(); ++it){
                    (*it)->call(i);
                }
                //
                for (it = _calls_inner_vector.begin(); it != _calls_inner_vector.end(); ++it){
                    (*it)->call(j);
                }
                //
                for (it = ForRange<T>::_calls_void_vector.begin(); it != ForRange<T>::_calls_void_vector.end(); ++it){
                    (*it)->call(0);
                }
                //
                ForRange<T>::_postrun();
            }
        }
    }

protected:
    T _lower_nested;
    T _upper_nested;
    std::vector<CallerBase<T>* > _calls_inner_vector;
};

}// end namespace "tug"


///
/// tests: value ranges MACROS /////////////////////////////////////////////////
///

/// This macro repeates a code 'n' times. Additionally, values from 0 to 'n-1'
/// are generated.
/// 'value' is the name of the variable to be used.
#define tug__REPEAT(n) \
    for (int value = 0; value < n; value++)

/// This macro simulates an integer range between 'min' and 'max', both
/// included.
/// 'value' is the name of the variable to be used.
#define tug__INT_RANGE(min,max) \
    for (int value = min; value <= max; value++)

/// This macro simulates an integer range between 'min' and 'max', both
/// included, using 'inc' as increment.
/// 'value' is the name of the variable to be used.
#define tug__INT_RANGE_INC(min,max,inc) \
    for (int value = min; value <= max; value += inc)

/// This macro simulates a float range between 'min' and 'max', both
/// included, using 'inc' as increment.
/// 'value' is the name of the variable to be used.
#define tug__FLOAT_RANGE(min,max,inc) \
    for (float value = min; value <= max; value += inc)

/// This macro executes a code 'n' iterations.
/// At each iteration 'value' holds a random value between 0 and 'random_limit'.
/// 'value' is the name of the variable to be used.
#define tug__RANDOM_INT_SET(n,random_limit) \
    int value = 0; \
    for (int j = 0; j < n; j++, value = tug::random(random_limit))

/// This macro executes a code 'n' iterations.
/// At each iteration 'value' holds a random value true or false.
/// 'value' is the name of the variable to be used.
#define tug__RANDOM_BOOL_SET(n) \
    bool value = 0; \
    for (int j = 0; j < n; j++, value = tug::random_bool())


///
/// tests: other MACROS ////////////////////////////////////////////////////////
///

/// This macro executes 'action' after 'ms' milliseconds.
/// 'action' is the code to be executed.
/// 'ms' are the milliseconds to wait before executing 'action'.
#define tug__DELAYED(action,ms) \
    QTest::qSleep(ms); \
    action;


#endif // QT_TESTUTILS_H
