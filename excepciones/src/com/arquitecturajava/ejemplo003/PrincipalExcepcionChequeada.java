package com.arquitecturajava.ejemplo003;

public class PrincipalExcepcionChequeada {

  public static void main(String[] args) {

    //TODO esto es una excepcion no chequeada, esto se produce cuanto el desarrollador ha
    //TODO implemenbtado incorrectamente el codigo
    Persona persona = null;

    System.out.println(persona.getNombre());

  }
}
