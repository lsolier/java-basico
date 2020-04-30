package com.arquitecturajava.ejemplo004;

public class Robot {

  private Girable brazo;

  public Girable getBrazo() {
    return brazo;
  }

  public void setBrazo(Girable brazo) {
    this.brazo = brazo;
  }

  public void girarBrazo() {
    this.brazo.girar();
  }
}
