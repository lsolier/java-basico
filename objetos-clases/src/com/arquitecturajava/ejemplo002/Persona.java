package com.arquitecturajava.ejemplo002;

public class Persona {

  private String nombre;

  private int edad;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setEdad(int edad) {
    if(edad > 120) {
      this.edad = 120;
    } else {
      this.edad = edad;
    }
  }

  public int getEdad() {
    return edad;
  }
}
