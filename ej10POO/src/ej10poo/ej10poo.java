/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10poo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author carlo
 */
public class ej10poo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double []num1= new double[50];
        double []num2= new double[20];  
        llenararreglo(num1);
        System.out.println(Arrays.toString(num1));
        Arrays.sort(num1);
        System.arraycopy(num1, 0, num2, 0,  10);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        Arrays.fill(num2, 10, 20, 0.5);
        System.out.println(Arrays.toString(num2));
    }
    public static void llenararreglo(double[]num1){
       Random random= new Random();
       Arrays.setAll(num1, i -> random.nextDouble()*10);
        }
    }
