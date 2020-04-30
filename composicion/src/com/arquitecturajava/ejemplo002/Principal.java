package com.arquitecturajava.ejemplo002;

public class Principal {

  public static void main(String[] args) {

    //Ejemplo de relacion de 1 a 1
    Sobre sobre =  new Sobre("azul", "chocolate", 2.14);
    System.out.println(sobre.getColor());
    System.out.println(sobre.getSabor());
    System.out.println(sobre.getPrecio());
  }
}
