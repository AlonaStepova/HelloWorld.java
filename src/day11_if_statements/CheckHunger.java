package day11_if_statements;

import java.util.Scanner;

/*

    Task:

        boolean variable isHungry

        if the person is hungry,print: You are hungry, so I will get some food for you.

        if the person is not hungry, print: Great, then practice java

 */
public class CheckHunger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you hungry? [true/false]: ");

        boolean isHungry = input.nextBoolean();

        // Approach #1 - SINGLE IF Statement

        if (isHungry) {
            System.out.println("You are hungry, so I will get some food for you.");

        }
        if (!isHungry) {
            System.out.println("Great, then practice java!");
        }

        // Approach #2 - IF-ELSE Statement

        if (isHungry) {
            System.out.println("You are hungry, so I will get some food for you.");

        }
        else {
            System.out.println("Great, then practice java!");
        }

    }
}
