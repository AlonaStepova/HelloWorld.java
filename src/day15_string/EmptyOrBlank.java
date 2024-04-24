package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "new example";
        System.out.println(str.isEmpty()); // It has characters. So ---> false

        str = " ";
        System.out.println(str.isEmpty()); // It still has a spase - empty character. So ---> false

        str = "";
        System.out.println(str.isEmpty()); // IT IS COMPLETELY EMPTY ---> So ---> true

        System.out.println(str.length());
        if (str.length() == 0){
            System.out.println("No characters");
        }
        // str = ""
        System.out.println(str.isBlank());

        str = "Hello World!";
        System.out.println(str.isBlank()); // We have characters other than empty space ---> false

        str = " ";
        System.out.println(str.isBlank()); // ONLY EMPTY SPACE ---> true

        str = "          ";
        System.out.println(str.isBlank());

    }
}
