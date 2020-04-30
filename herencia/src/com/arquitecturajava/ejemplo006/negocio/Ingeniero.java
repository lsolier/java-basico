package com.arquitecturajava.ejemplo006.negocio;

public class Ingeniero extends Persona {

  private String carrer;

  public Ingeniero(String nombre) {
    super(nombre);
  }

  public void setCarrer(String carrer) {
    this.carrer = carrer;
  }

  public String getCarrer() {
    return this.carrer;
  }

  @Override
  public void andar() {
    //super se utiliza para invocar metodos de la clase padre
    super.imprimirTextoAndar();
    System.out.println("8 km/h");
  }

}
