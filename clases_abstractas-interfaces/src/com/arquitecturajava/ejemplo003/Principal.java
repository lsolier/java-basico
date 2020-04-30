package com.arquitecturajava.ejemplo003;

import javax.naming.BinaryRefAddr;

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

  }
}
