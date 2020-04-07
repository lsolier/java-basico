package com.arquitecturajava.ejemplo004;

public class Carro {

  private String modelo;

  private String marca;

  public Carro() {

  }

  public Carro(String marca) {
    this.marca = marca;
    this.modelo = "Sedan";
  }

  public Carro(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }
}
