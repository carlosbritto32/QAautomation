/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extrapoo;

import Servicio.PuntoServicio;

/**
 *
 * @author carlo
 */
public class Ej2extraPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PuntoServicio punServ = new PuntoServicio();
        punServ.crearPunto();
        System.out.println("el resultado es " + punServ.calcularDistancia());
        
    }
    
}
