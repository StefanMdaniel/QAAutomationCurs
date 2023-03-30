package Javabasicpart3;
    /*Java program to check whether the given integer is a multiple of 5
    b Java program to check whether the given integer is a multiple of both 5 and 7
     */

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        System.out.println("Introduceti un numar de la tastatura: ");
        CheckInteger object1 = new CheckInteger();
        object1.whether(Utils.Utils.scanner().nextInt());

    }

    public void whether(int x) {
        if (x % 5 == 0 && x % 7 == 0) {
            System.out.println("Numarul este multiplu de 5 si 7");
        } else {
            System.out.println("Numarul nu este multiplu de 5 si 7");
        }
    }
}



