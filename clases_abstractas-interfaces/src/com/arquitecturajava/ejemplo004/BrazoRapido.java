package com.arquitecturajava.ejemplo004;

public class BrazoRapido extends Brazo implements Girable {

  @Override
  public void girar() {
    System.out.println("El brazo rapido gira a 40 vueltas/minuto");
  }

}
