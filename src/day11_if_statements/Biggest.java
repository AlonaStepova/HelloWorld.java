package day11_if_statements;

import java.util.Scanner;

/*

    declare and assign 3 int variables
    between the 3 numbers find the print the biggest one

 */
public class Biggest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        System.out.print("\tnum 1: ");
        int num1 = key.nextInt();

        System.out.print("\tnum 2: ");
        int num2 = key.nextInt();

        System.out.print("\tnum 3: ");
        int num3 = key.nextInt();

        System.out.println("the numbers you entered: " + num1 + ", " + num2 + ", " + num3 + ".");

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest one.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the biggest one.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the biggest one.");
        } else {
            System.out.println("You have entered same numbers!");
        }
    }
}
