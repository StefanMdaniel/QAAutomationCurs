package Lessons;

public class Metode {

    public static void main(String[] args) {
 //       System.out.println("Printeaza");

        primaMetoda();
        adouaMetoda(6.2);
        System.out.println(atreiaMetoda(5));

    }

    // tipul_de_acces  tipul_returnat nume_metoda(parametrii) {
    //
    // }

    static void primaMetoda() {
        System.out.println("Prima mea metoda");

    }

    static void adouaMetoda(double dublu) {
        double rezultat = dublu * 2;
        System.out.println(rezultat);
    }

    static int atreiaMetoda(int intreg){
        int rezultat = intreg * intreg;
        return rezultat;
    }
}
