package pl.edu.ur.polab4.obliczanieFigur;

public class Stozek {

    double r = 0, h = 0, l = 0;

    public Stozek(double r, double h, double l){
        this.r = r;
        this.h = h;
        this.l = l;
    }

    public double Pole(double r, double l){
        return Math.PI*Math.pow(r,2) + Math.PI*r*l;
    }

    public double Objetosc(double r, double h){
        return (Math.PI*Math.pow(r,2)*h)/3;
    }


    public void pokazDane(){

        System.out.println("---------------------");
        System.out.println("Figura: Stożek");
        System.out.println("Promień: "+r);
        System.out.println("Wysokość: "+h);
        System.out.println("Tworząca: "+l);
        System.out.println("Pole: "+Pole(r,l));
        System.out.println("Objętość: "+Objetosc(r,h));
        System.out.println("---------------------");
    }
}
