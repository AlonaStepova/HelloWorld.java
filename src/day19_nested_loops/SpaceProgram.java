package day19_nested_loops;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    Space program [String, Loops]

    Given a String return a version of with spaces between all of the letters.
    If there is already a space in the String put an underscore

        Ex: java    -> j a v a
            space     -> s p a c e
            more words -> m o r e _ w o r d s

 */
public class SpaceProgram {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter your text: ");

        String userWord = key.nextLine();
        String result = "";

        for (int i = 0; i < userWord.length(); i++) {

            if (userWord.charAt(i) == ' '){
                result += "_" + " ";
            } else {
                result += userWord.charAt(i) + " ";
            }

        }
        System.out.println(result.trim());
    }
}
