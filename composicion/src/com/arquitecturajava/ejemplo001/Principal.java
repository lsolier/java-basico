package com.arquitecturajava.ejemplo001;

public class Principal {

  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setNombre("Luis");

    Persona persona1 = persona;
    System.out.println(persona.hashCode());
    System.out.println(persona1.hashCode());
    System.out.println(persona1.equals(persona));

    Persona persona2 = new Persona();
    persona2.setNombre("Maycol");

    System.out.println(persona2.equals(persona));
    System.out.println(persona1);
    System.out.println(persona2);

    Persona persona3 = new Persona();
    persona3.setNombre("Luis");
    System.out.println(persona3.hashCode());
    System.out.println(persona1.equals(persona));
  }
}
