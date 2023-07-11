/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class PuntoServicio {
    public Puntos punto = new Puntos();
    Scanner leer = new Scanner(System.in);
    
    public void crearPunto(){
        System.out.println("Ingresa coordenadas para el punto");
        punto.setX1(leer.nextDouble());
        punto.setY1(leer.nextDouble());
        punto.setX2(leer.nextDouble());
        punto.setY2(leer.nextDouble());
    }
    
    public double  calcularDistancia(){   
        
        return  Math.sqrt((Math.pow((punto.getX2() - punto.getX1()),2))+(Math.pow((punto.getY2() - punto.getY1()),2)));
    }
}
