package day08_scanner_logical_operators;
/*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

    print : $name is eligible to vote: $boolean

 */
public class eligibleToVote {
    public static void main (String [] args){
        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean isCryminal = false;
        int age = 49;

        boolean isEligible = age >= 18 && isCitizen && !isCryminal;
        System.out.println("Tom Jerry is eligible to vote: " + isEligible);

        String name2 = "Vinnie Pooh";
        boolean isCitizen2 = true;
        boolean isCryminal2 = true;
        int age2 = 59;

        boolean isEligible2 = age2 >= 18 && isCitizen2 && !isCryminal2;
        System.out.println("Vinnie Pooh is eligible to vote: " + isEligible2);


    }
}
