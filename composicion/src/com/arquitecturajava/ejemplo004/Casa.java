package com.arquitecturajava.ejemplo004;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Casa {

  private String direccion;

  private List<Persona> personas;

  public Casa(String direccion) {
    super();
    this.direccion = direccion;
    this.personas = new ArrayList<>();
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  //Generacion de metodos delegados
  public boolean contains(Object o) {
    return personas.contains(o);
  }

  public boolean add(Persona persona) {
    return personas.add(persona);
  }

  public int totalPersona() {
    return personas.size();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Casa casa = (Casa) o;
    return direccion.equals(casa.direccion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direccion);
  }
}
