/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class MovilServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");    
    
    public Movil cargarMovil(){
    Movil mov = new Movil();
    System.out.println("Por favor ingresa la marca del movil: ");
    mov.setMarca(leer.next());
    System.out.println("Por favor ingresa el precio del movil: ");
    mov.setPrecio(leer.nextDouble());
    System.out.println("Por favor ingresa el modelo del movil: ");
    mov.setModelo(leer.next());
    System.out.println("Por favor ingresa la memoria ram del movil: ");
    mov.setRam(leer.nextInt());
    System.out.println("Por favor ingresa el almacenamiento del movil: ");
    mov.setAlmacenamiento(leer.nextInt());
   
    generarCodigo(mov);
    return mov;
    }
    
    public void generarCodigo(Movil mov){
            int [] aux = new int[7];
        for (int i = 0; i < mov.getCodigo().length; i++) {
            System.out.println("Ingresa los numeros del codigo: ");
            aux[i] = leer.nextInt();
        }
        
        mov.setCodigo(aux);
         
    }
}
