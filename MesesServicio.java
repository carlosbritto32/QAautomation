package Servicio;

import java.util.Scanner;

import Entidad.Meses;

public class MesesServicio {
  
  Scanner scan = new Scanner(System.in);
  
  Meses meses = new Meses();

  public void adivinar() {
    String mesIngresado;
    
    do {
      System.out.println("Adivinar mes secreto: ");
      mesIngresado = scan.next();
      if(!meses.getMesSecreto().equalsIgnoreCase(mesIngresado)) System.out.println("No acertaste");
    } while (!meses.getMesSecreto().equalsIgnoreCase(mesIngresado));
    
    System.out.println("Adivinaste");

  }
}
