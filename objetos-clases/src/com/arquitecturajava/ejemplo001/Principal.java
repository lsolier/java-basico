package com.arquitecturajava.ejemplo001;

public class Principal {

  public static void main(String[] args) {
    Rectangulo rectangulo1 = new Rectangulo();
    rectangulo1.setLado1(26.3);
    rectangulo1.setLado2(21);

    double area1 = rectangulo1.getArea();
    double perimetro1 = rectangulo1.getPerimetro();
    System.out.println("Area rectangulo 1: " + area1);
    System.out.println("Perimetro rectangulo 1: " + perimetro1);

    Rectangulo rectangulo2 = new Rectangulo();
    rectangulo2.setLado1(15.2);
    rectangulo2.setLado2(75);

    double area2 = rectangulo2.getArea();
    double perimetro2 = rectangulo2.getPerimetro();
    System.out.println("Area rectangulo 2: " + area2);
    System.out.println("Perimetro rectangulo 2: " + perimetro2);
  }
}
