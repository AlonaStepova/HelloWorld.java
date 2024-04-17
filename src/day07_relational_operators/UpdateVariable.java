package day07_relational_operators;

public class UpdateVariable {
    public static void main (String [] args){
        int a = 10;
        a = 11; // reassigning new value to a
        a++; // POSTINCREMENT - reassigning new value to a [a = a+1]
        ++a; // PREINCREMENT - reassigning new value to a [a = a+1]
        a = a + 1; // reassigning new value to a [a = a+1]

        // add 10

        a = a +10; // reassigning new value to a [a = a+10]
        a +=10; // reassigning new value to a [a = a+10] by using SHORTHAND operator

        System.out.println(a); // 34

        int b = 2;
        b *= 6; // b = 2 * + = 12
        System.out.println(b); // 12

        int c = 10;
        c %= 3; // c = c % 3; --> c = 10 % 3; ---> c = 1;
        System.out.println(c);

    }
}
