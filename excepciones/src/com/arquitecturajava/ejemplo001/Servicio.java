package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servicio {

  public static void miMetodo() throws Exception{
    try {
      File file = new File("f:/home/debluisoli/Documents/hola.txt");
      file.createNewFile();
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
      Date myDate = dateFormat.parse("13/03-2020");
      System.out.println(myDate);
    } catch (IOException | ParseException ex) {
      ex.printStackTrace();
      throw ex;
    } finally {
      System.out.println("Cerrando todos los recursos");
    }
  }

}
