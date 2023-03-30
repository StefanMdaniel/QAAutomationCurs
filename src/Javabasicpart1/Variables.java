package Javabasicpart1;

public class Variables {
    public static void main(String[] args) {
        System.out.println(divide((int) 30.25, (int) 15.75));
        System.out.println(Run.adaugare(2.0, 3.0) + "--" + Run.inmultire(2.0, 3.0) + "--" + Run.impartire(3.0, 5.0) + "--" + Run.scadere(4.0, 2.0) + "--" + Run.modul(5, 9)
                + "--" + Run.genereazaNumarRandom(3, 9));
    }

    public static int divide(double a, double b) {
        int c = (int) (a / b);
        return c;
    }
}
