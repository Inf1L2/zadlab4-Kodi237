package pl.edu.ur.polab4.obliczanieFigur;

public class Kula {

    double r = 0;

    public Kula(double r){
        this.r = r;
    }

    public double Pole(double r){
        return  4*Math.PI*Math.pow(r,2);
    }

    public double Objetosc(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }


    public void pokazDane(){

        System.out.println("---------------------");
        System.out.println("Figura: Kula");
        System.out.println("Promień: "+r);
        System.out.println("Pole: "+Pole(r));
        System.out.println("Objętość: "+Objetosc(r));
        System.out.println("---------------------");
    }
}
