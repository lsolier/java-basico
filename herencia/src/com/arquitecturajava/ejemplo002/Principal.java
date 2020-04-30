package com.arquitecturajava.ejemplo002;

public class Principal {

  public static void main(String[] args) {
    Deportista deportista = new Deportista();
    deportista.setNombre("Ronaldinho");
    deportista.setDeporte("Futbol");

    deportista.andar();

    Persona persona = new Persona();
    persona.setNombre("Luis");
    persona.andar();
  }
}
