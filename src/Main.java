import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
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

        //Lab 1 - Zadanie 7
        System.out.println("Wprowadz pierwsza liczbe zakresu: ");
        int y = getInt();
        System.out.println("Wprowadz druga liczbe zakresu: ");
        int z = getInt();

        while(y <= 0) {
            System.out.println("Pierwsza liczba nie moze byc mniejsza badz rowna 0");
            y = getInt();
        }

        while(z <= 0) {
            System.out.println("Druga liczba nie moze byc mniejsza badz rowna 0");
            z = getInt();
        }

        while(y >= z) {
            System.out.println("Druga liczba nie moze byc mniejsza od pierwszej");
            z = getInt();
        }

        int suma = (z - y) + 1;
        Random rand = new Random();
        int x1 = rand.nextInt(suma) + y;
        int x2 = rand.nextInt(suma) + y;
        int x3 = rand.nextInt(suma) + y;

        System.out.println(trojkat(x1, x2, x3));
        */

        //-----------------------------------------------------------------

        //Lab 2 - Zadanie 1
        System.out.println("x = " + rownanie(7,5,38));
    }
    /*
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

    //Lab 1 - Zadanie 7
    public static boolean trojkat(int a, int b, int c) {
        return Math.pow(a, 2) == (Math.pow(b,2) + Math.pow(c, 2));
    }
    */


    //----------------------------------------------------------------------------

    //Lab 2 - Zadanie 1
    public static int rownanie(int a, int b, int c) {
        int lStrona = 2*a + b;
        int pStrona = c * (-1);
        return pStrona / lStrona;
    }

    //Scanner
    public static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

}
