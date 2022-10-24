import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Lab 1 - Zadanie 1
        Osoba();

        //Lab 1 - Zadanie 2
        System.out.println("Wprowadz pierwsza liczbe: ");
        double a = getDouble();
        System.out.println("Wprowadz druga liczbe: ");
        double b = getDouble();
        wypisz(a, b);
    }

    //Lab 1 - Zadanie 1
    public static void Osoba() {
        System.out.println("Imię " + getImie() + ", wiek " + getWiek());
    }

    public static String getImie() {
        return "Darek";
    }

    public static int getWiek() {
        return 23;
    }

    //Lab 1 - Zadanie 2
    public static void wypisz(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Roznica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

    //Scannery
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }

}
