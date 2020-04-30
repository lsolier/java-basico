package com.arquitecturajava.ejemplo005;

import java.util.Arrays;
import java.util.List;

public class Principal {

  public static void main(String[] args) {
    //Ejemplo de relacion Recursiva
    Persona luis = new Persona("Luis Solier");
    Persona diana = new Persona("Diana");
    Persona maycol = new Persona("Maycol");
    Persona nick = new Persona("Nick");

    luis.addHermano(diana);
    luis.addHermano(maycol);
    luis.addHermano(nick);

    List<Persona> hermanos = luis.getHermanos();
    for (Persona persona : hermanos) {
      System.out.println(persona.getNombre());
    }

  }
}
