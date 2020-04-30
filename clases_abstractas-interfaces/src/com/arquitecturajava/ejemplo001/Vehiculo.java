package com.arquitecturajava.ejemplo001;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public abstract class Vehiculo {

  private String marca;

  public Vehiculo(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  //Todas las clases hijas deben implementarla, salvo que sean abstract
  public abstract void acelerar();

  public void pagarImpuesto() {
    System.out.println("Impuesto pagado");
  }

}
