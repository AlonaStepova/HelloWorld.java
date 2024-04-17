package day09_a_scanner;

import java.util.Scanner;

/*
       create Scanner object
       ask the user to enter 3 numbers
       find and print the sum of the numbers
    */
public class AddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers and press enter after each.");
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = input.nextInt();

        int total = num1 + num2 + num3;

        System.out.println("The sum of the numbers you entered is: " + total);
        int afterDivision = total/2;
        System.out.println("After division by 2 it would be: " + afterDivision);
        System.out.println("After adding 2 it would be: " + (total + 2));


    }
}
