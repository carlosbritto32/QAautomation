/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro cargarLibro(){
        Libro lib = new Libro();
        System.out.println("Ingresa el numero ISBN:");
        lib.setISBN(leer.nextInt());
        System.out.println("Ingresa el nombre del titulo:");
        lib.setTitulo(leer.next());
        System.out.println("Ingresa el nombre del autor:");
        lib.setAutor(leer.next());
        System.out.println("Ingresa el numero de paginas:");
        lib.setNroPaginas(leer.nextInt());
        
        return lib;
        
    }
}
