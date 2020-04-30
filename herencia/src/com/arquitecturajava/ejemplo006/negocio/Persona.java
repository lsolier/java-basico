package com.arquitecturajava.ejemplo006.negocio;

public class Persona {

  private String nombre;

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  void imprimirTextoAndar() {
    System.out.print(getNombre() + " camina a ");
  }

  public void andar(){
    imprimirTextoAndar();
    System.out.println("5 km/h");
  }
}
