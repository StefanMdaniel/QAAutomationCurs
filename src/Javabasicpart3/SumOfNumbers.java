package Javabasicpart3;

import Utils.Utils;

public class SumOfNumbers {
    public static void main(String[] args) {
        SumOfNumbers object = new SumOfNumbers();
        System.out.println(object.Numbers(Utils.scanner().nextInt()));

    }
    public String Numbers(int num){
        int index1 = (num/100)%10;
        int index3 = num%10;
        int sum = index1 + index3;
        return String.valueOf(sum);


    }
}
