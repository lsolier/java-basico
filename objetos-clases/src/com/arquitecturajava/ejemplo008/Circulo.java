package com.arquitecturajava.ejemplo008;

public class Circulo {

  private double radio;

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  //Esto es un metod de instancia que delega en un metodo de Clase
  public double getArea() {
    return Circulo.getArea(this.radio);
  }

  public static double getArea(double radio) {
    return 2*Math.PI*radio;
  }
}
