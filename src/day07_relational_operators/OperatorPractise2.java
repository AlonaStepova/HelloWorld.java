package day07_relational_operators;

public class OperatorPractise2 {
    public static void main (String [] args){

        int a = 40;
        System.out.println(--a); // 40 - 1 = 39
        System.out.println(--a); // 39 - 1 = 38
        System.out.println(a--); // 38 - because it is post decrement
        System.out.println(--a); // 37 (updated 38) - 1 = 36
        System.out.println(--a); // 35
        System.out.println(a--); // 35 - because it printed, then would be updated
        System.out.println(a); // 34 - because in previous statement we updated a after printing
    }
}
