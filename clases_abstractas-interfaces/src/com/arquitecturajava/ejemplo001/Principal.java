package com.arquitecturajava.ejemplo001;

public class Principal {

  public static void main(String[] args) {
    Moto miMoto = new Moto("Yamaha");
    Carro miCarro = new Carro("Chevrolet");
    Camion miCamion = new Camion("Volvo");

    acelerar(miMoto);
    acelerar(miCarro);
    acelerar(miCamion);

    miMoto.pagarImpuesto();
    miCarro.pagarImpuesto();
    miCamion.pagarImpuesto();
  }

  public static void acelerar(Vehiculo miVehiculo) {
    miVehiculo.acelerar();
  }
}
