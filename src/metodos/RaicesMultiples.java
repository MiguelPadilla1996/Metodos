/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author saman
 */
public class RaicesMultiples {
    double xi1;
    double fxi1;
    double fxidev1;
    double fxidev2;
    double xr;

    public RaicesMultiples() {
    }

    public double getXi1() {
        return xi1;
    }

    public void setXi1(double xi1) {
        this.xi1 = xi1;
    }

    public double getFxi1() {
        return fxi1;
    }

    public void setFxi1(double fxi1) {
        this.fxi1 = fxi1;
    }

    public double getFxidev1() {
        return fxidev1;
    }

    public void setFxidev1(double fxidev1) {
        this.fxidev1 = fxidev1;
    }

    public double getFxidev2() {
        return fxidev2;
    }

    public void setFxidev2(double fxidev2) {
        this.fxidev2 = fxidev2;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }
    
 public double foriginal(double xi1){
 double r1=0;
 
 r1=((Math.pow(xi1, 3))+(4*(Math.pow(xi1, 2)))-10);
 
 return r1;}
 
 public double fderivada1(double xi1){
 double r2=0;
 
 r2=((3*(Math.pow(xi1, 2)))+(8*(xi1)));
 
 return r2;}

 public double fderivada2(double xi1){
 double r3=0;
 
 r3=(6*(xi1)+8);
 
 return r3;}
 
 public double xr(double xi1, double fxi1, double fxidev1, double fxidev2){
 double r4=0;
 
 r4=xi1-(fxi1*fxidev1)/((Math.pow(fxidev1, 2))-(fxi1*fxidev2));
 
 return r4;}
 
}


