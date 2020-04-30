package com.arquitecturajava.ejemplo002;

public class Robot {

  private Brazo brazo;

  public Brazo getBrazo() {
    return brazo;
  }

  public void setBrazo(Brazo brazo) {
    this.brazo = brazo;
  }

  public void girarBrazo() {
    this.brazo.girar();
  }
}
