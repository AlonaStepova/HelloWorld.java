package day09_a_scanner;

import java.util.Scanner;

public class UseNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is today");
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        input.nextLine(); // This nextLine is using to capture the Enter from previous Scanner method

        System.out.println("Enter your address");
        String address = input.nextLine();

        System.out.println("Enter your balance");
        double balance = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your job title"); //here we don't need to use empty nextLine because it's required for only any OTHER
        // Scanner methods if they are before nextLine
        String jobTitle = input.nextLine();

        System.out.println("Today is: " + day);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Job title: " + jobTitle);
    }
}
