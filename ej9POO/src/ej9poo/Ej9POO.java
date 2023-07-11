/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9poo;

/**
 *
 * @author carlo
 */
public class Ej9POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2; 
        num1= Math.random()*10;
        num2= Math.random()*10;
        Matematicas m = new Matematicas();
        m.setNum1(num1);
        m.setNum2(num2);
        System.out.println("" + num1);
        System.out.println("" + num2);
        System.out.println("El numero mayor es: " + m.devolvermayor(m));
        System.out.println("La potencia del mayor elevado al menor es: " + m.calcularpotencia(m));
        System.out.println("La raiz cuadrada del menor es: " + m.calcularraiz(m));
         }
    
}
