package day17_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("How many numbers you want to compare?");
        int numOfCycle = key.nextInt();

        int n = 1;
        int userNum;
        String allNums = "";

        //-2,147,483,647 to 2,147,483,647

        int max = -2_147_483_647;
        int min = 2_147_483_647;
        while (n <= numOfCycle){
            System.out.println("Please, enter a number:");
            userNum = key.nextInt();

            allNums += " " + userNum;

            if (userNum > max){
                max = userNum;
            }
            if (userNum < min){
                min = userNum;
            }
            n++;
            System.out.println("The min number is: " +  min);
            System.out.println("The max number is: " + max);
            System.out.println("All numbers you have entered: " + allNums);

        }
    }
}
