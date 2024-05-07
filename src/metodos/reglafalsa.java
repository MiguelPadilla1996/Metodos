/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author saman
 */
public class reglafalsa {
    private double a;
    private double b;
    private double xr;

    public reglafalsa() {
    }

    public reglafalsa(double a, double b) {
        this.a = a;
        this.b = b;
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
    
    public double intervaloA(double a){
        
       double resultado = (((Math.pow(a, 2))-2));
        
    return resultado;
    }
    
    public double intervaloB(double b){
        
       double resultado2 = (((Math.pow(b, 2))-2));
        
    return resultado2;
    }
    
     public double xr(double a, double fa, double b, double fb){
    double resultado3= ((a*fb)-(b*fa))/(fb-fa);
    return resultado3;
    }
    
     public double fxr(double xr){
    double resultado4= (((Math.pow(xr, 2))-2));
    return resultado4;
    }
    
}
