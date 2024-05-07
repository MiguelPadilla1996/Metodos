/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author saman
 */
public class MullerClass {

    double x0;
    double x1;
    double x2;

    public MullerClass() {
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double fx0(double x0) {
        double r = 0;

        r = ((Math.pow(x0, 3)) - (13 * (x0)) - 12);

        return r;
    }

    public double fx1(double x1) {
        double r1 = 0;

        r1 = ((Math.pow(x1, 3)) - (13 * (x1)) - 12);

        return r1;
    }

    public double fx2(double x2) {
        double r2 = 0;

        r2 = ((Math.pow(x2, 3)) - (13 * (x2)) - 12);

        return r2;
    }

    public double ho(double x1, double x0) {
        double hr = 0;

        hr = x1 - x0;
        return hr;
    }
    
    public double h1(double x2, double x1) {
        double hr1 = 0;

        hr1 = x2 - x1;
        return hr1;
    }
    
    

}
