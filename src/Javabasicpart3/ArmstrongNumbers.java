package Javabasicpart3;
/*Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
[19:32]
153 = (111)+(555)+(333)
where:
(111)=1
(555)=125
(333)=27
So:
1+125+27=153

 */

import Utils.Utils;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        ArmstrongNumbers object = new ArmstrongNumbers();
        System.out.println(object.armNum(Utils.scanner().nextInt()));



    }
    public boolean armNum(int num){
        int sum =0;
        int temp = num;
        int digi = String.valueOf(num).length();
        while (num>0){
            int digit = num%10;
            sum +=Math.pow(digit,digi);
            num/=10;
        }
        return sum==temp? true : false;
    }
}
