package com.arquitecturajava.ejemplo005.negocio;

public class Deportista extends Persona {

  private String deporte;

  public Deportista(String nombre) {
    super(nombre);
  }

  public String getDeporte() {
    return deporte;
  }

  public void setDeporte(String deporte) {
    this.deporte = deporte;
  }

  @Override
  public void andar() {
    //super se utiliza para invocar metodos de la clase padre
    super.imprimirTextoAndar();
    System.out.println("10 km/h");
  }
}
