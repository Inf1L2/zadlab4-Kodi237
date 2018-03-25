package pl.edu.ur.polab4.obliczanieFigur;

public class Kwadrat {

    double a = 0;

    public Kwadrat(double a){
        this.a = a;
    }

    public double Pole(double a){
        return Math.pow(a,2);
    }

    public double Obwod(double a){
        return  4*a;
    }

    public void pokazDane(){
        System.out.println("---------------------");
        System.out.println("Figura: Kwadrat");
        System.out.println("Bok: "+a);
        System.out.println("Pole: "+Pole(a));
        System.out.println("Obwód: "+Obwod(a));
        System.out.println("---------------------");
    }
}
