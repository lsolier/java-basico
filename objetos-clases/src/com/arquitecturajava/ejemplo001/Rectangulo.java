package com.arquitecturajava.ejemplo001;

public class Rectangulo {

  private double lado1;

  private double lado2;

  private double area;

  public void setLado1(double lado1) {
    this.lado1 = lado1;
  }

  public double getLado1() {
    return lado1;
  }

  public void setLado2(double lado2) {
    this.lado2 = lado2;
  }

  public double getLado2() {
    return lado2;
  }

  public double getArea() {
    return lado1 * lado2;
  }

  public double getPerimetro() {
    return lado1*2 + lado2*2;
  }

}
