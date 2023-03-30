package Lessons;

public class OperatorulTernar {
    public static void main(String[] args) {
        //Instructiunea If-Else
        //operatorul Ternar

        int numar = 5;
        if (numar<0) {
            System.out.println("Numarul este mai mic decat 0");
        }else {
            System.out.println("Am intrat pe ramura Else");
        }

        // conditie ? instructiunea true: instructiunea false
        System.out.println(numar <0 ? "instructiunea a fost True" : "Instructiunea a fost False");

//        System.out.println("Dupa instructiunea If");
    }
}
