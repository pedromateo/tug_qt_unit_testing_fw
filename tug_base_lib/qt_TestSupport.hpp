/*
 * TUG framework: GUI Unit Testing for Qt applications
 * Copyright (c) Pedro Mateo (www.pedromateo.es), All rights reserved.
 *
 * Redistributed under LGPL 3.0 license terms.
*/

#ifndef QT_TESTSUPPORT_HPP
#define QT_TESTSUPPORT_HPP

#include <iostream>
#include <ctime>

#include <QTest>

#include <QSpinBox>
#include <QDoubleSpinBox>
#include <QComboBox>
#include <QPushButton>
#include <QToolButton>
#include <QLineEdit>
#include <QTextEdit>
#include <QPlainTextEdit>
#include <QRadioButton>
#include <QCommandLinkButton>
#include <QDialogButtonBox>
#include <QDial>
#include <QSlider>
#include <QProgressBar>
#include <QLabel>
#include <QCheckBox>
#include <QDateTimeEdit>
#include <QTimeEdit>
#include <QDateEdit>
#include <QTabWidget>
#include <QTableWidget>


/// ////////////////////////////////////////////////////////
///
/// Qt widgets manipulation methods
///
/// ////////////////////////////////////////////////////////

namespace qt_test{

///
/// QSpinBox
///

static inline void setValue(QSpinBox* sb, int value){
    sb->setValue(value);
}

static inline int getValue(QSpinBox* sb){
    return sb->value();
}

///
/// QDoubleSpinBox
///

static inline void setValue(QDoubleSpinBox* dsb, double value){
    dsb->setValue(value);
}

static inline double getValue(QDoubleSpinBox* sb){
    return sb->value();
}


///
/// QComboBox
///

static inline void setIndex(QComboBox* cb, int value){
    cb->setCurrentIndex(value);
}

static inline int getIndex(QComboBox* cb){
    return cb->currentIndex();
}

///
/// QPushButton
///


static inline void doLeftClick(QPushButton* pb){
    QTest::mouseClick (pb, Qt::LeftButton);
}

///
/// QToolButton
///


static inline void doLeftClick(QToolButton* tb){
    QTest::mouseClick(tb, Qt::LeftButton);
}

///
/// QRadioButton
///

static inline void setChecked(QRadioButton* rb, bool v){
    rb->setChecked(v);
}

static inline bool isChecked(QRadioButton* rb){
    return rb->isChecked();
}


///
/// QCommandLinkButton
///


static inline void doLeftClick(QCommandLinkButton* b){
    QTest::mouseClick(b, Qt::LeftButton);
}


///
/// QLineEdit
///

static inline void setText(QLineEdit* le, const std::string& s){
    le->setText(s.c_str());
}

static inline const std::string getText(QLineEdit* le){
    return le->text().toStdString();
}

///
/// QTextEdit
///

static inline void setText(QTextEdit* te, const std::string& s){
    te->setText(s.c_str());
}

static inline const std::string getText(QTextEdit* t){
    return t->toPlainText().toStdString();
}

///
/// QPlainTextEdit
///

static inline void setText(QPlainTextEdit* pte, const std::string& s){
    pte->setPlainText(s.c_str());
}

static inline const std::string getText(QPlainTextEdit* t){
    return t->toPlainText().toStdString();
}

///
/// QDial
///

static inline void setValue(QDial* d, int value){
    d->setSliderPosition(value);
}

static inline int getValue(QDial* d){
    return d->sliderPosition();
}

///
/// QSlider
///

static inline void setValue(QSlider* s, int value){
    s->setSliderPosition(value);
}

static inline int getValue(QSlider* s){
    return s->sliderPosition();
}

///
/// QProgressBar
///

static inline void setValue(QProgressBar* pb, int value){
    pb->setValue(value);
}

static inline int getValue(QProgressBar* pb){
    return pb->value();
}

///
/// QLabel
///

static inline void setText(QLabel* l, const std::string& s){
    l->setText(s.c_str());
}

static inline const std::string getText(QLabel* l){
    return l->text().toStdString();
}

///
/// QCheckBox
///

static inline void setChecked(QCheckBox* cb, bool v){
    cb->setChecked(v);
}

static inline bool isChecked(QCheckBox* cb){
    return cb->isChecked();
}

///
/// QDateTimeEdit
///

static inline void setDate(QDateTimeEdit* dte, int year, int month, int day){
    dte->setDate(QDate(year, month, day));
}

static inline QDate getDate(QDateTimeEdit* dte){
    return dte->date();
}

static inline void setTime(QDateTimeEdit* dte, int h, int m, int s = 0, int ms = 0 ){
    dte->setTime(QTime(h,m,s,ms));
}

static inline QTime getTime(QDateTimeEdit* dte){
    return dte->time();
}

///
/// QDateEdit
///

static inline void setDate(QDateEdit* de, int year, int month, int day){
    de->setDate(QDate(year, month, day));
}

static inline QDate getDate(QDateEdit* de){
    return de->date();
}

///
/// QTimeEdit
///

static inline void setTime(QTimeEdit* te, int h, int m, int s = 0, int ms = 0 ){
    te->setTime(QTime(h,m,s,ms));
}

static inline QTime getTime(QTimeEdit* te){
    return te->time();
}

///
/// QTabWidget
///

static inline void setIndex(QTabWidget* tw, int index){
    tw->setCurrentIndex(index);
}

static inline int getIndex(QTabWidget* tw){
    return tw->currentIndex();
}


///
/// QTableView
///

static inline void selectCell (QTableView* tv, int row, int column ){
    tv->selectRow(row);
    tv->selectColumn(column);
}

static inline bool isCellSelected (QTableView* tv, int row, int column ){
    QModelIndexList indexes = tv->selectionModel()->selection().indexes();
    for (int i = 0; i < indexes.count(); ++i)
    {
        if (indexes.at(i).row() == row && indexes.at(i).column() == column)
            return true;
    }
    return false;
}

static inline QAbstractItemModel* getModel(QTableView* tv){
    return tv->model();
}

///
/// QTableWidget (should inherit from QTableView)
///

static inline void selectCell (QTableWidget* tw, int row, int column ){
    tw->setCurrentCell(row,column);
}

static inline bool isCellSelected (QTableWidget* tw, int row, int column ){
    return tw->currentRow() == row && tw->currentColumn() == column;
}


}// end namespace

#endif // QT_TESTSUPPORT_HPP
