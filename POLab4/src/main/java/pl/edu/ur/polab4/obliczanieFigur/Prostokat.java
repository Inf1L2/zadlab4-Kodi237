package pl.edu.ur.polab4.obliczanieFigur;

public class Prostokat {

    double a = 0, b= 0;

    public Prostokat(double a, double b){
        this.a=a;
        this.b=b;
    }

    public double Pole(double a, double b){
        return a*b;
    }

    public double Obwod(double a, double b){
        return  2*a+2*b;
    }

    public void pokazDane(){

        System.out.println("---------------------");
        System.out.println("Figura: Prostokąt");
        System.out.println("Bok a: "+a);
        System.out.println("Bok b: "+b);
        System.out.println("Pole: "+Pole(a,b));
        System.out.println("Obwód: "+Obwod(a,b));
        System.out.println("---------------------");
    }
}
