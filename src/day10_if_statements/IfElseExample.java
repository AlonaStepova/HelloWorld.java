package day10_if_statements;

public class IfElseExample {
    public static void main(String[] args) {
/*
        int score = 75;

        if (score >= 75){
            System.out.println("Passing the exam"); //If condition is FALSE, the code block that belongs to IF statement will NOT be EXECUTED
        }

        if (score < 75) {
            System.out.println("Failing the exam!");
        }
  */
        int score = 70;

        if (score >= 75) {
            System.out.println("Passing the exam");
        } else {
            System.out.println("Failing the exam!");
        }
        score = 90;

        if (score > 90) {
            System.out.println("Excellent");
        } else {
            System.out.println("KEEP working");
        }
        int year = 2024;
        boolean isLockdown = year == 2020 || year == 2021;
        if (isLockdown) {
            System.out.println("Stay at home.");
        } else {
            System.out.println("Practice CODING");
        }
    }

}