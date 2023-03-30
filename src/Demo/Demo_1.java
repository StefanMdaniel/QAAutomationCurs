package Demo;

import java.util.Scanner;

public class Demo_1 {

    public static void main(String[] args) {
        System.out.println("Sa calculam pe niste numere");
        System.out.println("Introduceti primul numar fractionar: ");

        Scanner scanner = new Scanner(System.in);
        double nr1 = scanner.nextDouble();

        System.out.println("Introduceti al doilea numar fractionar: ");
        double nr2 = scanner.nextDouble();

        double rezultatInmultire = (inmultire(nr1, nr2));
        double rezultatAdaugare = (adaugare(nr1, nr2));
        double rezultatScadere = (scadere(nr1, nr2));
        double rezultatImpartire = (impartire(nr1, nr2));
        double rezultatModul = modul((int) nr1, (int) nr2);

        double random = generezaNumarRandom(rezultatScadere, rezultatInmultire);

        System.out.println("Rezultatul inmultirii este: " + rezultatInmultire);
        System.out.println("Rezultatul impartirii este: " + rezultatImpartire);
        System.out.println("Rezultatul scaderii este: " + rezultatScadere);
        System.out.println("Rezultatul adaugarii este: " + rezultatAdaugare);
        System.out.println("Rezultatul modul este: " + rezultatModul);
        System.out.println("Numarul random generat intre " + rezultatScadere + "si" + rezultatInmultire + "este: " + random);


    }

    public static double inmultire(double nr1, double nr2) {
        double rezultat = nr1 * nr2;
        return rezultat;
    }

    public static Double adaugare(double nr1, double nr2) {
        double rezultat = nr1 + nr2;
        return rezultat;
    }

    public static double scadere(Double nr1, Double nr2) {
        Double rezultat = nr1 - nr2;
        return rezultat;
    }

    public static double impartire(Double nr1, double nr2) {
        return nr1 / nr2;
    }

    public static int modul(int nr1, int nr2) {
        return nr1 % nr2;

    }
    public static double generezaNumarRandom(double minim, double maxim) {
        return Math.random()*(maxim - minim) + minim;
    }
}
