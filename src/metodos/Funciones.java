/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author saman
 */
public class Funciones {
    private double a;
    private double b;
    private double xr;
    double fxranterior;
    double fxr;

    public double getFxranterior() {
        return fxranterior;
    }

    public void setFxranterior(double fxranterior) {
        this.fxranterior = fxranterior;
    }

    public Funciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Funciones() {
    }

    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }
    
    
    public double intevaloA(double a){
        
       double resultado = (((Math.pow(a, 3)) + (4 * Math.pow(a, 2))) - 10);
        
    return resultado;
    }
    
    public double intevaloB(double b){
        
       double resultado2 = (((Math.pow(b, 3)) + (4 * Math.pow(b, 2))) - 10);
        
    return resultado2;
    }
    
    
    public double xr(double a, double b){
    double resultado3= (a+b)/2;
    return resultado3;
    }
    
     public double fxr(double xr){
    double resultado4= (((Math.pow(xr, 3)) + (4 * Math.pow(xr, 2))) - 10);
    return resultado4;
    }
    
    
    
    
}
