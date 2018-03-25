package pl.edu.ur.polab4;

import pl.edu.ur.polab4.wprowadzDane.BazaStudentow;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5

        Scanner wejsce = new Scanner(System.in);
        int zad;
        System.out.println("Witaj!\nKtore zadanie wykonac? (4 lub 5)");
        zad = wejsce.nextInt();

        switch (zad){
            case 4:
                String w;
                do {
                    Kalkulator.kalkulatorFigor();
                    System.out.println("\nCzy chcesz kontynuowac?: ");
                    w = wejsce.next();
                }while(w.equalsIgnoreCase("tak"));
                break;

            case 5:
                BazaStudentow.bazaMenu();
                break;

             default:
                 System.out.println("Zły numer zadania!");
                 break;
        }

    }

}
