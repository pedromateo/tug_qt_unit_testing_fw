#include "mainwindow.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent)
{
    ui.setupUi(this);
}

void MainWindow::changeEvent(QEvent *e)
{
    QMainWindow::changeEvent(e);
    switch (e->type()) {
    case QEvent::LanguageChange:
        ui.retranslateUi(this);
        break;
    default:
        break;
    }
}

void MainWindow::on_pb_login_clicked()
{
    if (ui.le_username->text() == ui.le_password->text())
        ui.lbl_status->setText("Login successful!");
    else
        ui.lbl_status->setText("Error when login. User name or password is wrong.");
}
