package com.arquitecturajava.ejemplo001;

public class Persona {

  private String nombre;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void andar(){
    System.out.println(this.nombre + " esta caminando a 5 km/h");
  }

  @Override
  public int hashCode() {
    return this.nombre.hashCode();
  }

  @Override
  public boolean equals(Object persona) {
    Persona personaNueva = (Persona) persona;
    return personaNueva.getNombre().equals(this.getNombre());
  }
}
