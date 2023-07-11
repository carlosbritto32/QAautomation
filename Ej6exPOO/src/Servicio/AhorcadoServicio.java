/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ahorcado = new Ahorcado();

    public Ahorcado crearJuego() {
        System.out.println("Ingresa una palabra: ");
        String palabra = leer.next();
        String[] palabra1 = new String[palabra.length()];
        for (int i = 0; i < palabra1.length; i++) {
            palabra1[i] = palabra.substring(i, i + 1);
        }
        ahorcado.setBuscar(palabra1);
        System.out.println("Ingresa la cantidad de jugadas maxima: ");
        ahorcado.setJugadasMaximas(leer.nextInt());

        System.out.println(Arrays.toString(ahorcado.getBuscar()));
        return ahorcado;
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println("La longitud de la palabra a encontrar es: " + ahorcado.getBuscar().length);
    }

    public boolean buscar(Ahorcado ahorcado, String[] vectorCopia) {
        System.out.println("Ingresa una letra");
        String letra = leer.next();
        int encontradas = 0;
        boolean aux = false;

        for (int i = 0; i < ahorcado.getBuscar().length; i++) {
            if (ahorcado.getBuscar()[i].equalsIgnoreCase(letra)) {
                System.out.println("Es igual");
                vectorCopia[i] = letra;
                aux = true;
            }
        }
        for (int i = 0; i < vectorCopia.length; i++) {
            if (vectorCopia[i] != null) {
                encontradas++;
            }
        }

        int faltantes = ahorcado.getBuscar().length - encontradas;
        System.out.println("has encontrado: " + encontradas + " letras y te faltan: " + faltantes);
        return aux;
    }

    public void intentos(Ahorcado ahorcado) {
        ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas() - 1);

        System.out.println("Te quedan " + ahorcado.getJugadasMaximas() + " intentos");
    }

    public void juego() {
        ahorcado = crearJuego();
        String[] vecCopia = new String[ahorcado.getBuscar().length];
        do {
            longitud(ahorcado);
            if(!buscar(ahorcado, vecCopia)){
            intentos(ahorcado);                
            }else{
                System.out.println("Te quedan " + ahorcado.getJugadasMaximas() + " intentos");
            };
            
        } while (ahorcado.getJugadasMaximas() > 0);
    }

}
