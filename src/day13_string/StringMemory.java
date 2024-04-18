package day13_string;

public class StringMemory {
    public static void main(String[] args) {

        String str1 = "java"; // Option 1 - STRING LITERALS - just a double quotation

        String str2 = new String("java"); // Option 2 - by 'new' KEYWORD

        String str3 = "java";
        String str4 = new String("java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);


    }
}
