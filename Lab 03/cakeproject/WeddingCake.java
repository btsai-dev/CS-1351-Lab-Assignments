// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Lab Assignment 3 - Inheritance
// Submission Time: 16:50

package cakeproject;

public class WeddingCake extends Cake{
    private String groomsFirstName;
    private String bridesFirstName;
    
    /**
     * Creates a Wedding cake with additional parameters for the Cake class
     * @param input_flavor The flavor
     * @param input_tiers The tier
     * @param input_price The price
     * @param input_groom The groom's first name
     * @param input_bride The bride's first name
     */
    public WeddingCake(String input_flavor, int input_tiers, double input_price, String input_bride, String input_groom) {
        super(input_flavor, input_tiers, input_price);
        groomsFirstName = input_groom;
        bridesFirstName = input_bride;
    }
    
    /**
     * Overrides and print a card
     */
    @Override
    public void printCard(){
        System.out.println("Happy Wedding to " + bridesFirstName + " and " + groomsFirstName);
        super.printCard();
    }
    
    
}
