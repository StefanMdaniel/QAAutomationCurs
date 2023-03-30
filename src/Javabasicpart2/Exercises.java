package Javabasicpart2;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti un numar de la tastatura: ");
        double value = scanner.nextDouble();

        System.out.println(ftoc(value));
        swap(13, 8);
    }

    public static double ftoc(double t){
        double c = (t-32)*5/9;
        return c;
    }

    public static void swap(int a, int b){
         a = a+b; //a = 13 + 8 = 21
         b = a-b; //b = 21 - 8 = 13
         a = a-b; //a = 21 - 13 = 8
        System.out.println("a = " + a + " , " + "b = " + b);
    }

    public static void swap1(int a, int b){
        int temp = a;
        a = b;
        b =temp;
        System.out.println("a = " + a + " , " + "b = " + b);



        }

    }





