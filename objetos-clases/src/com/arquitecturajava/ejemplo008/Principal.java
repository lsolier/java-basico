package com.arquitecturajava.ejemplo008;

public class Principal {

  public static void main(String[] args) {
    Circulo circulo2 = new Circulo();
    circulo2.setRadio(2);
    System.out.println(circulo2.getArea());

    System.out.println(Circulo.getArea(2));
  }
}
