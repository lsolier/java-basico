package com.arquitecturajava.ejemplo002;

public abstract class Brazo {

  private String tipoAspa;

  public abstract void girar();

  public String getTipoAspa() {
    return tipoAspa;
  }

  public void setTipoAspa(String tipoAspa) {
    this.tipoAspa = tipoAspa;
  }

}
