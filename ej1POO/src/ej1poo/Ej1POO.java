/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1poo;

import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author carlo
 */
public class Ej1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroServicio lib1 = new LibroServicio();
        Libro lib2 = lib1.cargarLibro();
        
        System.out.println(lib2.toString());
    }
    
}
