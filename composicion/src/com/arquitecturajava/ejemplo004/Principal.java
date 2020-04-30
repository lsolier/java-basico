package com.arquitecturajava.ejemplo004;

public class Principal {

  public static void main(String[] args) {
    //Ejemplo de relacion N a N

    Casa casa = new Casa("Calle lorus 260");
    Persona persona = new Persona("Luis Solier");
    Persona persona2 = new Persona("Diana");
    Persona persona3 = new Persona("Maycol");
    Persona persona4 = new Persona("Nick");
    casa.add(persona);
    casa.add(persona2);
    casa.add(persona3);
    casa.add(persona4);
    System.out.println(casa.contains(new Persona("Luis Solier")));
    System.out.println("Total personas: " + casa.totalPersona());

    persona.add(casa);
    System.out.println(persona.contains(new Casa("Calle lorus 260")));
  }
}
