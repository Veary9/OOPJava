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

        //Lab 1 - Zadanie 3
        System.out.println(parzysta(4));

        //Lab 1 - Zadanie 4
        System.out.println(podzielna(13));

        //Lab 1 - Zadanie 5
        System.out.println(potega(5));

        //Lab 1 - Zadanie 6
        System.out.println(pierwiastek(9));

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

    //Lab 1 - Zadanie 3
    public static boolean parzysta(int a) {
        return a % 2 == 0;
    }

    //Lab 1 - Zadanie 4
    public static boolean podzielna(int a) {
        return a % 3 == 0 && a % 5 == 0;
    }

    //Lab 1 - Zadanie 5
    public static double potega(double a) {
        return Math.pow(a, 3);
    }

    //Lab 1 - Zadanie 6
    public static double pierwiastek(double a) {
        return Math.sqrt(a);
    }

    //Scanner
    public static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }

}
