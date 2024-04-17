package day10_if_statements;

public class IfWithoutBrackets {
    public static void main(String[] args) {

        if (4 > 2){
            System.out.println("Hello");
            System.out.println("Bye");
        }

        if (1 > 2) // IF statement without BRACKETS available ONLY if you're printing not more than 1 statement
            System.out.println("Hello2");
            System.out.println("Bye2");

            if (10 % 5 == 0){
                System.out.println("divisible");
                System.out.println("Google");
            } else {
                System.out.println("Not divisible");
            }

            if (10 % 5 == 0)
                System.out.println("divisible");
            else
                System.out.println("not divisible");




    }
}
