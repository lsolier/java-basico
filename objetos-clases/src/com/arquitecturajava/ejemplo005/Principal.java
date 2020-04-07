package com.arquitecturajava.ejemplo005;

public class Principal {

  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.setMarca("Citroen");
    carro.setModelo("C3");
    System.out.println(carro.getMarca());
  }
}
