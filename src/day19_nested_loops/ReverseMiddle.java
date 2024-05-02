package day19_nested_loops;
/*
    Reverse only second word [String, Loops]

    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
        Ex:
        I love java

        Ouput:
        I evol java
 */
public class ReverseMiddle {
    public static void main(String[] args) {
        String str = "You love java";

        int firstSpaceIndex = str.indexOf(" ");
        int lastSpaceIndex = str.lastIndexOf(" ");

        String middle = str.substring(firstSpaceIndex+1, lastSpaceIndex);
        System.out.println(middle);

        String reversed = "";

        for (int i = middle.length()-1; i >= 0; i--) {

            reversed += middle.charAt(i);

        }
        System.out.println(reversed);
        System.out.println(str.substring(0, firstSpaceIndex) + " " + reversed + str.substring(lastSpaceIndex));
    }
}
