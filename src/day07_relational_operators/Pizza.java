package day07_relational_operators;
/*
    create a class Pizza
    add a main method
    declare and assign these variables:

       type of pizza,  the number of slices,  the number of people eating

    calculate how many slices each person will get
    calculate how many slices are left over

    Sample print statement:

       We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
 */
public class Pizza {
    public static void main (String [] args){
        String typeOfPizza = "Cheese";
        int numOfSlices = 10;
        int numOfPeople = 4;

        int slicePerPerson = numOfSlices / numOfPeople;
        int sliceLeftOver = numOfSlices % numOfPeople;

        String result = "We ordered " + typeOfPizza + " pizza with " + numOfSlices + " slices, for " + numOfPeople
                + " people, each of them ate " + slicePerPerson + " slises and " + sliceLeftOver + " slises left.";
        System.out.println(result);

    }
}
