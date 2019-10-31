// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Lab Assignment 3 - Inheritance
// Submission Time: 16:50

package cakeproject;

import java.time.LocalDate;

public class Cake {
    private String flavor;
    private int tiers;
    private double price;
    
    /**
     * 
     * @param input_flavor
     * @param input_tiers
     * @param input_price 
     */
    public Cake(String input_flavor, int input_tiers, double input_price){
        flavor = input_flavor;
        tiers = input_tiers;
        price = input_price;
    }
    
    /**
     * Prints an invoice
     */
    public void printInvoice(){
        System.out.println("A " + tiers + " tier chocolate cake. The price is $" + String.format("%.2f", price) + ". Issued on: " + LocalDate.now());       
    }
    
    /**
     * Prints a card
     */
    public void printCard(){
        System.out.println("Thank you for choosing us!");
    }
}
