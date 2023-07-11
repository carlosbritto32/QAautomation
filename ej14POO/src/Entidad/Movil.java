/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author carlo
 */
public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int ram;
    private int almacenamiento;
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, int ram, int almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + '}';
    }
    
    
    
}



