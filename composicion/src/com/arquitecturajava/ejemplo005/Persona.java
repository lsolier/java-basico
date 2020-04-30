package com.arquitecturajava.ejemplo005;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {

  private String nombre;

  private List<Persona> hermanos;

  public Persona(String nombre) {
    super();
    this.nombre = nombre;
    this.hermanos = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean addHermano(Persona persona) {
    return hermanos.add(persona);
  }

  public boolean removeHermano(Persona persona) {
    return hermanos.remove(persona);
  }

  public List<Persona> getHermanos() {
    return hermanos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Persona persona = (Persona) o;
    return Objects.equals(nombre, persona.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre);
  }
}
