package com.arquitecturajava.ejemplo007;

public class Principal {

  public static void main(String[] args) {
    //Delegacion de constructures
    Carro carro1 = new Carro();
    Carro carro4 = new Carro();

    System.out.println(Carro.getContador());
  }
}
