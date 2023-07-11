package Entidad;

import java.util.Random;

public class Meses {
  Random rand = new Random();

  private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
  "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
  private String mesSecreto = meses[rand.nextInt(12)+1];

  
  public Meses() {
  }

  public Meses(String[] meses, String mesSecreto) {
    this.meses = meses;
    this.mesSecreto = mesSecreto;
  }

  public String[] getMeses() {
    return meses;
  }

  public void setMeses(String[] meses) {
    this.meses = meses;
  }

  public String getMesSecreto() {
    return mesSecreto;
  }

  public void setMesSecreto(String mesSecreto) {
    this.mesSecreto = mesSecreto;
  }

  

}