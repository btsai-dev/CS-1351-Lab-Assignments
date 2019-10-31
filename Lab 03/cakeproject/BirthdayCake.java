// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Lab Assignment 3 - Inheritance
// Submission Time: 16:50

package cakeproject;

public class BirthdayCake extends Cake{
    private String firstName;
    private int age;
    
    /**
     * 
     * @param input_flavor
     * @param input_tiers
     * @param input_price
     * @param input_name
     * @param input_age 
     */
    public BirthdayCake(String input_flavor, int input_tiers, double input_price, String input_name, int input_age) {
        super(input_flavor, input_tiers, input_price);
        firstName = input_name;
        age = input_age;        
    }
    
    /**
     * Overrides and prints a card
     */
    @Override
    public void printCard(){
        System.out.println("Happy Birthday to " + firstName + "! You just turned " + age + " :)");
        super.printCard();
    }
    
}
