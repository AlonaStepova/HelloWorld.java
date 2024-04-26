package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int validPin = 9812;
        int userInput;
        int attempts = 0;

        System.out.println("Welcome to ATM");

        do {
            System.out.println("Please, enter your PIN: ");
            userInput = key.nextInt();
            attempts++;

            if (userInput != validPin) {
                System.out.println("Your PIN is not valid, you have " +(3 - attempts) + " attempts.");
            }
        }
            while (attempts < 3 && userInput != validPin) ;
            attempts = 3 - attempts;

            if (userInput == validPin) {
                System.out.println("Your PIN is correct. Choose operation from the list: ");
            } else if (attempts == 0)
                System.out.println("You enter your PIN incorrectly for 3 times. Now your account is locked. You need reissue your card");
        }


    }
