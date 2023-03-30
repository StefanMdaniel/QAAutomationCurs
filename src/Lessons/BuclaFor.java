package Lessons;

public class BuclaFor {
    public static void main(String[] args) {
        /*
        for (initializare : conditie : incrementare/decrementare) {
        corp bucla
    }
    */

     for (int i = 0; i < 4; i++) {
         System.out.println("Valoarea variabilei i este " + i);
     }

     Integer[] numere = {21, 3, 4, 65, 34};
     for(int i = 0; i < numere.length; i++) {
            System.out.println("Elementul " + i + " este egal cu " + numere[i]);
        }


    }
}
