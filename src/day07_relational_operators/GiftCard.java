package day07_relational_operators;
/*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40

 */
public class GiftCard {
    public static void main (String [] args){

        double giftCardBalance = 200;
        double item1Price = 100;
        double item2Price = 70;

        System.out.println("Gift card balance is $ " + giftCardBalance +  ".");
        System.out.println("I bought item 1 for $" + item1Price);

        // giftCardBalance = giftCardBalance - item1Price;
        giftCardBalance -= item1Price; // this one is same as above, Just using SHORTAND operator

        System.out.println("After purchasing item 1, my gift card balance is $ " + giftCardBalance);
        System.out.println("I bought item 2 for $" + item2Price);

        // giftCardBalance = giftCardBalance - item2Price;
        giftCardBalance -= item2Price; // this one is same as above, Just using SHORTAND operator
        System.out.println("After purchasing item 2, my gift card balance is $ " + giftCardBalance);

    }
}
