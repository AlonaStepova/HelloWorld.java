package day16_loops;

public class HelloWorld {
    public static void main(String[] args) {

        // hey, can you print this 5 times?

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        // can you print this 100 times?
        System.out.println("----------------------------");

        int num = 1;

        while (num <= 100){
            System.out.println("Hello World!");
            num++;
        }
        System.out.println("----------------------");
        int num2 = 100;
        while (num2 <= 100) {
            System.out.println("Hello Word!");
            num2++;

            System.out.println("----------------------");

            int z = 1;
            while (z <= 50){
                System.out.println("Line " + z++);
            }
            System.out.println(z);
        }

    }
}
