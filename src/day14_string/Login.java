package day14_string;

import java.util.Locale;
import java.util.Scanner;

/*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */
public class Login {
    public static void main(String[] args) {

        String expectedPassword = "loopcamp!";
        String expectedUsername = "java";

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your username: ");
        String username = key.next();
        username = username.toLowerCase();
        System.out.print("Please, enter your password: ");
        String userPassword = key.next();

        if (userPassword.length() > 8 && expectedPassword.equals(userPassword) && expectedUsername.equalsIgnoreCase(username)) {
            System.out.println("You are logged in.");
        }
    }
}