package day11_if_statements;

public class TernaryExample {
    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd;

        // Approach #1 - with IF-ELSE
        if (a % 2 == 0) {
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }
        System.out.println("The number is " + evenOrOdd);

        // Approach #2 - with TERNARY

        evenOrOdd = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + evenOrOdd);

        System.out.println("---------------------------");

        int num = -4;
        String posOrNeg;
        if (num < 0){
            posOrNeg = "Negative";
        } else {
            posOrNeg = "Positive";
        }
        System.out.println(posOrNeg);

        posOrNeg = (num >= 0) ? "Positive" : "Negative";
        System.out.println(posOrNeg);

        System.out.println("----------------------");

        int time = 12;
        double price;

        // If time is between 10 and 15, the price is 7.99, else price is 10.99
        if (time >= 10 && time <= 15){
            price = 7.99;
        } else {
            price = 10.99;
        }
        System.out.println("Price is: $" + price + ".");

        price = (time >= 10 && time <= 15) ? 7.99 : 10.99;
        System.out.println("Price is: $" + price + ".");
    }
}
