package com.arquitecturajava.ejemplo004;

public class AdaptadorBrazoAcero implements Girable {

  Rotable brazoAcero;

  public AdaptadorBrazoAcero(BrazoAcero brazoAcero) {
    super();
    this.brazoAcero = brazoAcero;
  }

  public Rotable getBrazoAcero() {
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
