package com.arquitecturajava.ejemplo003;

public class Libro {

  private String titulo;

  private int totalPaignas;

  private int paginaActual;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getTotalPaignas() {
    return totalPaignas;
  }

  public void setTotalPaignas(int totalPaignas) {
    this.totalPaignas = totalPaignas;
  }

  public int getPaginaActual() {
    return paginaActual;
  }

  public void avanzarPagina() {
    avanzarPagina(1);
  }

  public void avanzarCapitulo() {
    avanzarPagina(20);
  }

  private void avanzarPagina(int paginas) {
    paginaActual = paginaActual + paginas;
  }
}
