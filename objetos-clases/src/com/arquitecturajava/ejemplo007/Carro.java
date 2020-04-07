package com.arquitecturajava.ejemplo007;

public class Carro {

  private String marca;

  private String modelo;

  //la variable pertenece a la clase, no al objeto
  private static int contador;

  //Delegacion de contructores
  Carro() {
    //This siempre debe ser la primera linea del codigo
    this("Mazda", "CX-3");
  }

  Carro(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    this.contador++;
  }

  //Esto es un metodo de clase
  public static int getContador() {
    return contador;
  }

  //Esto es un metodo de instancia
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
