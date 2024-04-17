package day07_relational_operators;

public class OperationPractise4 {
    public static void main (String [] args){

        int t = 100;
         // p = -101  * -101  / 100 + 100 --> 10201 / 100 + 100 = 10 201 / 100 + 100 = 102.01 + 100 =  202.01
        int p = - ++t * - t-- /t++ + --t;

        int c = p % t;

        System.out.println("t: " + t);
        System.out.println("p: " + p);
        System.out.println("c: " + c);

        double a = 100;
        // p = -101  * -101  / 100 + 100 --> 10201 / 100 + 100 = 10 201 / 100 + 100 = 102.01 + 100 =  202.01
        double b = - ++t * - t-- /t++ + --t;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
