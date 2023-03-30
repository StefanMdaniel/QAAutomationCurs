package Javabasicpart3;
/*:  Java Program to Check Whether the Generated Random Number Is Even or Odd

 */

import Utils.Utils;

public class WhetherOddOrEven {
    public static void main(String[] args) {
        WhetherOddOrEven object1 = new WhetherOddOrEven();
        object1.oddoreven(Utils.randomNumber(99000));

    }
    public void oddoreven(int num){
        if(num%2==0){
            System.out.println(num + "is even" );
        }else{
            System.out.println(num + "is odd");
        }

    }
}
