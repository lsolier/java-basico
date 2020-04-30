package com.arquitecturajava.ejemplo003;

public class AdaptadorBrazoAcero implements Girable {

  BrazoAcero brazoAcero;

  public AdaptadorBrazoAcero(BrazoAcero brazoAcero) {
    super();
    this.brazoAcero = brazoAcero;
  }

  public BrazoAcero getBrazoAcero() {
    return brazoAcero;
  }

  public void setBrazoAcero(BrazoAcero brazoAcero) {
    this.brazoAcero = brazoAcero;
  }

  @Override
  public void girar() {
    System.out.println("Este es el metodo que adapta el brazo de acero al robot usando delegacion");
    brazoAcero.rotar();
  }

  public void x() {

  }
}
