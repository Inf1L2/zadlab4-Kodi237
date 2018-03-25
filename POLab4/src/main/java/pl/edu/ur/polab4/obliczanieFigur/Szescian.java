package pl.edu.ur.polab4.obliczanieFigur;

public class Szescian {

    double a = 0;

    public Szescian(double a){
        this.a = a;
    }

    public double Pole(double a){
        return  6*Math.pow(a,2);
    }

    public double Objetosc(double a){
        return Math.pow(a,3);
    }

    public void pokazDane(){

        System.out.println("---------------------");
        System.out.println("Figura: Sześcian");
        System.out.println("Bok: "+a);
        System.out.println("Pole: "+Pole(a));
        System.out.println("Objętość: "+Objetosc(a));
        System.out.println("---------------------");
    }
}
