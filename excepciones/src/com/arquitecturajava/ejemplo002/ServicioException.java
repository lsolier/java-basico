package com.arquitecturajava.ejemplo002;

public class ServicioException extends Exception {

  public ServicioException() {
    super();
  }

  public ServicioException(String s) {
    super(s);
  }

  public ServicioException(String s, Throwable throwable) {
    super(s, throwable);
  }

  public ServicioException(Throwable throwable) {
    super(throwable);
  }

  protected ServicioException(String s, Throwable throwable, boolean b, boolean b1) {
    super(s, throwable, b, b1);
  }
}
