package Lessons;

public class InstructiuneaSwitch {
    public static void main(String[] args) {
        //Instructiunea SWITCH

        //IF -ELSE
        int numar = 22;
        if (numar < 0) {
            System.out.println("Numarul este mai mic decat 0");
        } else {
            System.out.println("Am intrat pe ramura Else");
        }

        //Operatorul ternar
        System.out.println(numar < 0 ? "True" : "False");

        //Instructiunea IF-ELSE-IF
        String ziua = "Duminica";
        if (ziua == "Sambata") {
            System.out.println("Este marti");
        } else if (ziua == "Duminica") {
            System.out.println("Este Duminica");
        } else {
            System.out.println("A trecut wknd");
        }

        switch (ziua) {
            case "Sambata": {
                System.out.println("Sambata - switch");
                break;
            }
            case "Duminica": {
                System.out.println("Duminica - switch");
                break;
            }
            default: {
                System.out.println("Nu este wknd - switch");
            }
        }
    }
}







