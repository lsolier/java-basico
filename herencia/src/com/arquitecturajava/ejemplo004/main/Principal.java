package com.arquitecturajava.ejemplo004.main;

import com.arquitecturajava.ejemplo004.negocio.Deportista;
import com.arquitecturajava.ejemplo004.negocio.Persona;

public class Principal {

  public static void main(String[] args) {
    Deportista deportista = new Deportista("Ronaldinho");
    deportista.andar();

    Persona persona = new Persona("Luis");
    persona.andar();
  }
}
