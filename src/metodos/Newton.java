/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author saman
 */
public class Newton {
    double x;
    double fx;
    double derivada;
    double xr;

    public Newton() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getFx() {
        return fx;
    }

    public void setFx(double fx) {
        this.fx = fx;
    }

    public double getDerivada() {
        return derivada;
    }

    public void setDerivada(double derivada) {
        this.derivada = derivada;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double formula(double x){
    double r1=0;
    
    r1=((Math.pow(x, 2))-(3*(x))-4);
    
    return r1;}

    public double derivada(double x){
    double r2=0;
    
    r2=(2*x)-3;
    
    return r2;}
    
    
    public double xr(double x, double fx, double derivada){
    double r=0;
    
    r=x-(fx/derivada);
    
    return r;}
}
