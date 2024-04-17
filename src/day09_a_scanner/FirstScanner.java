package day09_a_scanner;

import java.util.Scanner;

public class FirstScanner {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object declaration / instantiation; input is the object REFERENCE name

        System.out.println("Please enter a number: ");
        int userNumber = input.nextInt(); //Returns input as int --> Therefore I can assign it into int variable

        System.out.println("You entered: " + userNumber); // We get the value for console

    }
}
