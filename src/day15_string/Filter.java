package day15_string;

import java.util.Scanner;

/*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
 */
public class Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter your message: ");
        String msg = input.nextLine();
        msg = msg.trim();
        String originalMsg = msg;
        msg = msg.toLowerCase();

        boolean hasBadWords = msg.contains("java is bad") || msg.contains("quit") || msg.contains("have fun") || msg.contains("crying");
        if (hasBadWords) {
            System.out.println("Your message is failed to send");
        } else {
            System.out.println("\"" + originalMsg  + "\" was sent!");
        }
    }
}