package Javabasicpart2;

import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti primul string: ");
        String stg1 = input.nextLine();
        System.out.println("Introduceti al doilea string: ");
        String stg2 = input.nextLine();

        if (stg1.equals(stg2)) {
            System.out.println("Stringurile sunt egale");
        } else {
            System.out.println("Stringurile nu sunt egale");
        }

    }
}
