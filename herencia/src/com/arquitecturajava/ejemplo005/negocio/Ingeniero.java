package com.arquitecturajava.ejemplo005.negocio;

public class Ingeniero extends Persona {

  public Ingeniero(String nombre) {
    super(nombre);
  }

  @Override
  public void andar() {
    //super se utiliza para invocar metodos de la clase padre
    super.imprimirTextoAndar();
    System.out.println("8 km/h");
  }

}
