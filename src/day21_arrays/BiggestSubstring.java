package day21_arrays;
public class BiggestSubstring {
    public static void main(String[] args) {

        String str = "aaabbbcccccddddeehhhhhhhhh";
        String first = "";
        String longest = "";


        for (int i = 0; i < str.length()-1; i++) {


            first += str.charAt(i);

            if (str.charAt(i) != str.charAt(i+1) ) { // When the character is not matching next one

                if (first.length() > longest.length()) {
                    longest = first;
                }

                first = "";

            }

            if ( i == str.length() - 2 ) {

                if (str.charAt(i+1) == str.charAt(i)) {
                    first += str.charAt(i+1);
                }

                if (first.length() > longest.length()) {
                    longest = first;
                }

                first = "";
            }

        }

        System.out.println(longest);







    }

}
