//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Lab 1 - Zadanie 1
        Osoba();
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

}
