package Javabasicpart2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar de la tastatura: ");
        int x = input.nextInt();
        int factorialx = calcFact(x);
        System.out.println("The factorial of " + x + " is " + factorialx);

    }
    public static int calcFact(int num){
        int factorial = 1;
        for (int i = 1; i<=num; i++){
            factorial *=i;
        }
        return factorial;
    }
}
