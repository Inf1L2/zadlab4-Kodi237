package pl.edu.ur.polab4.obliczanieFigur;
import java.math.*;
public class Kolo {

    double r = 0;

    public Kolo(double r) {
        this.r = r;
    }

    public double Pole(double r){
        return Math.PI * Math.pow(r,2);
    }

    public double Obwod(double r){
        return 2*Math.PI*r;
    }

    public void pokazDane(){

        System.out.println("---------------------");
        System.out.println("Figura: Koło");
        System.out.println("Promień: "+r);
        System.out.println("Pole: "+Pole(r));
        System.out.println("Obwód: "+Obwod(r));
        System.out.println("---------------------");
    }

}
