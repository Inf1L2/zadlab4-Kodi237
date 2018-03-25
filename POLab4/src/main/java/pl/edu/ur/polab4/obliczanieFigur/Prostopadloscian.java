package pl.edu.ur.polab4.obliczanieFigur;

public class Prostopadloscian {

    double a=0, b=0, c=0;

    public Prostopadloscian(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Pole(double a, double b, double c){
        return  2*a*b + 2*a*c + 2*b*c;
    }

    public double Objetosc(double a, double b, double c){
        return a*b*c;
    }

    public void pokazDane(){

        System.out.println("---------------------");
        System.out.println("Figura: Prostopadłościan");
        System.out.println("Bok a: "+a);
        System.out.println("Bok b: "+b);
        System.out.println("Bok c: "+c);
        System.out.println("Pole: "+Pole(a,b,c));
        System.out.println("Objętość: "+Objetosc(a,b,c));
        System.out.println("---------------------");
    }
}
