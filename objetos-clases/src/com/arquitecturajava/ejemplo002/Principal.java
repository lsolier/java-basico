package com.arquitecturajava.ejemplo002;

public class Principal {

  public static void main(String[] args) {
    //TODO con la encapsulacion podemos controlar los valores que se pueden asignar a un atributo

    Persona persona1 = new Persona();
    persona1.setNombre("Luis Solier");
    persona1.setEdad(1222);

    System.out.println("Edad: " + persona1.getEdad());
  }
}
