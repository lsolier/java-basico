package com.arquitecturajava.ejemplo002;

public class Sobre {

  private String color;

  private Galleta galleta;

  public Sobre(String color, String sabor, double precio) {
    this.color = color;
    this.galleta = new Galleta(sabor, precio);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSabor() {
    return galleta.getSabor();
  }

  public double getPrecio() {
    return 0.1+this.galleta.getPrecio();
  }
}
