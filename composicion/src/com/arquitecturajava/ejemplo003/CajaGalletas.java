package com.arquitecturajava.ejemplo003;

import java.util.ArrayList;
import java.util.List;

public class CajaGalletas {

  List<Galleta> galletas;

  public CajaGalletas() {
    galletas = new ArrayList<>();
  }

  public List<Galleta> getGalletas() {
    return galletas;
  }

  public void setGalletas(List<Galleta> cajaGalletas) {
    this.galletas = cajaGalletas;
  }

  public void addGalleta(Galleta galleta) {
    galletas.add(galleta);
  }

  public void addGalleta(String sabor, double precio) {
    galletas.add(new Galleta(sabor, precio));
  }

  public int totalGalletas() {
    return galletas.size();
  }

  public double precioTotal() {
    double total = 0;
    for (Galleta galleta : galletas) {
      total = total + galleta.getPrecio();
    }
    return total + 1;
  }
}
