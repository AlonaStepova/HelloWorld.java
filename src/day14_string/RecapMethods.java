package day14_string;

public class RecapMethods {
    public static void main (String [] args){
        String s = "pen"; // s is a String declared by LITERALS and stored in STRING POOL in HEAP
        String s2 = new String("pen"); // s2 is a String declared by NEW KEYWORD and stored in HEAP

        System.out.println("Compare with ==: \t\t" + s == s2); // == ---> compares the MEMORY location. That's why the result is FALSE
        System.out.println("Compare with .equals():\t" + s.equals(s2)); // .equals(); ---> compare the VALUE. Since the values are same, the result is TRUE


        System.out.println("Compare with .equals():\t" + s.equals("Pen")); // pen vs Pen ---> false
        System.out.println("Compare with .equals():\t" + s.equalsIgnoreCase("Pen")); // pen vs Pen (with ignoring the case sensitiveness ---> true

        boolean isSame = s.equalsIgnoreCase("PENN");

        if (isSame){
            System.out.println("By ignoring the case sensitiveness the result is true");
        } else {
            System.out.println("Even ignoring the case sensitiveness the result is false because we comparing different words");
        }
        int numOfCharacters = s2.length();
        System.out.println("Number of characters in s2: " + numOfCharacters);

        int a = 9;
        // a.length(); we CANNOT do because this method belongs to String class
        int num = (a + "").length(); // a + "" ---> "9" ---> 1
        System.out.println(a);
        System.out.println((a + "").length()); // a + "" ---> "9" ---> 1
        System.out.println(a + ""); // 9 + "" ---> "9"

        if (num % 2 == 0){
            System.out.println("length of num is even number");
        } else {
            System.out.println("length of num is odd number");
        }
        String word = "loopcamp";
        if (word.length() % 2 == 0) {
            System.out.println("length of num is even number");
        }
        }

    }


