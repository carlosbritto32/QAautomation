/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4expoo;

import Entidad.NIF;
import Servicio.NIFServicio;

/**
 *
 * @author carlo
 */
public class Ej4exPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFServicio nifServ = new NIFServicio();
        NIF nif = nifServ.crearNif();
        nifServ.mostraNif(nif);
                
    }
    
}
