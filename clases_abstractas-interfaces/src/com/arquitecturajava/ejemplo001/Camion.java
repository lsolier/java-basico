package com.arquitecturajava.ejemplo001;

public class Camion extends Vehiculo {

  public Camion(String marca) {
    super(marca);
  }

  @Override
  public void acelerar() {
    System.out.println("El camion acelera");
  }

}
