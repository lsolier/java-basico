package com.arquitecturajava.ejemplo003;

public class Principal {

  public static void main(String[] args) {
    Libro libro = new Libro();
    libro.setTitulo("Selva mia");
    libro.setTotalPaignas(200);

    System.out.println(libro.getPaginaActual());
    libro.avanzarPagina();
    System.out.println(libro.getPaginaActual());
    libro.avanzarCapitulo();
    System.out.println(libro.getPaginaActual());
  }
}
