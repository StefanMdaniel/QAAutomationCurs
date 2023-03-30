package Homeworks;


import java.util.Scanner;

public class jbp1 {
    public static void main(String[] args) {
        System.out.println("Fac teme");

        like();
        age();
        read();
        myVariables();
        numbers();
        adunare();

    }

    public static void like() {
        System.out.println("imi place Java");
    }

    public static void age() {
        int Ana = 24;
        int David = (24 -6);
        System.out.println("Varsta lui David este: " + David);
    }

    public static void read() {
        System.out.println("Scrieti o propozitie: ");

        Scanner scanner = new Scanner(System.in);
        String read = scanner.next();
    }

    public static void myVariables(){
        int a = 4;
        String b = "Cuvant";
        boolean c = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void numbers(){
        System.out.println("Introduceti primul numar de la tastatura");

        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();

        System.out.println("Introduceti al doilea numar de la tastatura");

        int nr2 = scanner.nextInt();
    }

    public static double adunare(){
        System.out.println("Introduceti un numar de la tastatura:");
        Scanner scanner = new Scanner(System.in);
        double nr1 = scanner.nextInt();
        double suma = nr1 + 5;
        return suma;

    }


}
