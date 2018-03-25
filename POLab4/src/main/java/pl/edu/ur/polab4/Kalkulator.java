package pl.edu.ur.polab4;
import pl.edu.ur.polab4.obliczanieFigur.*;

import java.util.Scanner;
public class Kalkulator {

    public static void kalkulatorFigor(){

        Scanner wejsce = new Scanner(System.in);
        String figura;

            System.out.println("Dla jakiej figury wykonac obliczenia?: ");
            figura = wejsce.nextLine();

            if (figura.equalsIgnoreCase("kolo")) {
                System.out.println("Podaj promien kola: ");
                double r = wejsce.nextDouble();
                Kolo kolo = new Kolo(r);
                kolo.pokazDane();
            } else if (figura.equalsIgnoreCase("kwadrat")) {
                System.out.println("Podaj dlugosc boku: ");
                double a = wejsce.nextDouble();
                Kwadrat kwadrat = new Kwadrat(a);
                kwadrat.pokazDane();
            } else if (figura.equalsIgnoreCase("prostokat")) {
                System.out.println("Podaj dlugosc boku a: ");
                double a = wejsce.nextDouble();
                System.out.println("Podaj dlugosc boku b: ");
                double b = wejsce.nextDouble();
                Prostokat prostokat = new Prostokat(a, b);
                prostokat.pokazDane();
            } else if (figura.equalsIgnoreCase("szescian")) {
                System.out.println("Podaj dlugosc boku a: ");
                double a = wejsce.nextDouble();
                Szescian szescian = new Szescian(a);
                szescian.pokazDane();
            } else if (figura.equalsIgnoreCase("prostopadloscian")) {
                System.out.println("Podaj dlugosc boku a: ");
                double a = wejsce.nextDouble();
                System.out.println("Podaj dlugosc boku b: ");
                double b = wejsce.nextDouble();
                System.out.println("Podaj dlugosc boku c: ");
                double c = wejsce.nextDouble();
                Prostopadloscian prostopadloscian = new Prostopadloscian(a, b, c);
                prostopadloscian.pokazDane();
            } else if (figura.equalsIgnoreCase("kula")) {
                System.out.println("Podaj promien kuli: ");
                double r = wejsce.nextDouble();
                Kula kula = new Kula(r);
                kula.pokazDane();
            } else if (figura.equalsIgnoreCase("stozek")) {
                System.out.println("Podaj promien stozka: ");
                double r = wejsce.nextDouble();
                System.out.println("Podaj wysokosc stozka: ");
                double h = wejsce.nextDouble();
                System.out.println("Podaj towrzaca stozka: ");
                double l = wejsce.nextDouble();
                Stozek stozek = new Stozek(r, h, l);
                stozek.pokazDane();
            } else {
                System.out.println("Nieobslugiwana figura!");
            }

    }

}
