package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String str = "loopcamp";
        char [] letters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            letters [i] = str.charAt(i);

        }
        System.out.println(Arrays.toString(letters));

        char [] letters2 = str.toCharArray();
        System.out.println(Arrays.toString(letters2));

        String word = "java";

        // word.toCharArray();

        for (char each : word.toCharArray()){
            System.out.println(each
            );
        }


    }
}
