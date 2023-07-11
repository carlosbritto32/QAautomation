/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2poo;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author carlo
 */
public class Ej2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        CircunferenciaServicio circunferenciaserv = new CircunferenciaServicio();
        Circunferencia circunferencia = circunferenciaserv.crearCircunferencia();

        System.out.println("El área de la circunferencia es: " + circunferenciaserv.area(circunferencia));
        System.out.println("El perímetro de la circunferencia es: " + circunferenciaserv.perimetro(circunferencia));
    }
    
}
