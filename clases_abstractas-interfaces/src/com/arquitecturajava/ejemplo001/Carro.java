package com.arquitecturajava.ejemplo001;

public class Carro extends Vehiculo{

  public Carro(String marca) {
    super(marca);
  }

  public void acelerar() {
    System.out.println("El carro acelera");
  }

}
