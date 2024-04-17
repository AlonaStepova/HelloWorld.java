package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main (String [] args){

        int n = 20;

        System.out.println(n > 5);
        System.out.println(n < 10);

        System.out.println(n > 5 && n < 10);// for the AND (&) both sides need to be true to get outcome TRUE

        System.out.println(4 > 3 || false); // for the OR (||) both sides need to be false to get outcome FALSE
        System.out.println(3 > 4 || false);


        System.out.println(true);
        System.out.println(!true); // not true (!) --> false
        System.out.println(!false); // not false (!) --> true
        System.out.println(4!=4); // 4 is not = 4 --> false


    }
}
