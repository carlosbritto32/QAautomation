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
public class Matematicas {
  private double num1, num2;

    public Matematicas() {
    }

    public Matematicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
public static double devolvermayor(Matematicas m)  {
 return Math.max(m.getNum1(), m.getNum2());
    }
public static double devolvermenor(Matematicas m)  {
 return Math.min(m.getNum1(), m.getNum2());
    }
public static double calcularpotencia(Matematicas m){
    double mayor = Math.round(devolvermayor(m));
    double menor = Math.round(devolvermenor(m));
    return Math.pow(mayor, menor);
    }
public static double calcularraiz(Matematicas m){
    double menor = Math.abs(devolvermenor(m));
    return Math.sqrt(menor);
}

}
