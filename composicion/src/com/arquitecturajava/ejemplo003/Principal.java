package com.arquitecturajava.ejemplo003;

import com.arquitecturajava.ejemplo002.Sobre;

public class Principal {

  public static void main(String[] args) {
    //Ejemplo de relacion 1 a N
    CajaGalletas miCaja = new CajaGalletas();
    miCaja.addGalleta(new Galleta("chocolate", 1.5));
    miCaja.addGalleta(new Galleta("naranja", 1.2));
    miCaja.addGalleta(new Galleta("naranja", 1.2));
    miCaja.addGalleta(new Galleta("naranja", 1.2));
    miCaja.addGalleta("vainilla", 1.40);
    System.out.println(miCaja.totalGalletas());
    System.out.println(miCaja.precioTotal());
  }
}
