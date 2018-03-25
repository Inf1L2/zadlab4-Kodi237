package pl.edu.ur.polab4.wprowadzDane;
import java.util.Scanner;
public class BazaStudentow {

    Student[] stud;
    int index;

    Scanner in = new Scanner(System.in);

    public BazaStudentow(){
        this.index = 0;
        this.stud = new Student[100];
    }


    public void stworzObiekty(){
        for(int i=0; i<100; i++){
            stud[i] = new Student("","",0,"",0);
        }
    }

    public void zmianaDanych(){
        System.out.println("Podaj index tablicy do podmiany danych: ");
        int nr = in.nextInt();
        System.out.println("Podaj imie: ");
        String imie = in.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = in.next();
        System.out.println("Podaj nr_indeksu: ");
        int nr_indeksu = in.nextInt();
        System.out.println("Podaj nazwe specjalnosci: ");
        String nazwa_specjalnosci = in.next();
        System.out.println("Podaj rok studiow: ");
        int rok_srudiow = in.nextInt();
        stud[nr] = new Student(imie,nazwisko,nr_indeksu,nazwa_specjalnosci,rok_srudiow);
    }

    public void usunDane(){
        System.out.print("Podaj index tablicy do usuniecia: ");
        int nr = in.nextInt();
        stud[nr] = new Student("","",0,"",0);
    }

    public void wyswietlIndex(){
        System.out.print("Podaj index tablicy do wyswietlenia: ");
        int nr = in.nextInt();
        System.out.println("Student o numerze ["+nr+"}");
        System.out.println("Imie: "+stud[nr].imie);
        System.out.println("Nazwisko: "+stud[nr].nazwisko);
        System.out.println("Numer indeksu: "+stud[nr].nr_indeksu);
        System.out.println("Nazwa specjalizacji: "+stud[nr].nazwa_specjalnosci);
        System.out.println("Rok studiow: "+stud[nr].rok_studiow);
    }

    public void wyswietlWszystko(){
        for(int i=0;i<100;i++){
            System.out.println("\nStudent o numerze ["+i+"}");
            System.out.println("Imie: "+stud[i].imie);
            System.out.println("Nazwisko: "+stud[i].nazwisko);
            System.out.println("Numer indeksu: "+stud[i].nr_indeksu);
            System.out.println("Nazwa specjalizacji: "+stud[i].nazwa_specjalnosci);
            System.out.println("Rok studiow: "+stud[i].rok_studiow);
        }
    }

    public void wyswietlZakres(){
        System.out.print("Podaj poczatek zakresu do wyswietlenia: ");
        int min = in.nextInt();
        System.out.print("Podaj koniec zakresu: ");
        int max = in.nextInt();

        for (int i = min;i<=max;i++){
            System.out.println("\nStudent o numerze ["+i+"}");
            System.out.println("Imie: "+stud[i].imie);
            System.out.println("Nazwisko: "+stud[i].nazwisko);
            System.out.println("Numer indeksu: "+stud[i].nr_indeksu);
            System.out.println("Nazwa specjalizacji: "+stud[i].nazwa_specjalnosci);
            System.out.println("Rok studiow: "+stud[i].rok_studiow);
        }
    }

    public static void bazaMenu(){

        int wybor;
        String w;
        Scanner in = new Scanner(System.in);
        BazaStudentow stud = new BazaStudentow();
        stud.stworzObiekty();

        do {
            System.out.println("Jaką operację chcesz wykonać?:\n1 - wprowadzic/edytowac dane studenta,\n2 - usunac dane studenta,\n3 - wyswietlic dane studenta,\n4 - wyswietlic wszystkie dane,\n5 - wyswietlic zakres danych");
            wybor = in.nextInt();
            switch (wybor) {
                case 1:
                    stud.zmianaDanych();
                    break;
                case 2:
                    stud.usunDane();
                    break;
                case 3:
                    stud.wyswietlIndex();
                    break;
                case 4:
                    stud.wyswietlWszystko();
                    break;
                case 5:
                    stud.wyswietlZakres();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
                    break;
            }

            System.out.println("\nCzy chcesz kontynuowac?: ");
            w = in.next();
        }while(w.equalsIgnoreCase("tak"));



    }

}
