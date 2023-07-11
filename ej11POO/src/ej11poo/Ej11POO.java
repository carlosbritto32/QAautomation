/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ej11POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, anio, diferencia;
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un dia, mes y año en numero");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt() - 1900;
        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        diferencia = fechaActual.getYear() - fecha.getYear();
        System.out.println("La diferencia de los años es: " + diferencia);
    }
    
}
