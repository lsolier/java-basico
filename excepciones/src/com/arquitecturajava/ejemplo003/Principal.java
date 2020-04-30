package com.arquitecturajava.ejemplo003;

import java.util.Objects;

public class Principal {

  public static void main(String[] args) {

    //TODO se esta corrigiendo el error de excepcion no chequeada
    Persona persona = null;

    if (Objects.nonNull(persona)) {
      System.out.println(persona.getNombre());
    }

  }
}
