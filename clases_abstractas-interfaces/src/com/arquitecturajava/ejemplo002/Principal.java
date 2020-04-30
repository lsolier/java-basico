package com.arquitecturajava.ejemplo002;

public class Principal {

  public static void main(String[] args) {
    Brazo brazoNormal = new BrazoNormal();
    Brazo brazoRapido = new BrazoRapido();
    Brazo coctelera = new Coctelera();

    Robot robot = new Robot();
    robot.setBrazo(brazoNormal);
    robot.girarBrazo();

    robot.setBrazo(brazoRapido);
    robot.girarBrazo();

    robot.setBrazo(coctelera);
    robot.girarBrazo();

    //TODO En este ejemplo vemos que la coctelera no es un brazo, por lo tanto no es correcto
    //TODO aplicar herencia (clase abstracta), seria mucho mejor utilizar una interfaz

  }
}
