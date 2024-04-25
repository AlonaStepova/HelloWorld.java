package day16_loops;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please, enter a sentence: ");
        String sentence = key.nextLine().trim(); // Java is fun language

        // Take the part from sentence - .substring(0, )
        // How do I get the index of first space? --> .indexOf(" ");


        String firstWord = sentence.substring(0, sentence.indexOf(" "));

        String restOfSentence = sentence.substring(sentence.indexOf(" ") + 1);

        System.out.println(restOfSentence + " " + firstWord);



    }
}
