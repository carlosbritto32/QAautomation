/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class CircunferenciaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        Circunferencia circun = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia: ");
        circun.setRadio(leer.nextDouble());
        return circun;        
    }
    
    public double area(Circunferencia circun) {
        return Math.PI * Math.pow(circun.getRadio(), 2);
    }

    public double perimetro(Circunferencia circun) {
        return 2 * Math.PI * circun.getRadio();
    }
    
}
