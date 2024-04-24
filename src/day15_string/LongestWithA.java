package day15_string;

import java.util.Locale;
import java.util.Scanner;

/*
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
public class LongestWithA {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Enter three words: ");
        String word1 = key.next().toLowerCase();
        String word2 = key.next().toLowerCase();
        String word3 = key.next().toLowerCase();

        int word1Length = word1.length();
        int word2Length = word2.length();
        int word3Length = word3.length();

        if (word1Length > word2Length && word1Length > word3Length && word1.contains("a")){
            System.out.println(word1 + " is longest.");
        } else if (word2Length > word1Length && word2Length > word3Length && word2.contains("a")) {
            System.out.println(word2 + " is longest.");
        } else if (word3Length > word1Length && word3Length > word2Length && word3.contains("a")){
            System.out.println(word3 + " is longest.");
        } else {
            System.out.println("There is no single longest word, or the longest word doesn't contain \"a\" in it.");
        }

    }
}
