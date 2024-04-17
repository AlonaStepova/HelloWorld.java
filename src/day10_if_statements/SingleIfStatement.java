package day10_if_statements;

public class SingleIfStatement {

    public static void main(String[] args) {

        if (false) {
            System.out.println("Hello world"); //If condition is FALSE, the code block that belongs to IF statement will NOT be EXECUTED
        }
        System.out.println("Second print statement");

        if (true){ // If condition is TRUE, the code block WILL BE EXECUTED
            System.out.println("Today is Wednesday");
        }
        int score = 60;
        if (score >=75){
            System.out.println("Passing the exam"); //If condition is FALSE, the code block that belongs to IF statement will NOT be EXECUTED
        }
        if (score<75){
            System.out.println("Failing the exam!");
        }
        int year = 2021;
        boolean isLockdown = year ==2020 || year == 2021;
        if (isLockdown){
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");
        }
    }
}
