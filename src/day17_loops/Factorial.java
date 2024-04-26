package day17_loops;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int originalN = 5;
        int result = 1;

        // !5 --> 5 * 4 * 3 * 2 * 1
        // !4 --> 4 * 3 * 2 * 1
        // repeated action: multiply the numbers by one less than itself
        // stopping point: when number getting to be one


        while (n > 1) {
            result = result * n;
            n--;
        }
        System.out.println("Factorial of " + originalN + " is " + result);



    }
}
