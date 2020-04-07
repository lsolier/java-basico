package com.arquitecturajava.ejemplo006;

public class Carro {

  private String marca;

  private String modelo;

  //Delegacion de contructores
  Carro() {
    //This siempre debe ser la primera linea del codigo
    this("Mazda", "CX-3");
  }

  Carro(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
}
