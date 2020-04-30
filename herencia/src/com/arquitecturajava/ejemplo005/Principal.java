package com.arquitecturajava.ejemplo005;

import com.arquitecturajava.ejemplo005.negocio.Deportista;
import com.arquitecturajava.ejemplo005.negocio.Ingeniero;
import com.arquitecturajava.ejemplo005.negocio.Persona;

public class Principal {

  public static void main(String[] args) {
    Persona deportista = new Deportista("Ronaldinho");
    Persona ingeniero = new Ingeniero("Luis");
    //Polimorfismo:
    iniciarCamino(deportista);
    iniciarCamino(ingeniero);
  }

  //Oculta la jerarquia de clases completa, es decir el progrmador que usa este metodo
  //no necesita saber que existe la clase deportista e ingeniero
  private static void iniciarCamino(Persona persona) {
    persona.andar();
  }
}
