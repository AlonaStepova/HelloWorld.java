package day09_a_scanner;

import java.util.Scanner;

/*
    Ask the user to enter their age (byte),
    ask them to enter their favorite number (long),
    and ask them to enter their favorite book
    Print all the values from the inputs
 */
public class YourInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your favorite book:");
        String bookName = input.nextLine();

        System.out.println("Enter your age:");
        byte age = input.nextByte();

        System.out.println("Enter your favorite number:");
        long favNumber = input.nextLong();

        System.out.println("Information:");
        System.out.println("\t" + age);
        System.out.println("\t" + favNumber);
        System.out.println("\t" + bookName);
    }
}