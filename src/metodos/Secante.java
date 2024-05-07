/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author saman
 */
public class Secante {
    double xi1;
    double xi;
    double fxi1;
    double fxi;
    double xr;

    public Secante() {
    }

    public double getXi1() {
        return xi1;
    }

    public void setXi1(double xi1) {
        this.xi1 = xi1;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getFxi1() {
        return fxi1;
    }

    public void setFxi1(double fxi1) {
        this.fxi1 = fxi1;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }
    
    
    public double fx(double xi1){
    double r=0;
    
    r=((Math.pow(xi1, 2))-(3*(xi1))-4);
    
    return r;}
    
    public double fx2(double xi){
    double r2=0;
    
    r2=((Math.pow(xi, 2))-(3*(xi))-4);
    
    return r2;}
    
    public double xr(double xi, double fxi, double xi1, double fxi1 ){
    double r3=0;
    
    r3=xi-((fxi)*(xi1-xi))/(fxi1-fxi);
    
    return r3;}
}
