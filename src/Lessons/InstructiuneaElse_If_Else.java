package Lessons;

public class InstructiuneaElse_If_Else {

    public static void main(String[] args) {
        //instructiunea else-if-else

 //       int numar = 22;
 //         // IF-ELSE
  //      if (numar < 0) {
  //          System.out.println("Numarul este mai mic decat 0");
 //       } else {
 //           System.out.println("Am intrat pe ramura Else");
//
 //       }

 //       //operatorul ternar
 //       System.out.println(numar < 0 ? "Instructiunea este True" : "Instructiunea este False");

        double nota = 9.5;

        if (nota == 10) {
            System.out.println("Nota maxima");
        } else if (nota == 9) {
            System.out.println("Nota 9");
        } else if (nota < 9 && nota > 8) {
            System.out.println("Nota intre 8 si 9");
        } else {
            System.out.println("Am executat ramura Else");
        }


    }
}
