package Javabasicpart2;

import Utils.Utils;



public class OddAndEven {
    public static void main(String[] args) {
        System.out.println("Introduceti un numar de la tastatura: ");
        oddeven(Utils.scanner().nextInt());


    }

    public static void oddeven(int a) {
        if (a % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }
    }

}

