package day11_if_statements;

import java.util.Scanner;

/*

    create a double variable for your hourly rate
    create a double variable for the number of hours worked per week

    calculate your net pay, with consideration of overtime pay

        if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
            (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
 */
public class Overtime {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        // double hourlyRate = 40; - HARDCODED
        // double nomOfHours = 44; - HARDCODED
        System.out.println("Enter your hourly rate; $");

        double hourlyRate = key.nextDouble();   // - DYNAMIC

        System.out.println("Enter your total working hours per week: ");
        double numOfHours = key.nextDouble();

        double netPay;
        String message = "";

        // double overtimeRate = hourlyRate * 1.5;

        if (numOfHours > 40) {
            // netPay = 40 * hourlyRate; // netPay with regular hours and hour pay
            netPay = (40 * hourlyRate) + ((numOfHours - 40) * (hourlyRate * 1.5));
            message = "You worked " + numOfHours + " hours at a rate of " + hourlyRate + ". Since you have overtime, your total pay is $" + netPay;
        } else {
            netPay = numOfHours * hourlyRate;
            message = "You worked " + numOfHours + " hours at a rate of " + hourlyRate + ". There was NO OVERTIME. Your total pay is $" + netPay;
        }
        System.out.println(message);

    }

}
