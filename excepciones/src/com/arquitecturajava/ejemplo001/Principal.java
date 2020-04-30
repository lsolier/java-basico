package com.arquitecturajava.ejemplo001;

public class Principal {

  public static void main(String[] args) {

    try {
      Servicio.miMetodo();
    } catch (Exception e) {
      System.out.println("Ha llegado un error: " + e);
    }
  }
}
