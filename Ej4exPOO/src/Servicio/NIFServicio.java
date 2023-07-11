/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class NIFServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNif(){
       NIF nif = new NIF();
        System.out.println("Ingresa el DNI de 7 numeros: ");
        nif.setDNI(leer.nextInt());  
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V","H", "L", "C", "K", "E"};
        int posicion = nif.getDNI()% 23;
        nif.setLetra(letras[posicion]);
        
        return nif;        
    }
    
    public void mostraNif(NIF nif){
        System.out.println(nif.getDNI()+" - " + nif.getLetra() );
    }
    
    
    
}
