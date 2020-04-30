package com.arquitecturajava.ejemplo001;

public class Principal {

  public static void main(String[] args) {
    Deportista deportista = new Deportista();
    deportista.setNombre("Ronaldinho");
    deportista.setDeporte("Futbol");

    System.out.println(deportista.getNombre());
    System.out.println(deportista.getDeporte());
  }
}
