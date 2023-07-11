/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import Entidad.Persona1;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class JavaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Persona1 m1 = new Persona1("Lorenzo", "brusasca", 30, 1);
        Persona1 m2 = new Persona1(leer.next(),leer.next() , leer.nextInt(), leer.nextInt());

        System.out.println(m1.nombre + " "+ m1.apellido + " "+m1.edad + " "+ m1.id );
        System.out.println(m2.nombre + " "+ m2.apellido + " "+m2.edad + " "+ m2.id );
        
    /*public String nombre;
    public String apellido;
    public int edad;
    public int id;*/
}

}
