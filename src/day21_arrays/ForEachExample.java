package day21_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {


        int [] nums = {3, 4, 5, 7};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("-------------------------------");

        // This is foreach loop
        for (int eachElement : nums){
            System.out.println(eachElement);
        }
        System.out.println();

        String [] classes = {"java", "softskills", "selunium", "database", "api"};
        for (String eachElement : classes){
            System.out.println("ForEach loop: " +eachElement);
        }
        System.out.println();

        for (int i = 0; i < classes.length; i++) {
            System.out.println("Traditional loop: " + classes[i]);

        }
        System.out.println();
        double [] nums2 = {23, 43, 34, 2};
        for (double eachElem : nums2){
            System.out.println("ForEach: " + nums2);
        }
        System.out.println();
        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Traditional: " + nums2);

        }
        System.out.println();
        // The difference between fori and foreach loop when to use.
        String [] names = new String[4];

        for ( String each : names) {
            each = "Test";
            System.out.println(each);
        }
        System.out.println();
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            names[i] = "Test";
            System.out.println(names);
        }
        System.out.println(Arrays.toString(names));

    }
}
