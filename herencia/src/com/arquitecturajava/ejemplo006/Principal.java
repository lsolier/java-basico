package com.arquitecturajava.ejemplo006;

import com.arquitecturajava.ejemplo006.negocio.Deportista;
import com.arquitecturajava.ejemplo006.negocio.Ingeniero;
import com.arquitecturajava.ejemplo006.negocio.Persona;

public class Principal {

  public static void main(String[] args) {
    Persona deportista = new Deportista("Ronaldinho");
    Persona ingeniero = new Ingeniero("Luis");
    //Polimorfismo:
    iniciarCamino(deportista);
    iniciarCamino(ingeniero);

    //Casting de objetos
    Deportista d = (Deportista) deportista;
    System.out.println(d.getDeporte());
    Ingeniero i = (Ingeniero) ingeniero;
  }

  //Oculta la jerarquia de clases completa, es decir el progrmador que usa este metodo
  //no necesita saber que existe la clase deportista e ingeniero
  private static void iniciarCamino(Persona persona) {
    persona.andar();
  }
}
