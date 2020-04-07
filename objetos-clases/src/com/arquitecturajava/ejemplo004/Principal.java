package com.arquitecturajava.ejemplo004;

public class Principal {

  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.setMarca("Toyota");
    carro.setModelo("Yaris");
    System.out.println(carro.getModelo());
    System.out.println(carro.getMarca());

    Carro carro2 = new Carro("Chevrolet", "Camaro");
    System.out.println(carro2.getModelo());
    System.out.println(carro2.getMarca());

    Carro carro3 = new Carro("Nissan");
    System.out.println(carro3.getModelo());
    System.out.println(carro3.getMarca());
  }
}
