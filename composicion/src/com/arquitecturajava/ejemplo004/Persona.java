package com.arquitecturajava.ejemplo004;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {

  private String nombre;

  private List<Casa> casas;

  public Persona(String nombre) {
    super();
    this.nombre = nombre;
    this.casas = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean contains(Object o) {
    return casas.contains(o);
  }

  public boolean add(Casa casa) {
    return casas.add(casa);
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
