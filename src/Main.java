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

        /*
        //Lab 2 - Zadanie 1
        System.out.println("x = " + rownanie(7,5,38));

        //Lab 2 - Zadanie 2
        funkcjeOkreslone(-1, 5, 2);

        //Lab 2 - Zadanie 3
        sortowanie(5,3,6);

        //Lab 2 - Zadanie 4
        komunikaty(false, false);

        //Lab 2 - Zadanie 5
        komunikaty2(false, true);

        //Lab 2 - Zadanie 6
        kalkulator(5, 2, 6);
         */

        //-----------------------------------------------------------------

        //Lab 3 - Zadanie 1
        System.out.println("Wprowadz liczbe studentow");
        int iloscStudentow = getInt();
        while(iloscStudentow < 1) {
            System.out.println("Liczba studentow musi byc wieksza niz 0");
            iloscStudentow = getInt();
        }
        sredniaStudentow(iloscStudentow);

        //Lab 3 - Zadanie 2
        dodatnieUjemne();
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
    /*
    //Lab 2 - Zadanie 1
    public static int rownanie(int a, int b, int c) {
        int lStrona = 2*a + b;
        int pStrona = c * (-1);
        return pStrona / lStrona;
    }

    //Lab 2 - Zadanie 2
    public static void funkcjeOkreslone(int a, int b, int c) {
        int ax, ac;
        double ab;

        if(a > 0) {
            ax = 2 * a;
        } else if(a == 0) {
            ax = 0;
        } else {
            ax = (-3) * a;
        }

        ab = (b >= 1) ? Math.pow(b, 2) : b;

        if(c > 2) {
            ac = 2 + c;
        } else if (c == 2) {
            ac = 8;
        } else {
            ac = c - 4;
        }

        System.out.println("Wynik dla A: " + ax + ", wynik dla B: " + ab + ", wynik dla C: " + ac);
    }

    //Lab 2 - Zadanie 3
    public static void sortowanie(int a, int b, int c) {
        if(a > b && a > c) {
            if(b > c) {
                System.out.println(c + ", " + b + ", " + a);
            } else {
                System.out.println(b + ", " + c + ", " + a);
            }
        } else if(a > b && a < c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if(a < b && a > c) {
            System.out.println(c + ", " + a + ", " + b);
        } else {
            System.out.println(a + ", " + c + ", " + b);
        }
    }

    //Lab 2 - Zadanie 4
    public static void komunikaty(boolean deszcz, boolean autobus) {
        if(deszcz && autobus) {
            System.out.println("Weź parasol, dostaniesz sie na uczelnie");
        } else if(deszcz && !autobus) {
            System.out.println("Nie dostaniesz sie na uczelnie");
        } else if(!deszcz && autobus) {
            System.out.println("Dostaniesz sie na uczelnie, milego dnia i pieknej pogody");
        } else {
            System.out.println("Pogoda ladna ale na uczelnie nie dojedziesz");
        }
    }

    //Lab 2 - Zadanie 5
    public static void komunikaty2(boolean znizka, boolean premia) {
        if(!znizka || !premia) {
            if(znizka) {
                System.out.println("Zakup samochodu trzeba odlozyc");
            } else {
                System.out.println("Zakup samochodu trzeba odlozyc, nie ma znizki");
            }
        } else {
            System.out.println("Mozna kupic auto");
        }
    }

    //Lab 2 - Zadanie 6
    public static void kalkulator(int opcja, int a, int b) {
        switch (opcja) {
            case 1:
                System.out.println("Wybrales dodawanie");
                System.out.println(a + b);
            break;
            case 2:
                System.out.println("Wybrales odejmowanie");
                System.out.println(a - b);
            break;
            case 3:
                System.out.println("Wybrales mnozenie");
                System.out.println(a * b);
            break;
            case 4:
                System.out.println("Wybrales dzielenie");
                System.out.println(a / b);
            break;
            case 5:
                System.out.println("Wybrales dzielenie z reszta");
                System.out.println(a % b);
            break;

        }
    }
     */

    //-----------------------------------------------------------------

    //Lab 3 - Zadanie 1
    public static void sredniaStudentow(int n) {
        int x = 0, srednia = 0;
        if(n > 0) {
            while(x < n) {
                System.out.println("Podaj punkty dla studenta nr: " + (x + 1));
                int punkty = getInt();
                srednia = srednia + punkty;
                x++;
            }
            System.out.println("Srednia punktow dla " + n + " studentow wynosi: " + (srednia / n));
        }
    }

    //Lab 3 - Zadanie 2
    public static void dodatnieUjemne() {
        int dodatnie = 0, ujemne = 0, sumaDodatnie = 0, sumaUjemne = 0;
        for(int x = 0; x < 10; x++){
            System.out.println("Wprowadz " + (x + 1) + " liczbe: ");
            int liczba = getInt();
            if(liczba > 0) {
                dodatnie++;
                sumaDodatnie = sumaDodatnie + liczba;
            } else if(liczba < 0) {
                ujemne++;
                sumaUjemne = sumaUjemne + liczba;
            }
        }
        System.out.println("Liczb dodatnich: " + dodatnie + ". Suma dodatnich: " + sumaDodatnie);
        System.out.println("Liczb ujemnych: " + ujemne + ". Suma ujemnych: " + sumaUjemne);
    }

    //Scanner
    public static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

}
