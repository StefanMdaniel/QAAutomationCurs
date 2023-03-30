public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Stefan");
        System.out.println(adunare (12.5, 123.24));
        System.out.println(divide (275, 25));
        System.out.println(math(-10,3,7));
        System.out.println(math1(34, 5, 2));
        System.out.println(math2(5,25, 2, 6));

    }

    public static double adunare (double a, double b){
        return a+b;
    }

    public static int divide (int a, int b){
        int c = a/b;
        return c;
    }

    public static double math (double a, double b, double c){

        return (a + b + c);
    }

    public static double math1 (double a, double b, double c){

        return (a+b)%c;
    }

    public static double math2 (double a, double b, double c, double d){
        double inmultire = b*c;
        double impartire = d/inmultire;
        return impartire + a;
    }

}

