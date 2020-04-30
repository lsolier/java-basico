package com.arquitecturajava.ejemplo004;

public class Principal {

  public static void main(String[] args) {
    Girable brazoNormal = new BrazoNormal();
    Girable brazoRapido = new BrazoRapido();
    Girable coctelera = new Coctelera();

    Robot robot = new Robot();
    robot.setBrazo(brazoNormal);
    robot.girarBrazo();

    robot.setBrazo(brazoRapido);
    robot.girarBrazo();

    robot.setBrazo(coctelera);
    robot.girarBrazo();

    BrazoAcero brazoAcero = new BrazoAcero();
    AdaptadorBrazoAcero adaptadorBrazoAcero = new AdaptadorBrazoAcero(brazoAcero);
    robot.setBrazo(adaptadorBrazoAcero);
    robot.girarBrazo();

    /*TODO Utilizaremos el brazo Pro*/

    Girable brazoGirable = new BrazoNormal();
    Rotable brazoRotable = new BrazoAcero();
    RobotPro robotPro = new RobotPro();
    robotPro.setBrazo(brazoGirable);
    robotPro.setBrazoPro(brazoRotable);
    robotPro.rotarBrazoPro();
    robotPro.girarBrazo();

    Girable brazoGirable2 = new SuperBrazo();
    Rotable brazoRotable2 = new SuperBrazo();
    robotPro.setBrazo(brazoGirable2);
    robotPro.setBrazoPro(brazoRotable2);
    robotPro.rotarBrazoPro();
    robotPro.girarBrazo();

  }
}
