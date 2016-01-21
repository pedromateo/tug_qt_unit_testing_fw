#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include "ui_mainwindow.h"

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);

protected:
    void changeEvent(QEvent *e);

private slots:
    void on_pb_login_clicked();

protected: //this must be accesible from subclasses
    Ui::MainWindow ui;
};

#endif // MAINWINDOW_H
