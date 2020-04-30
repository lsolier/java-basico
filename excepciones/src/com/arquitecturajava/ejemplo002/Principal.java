package com.arquitecturajava.ejemplo002;

public class Principal {

  public static void main(String[] args) {

    try {
      Servicio.miMetodo();
    } catch (Exception e) {
      System.out.println("Ha llegado un error: " + e);
      System.out.println("Error causante: " + e.getCause().getMessage());
    }
  }
}
