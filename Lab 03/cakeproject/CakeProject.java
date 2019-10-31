// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Lab Assignment 3 - Inheritance
// Submission Time: 16:50

package cakeproject;

public class CakeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Wedding Cake example test
        WeddingCake wedCk = new WeddingCake("chocolate", 3, 355.0, "Sarah", "John");
        wedCk.printInvoice();
        wedCk.printCard();
        
        // Birthday Cake example test        
        BirthdayCake bdCk = new BirthdayCake("vanilla", 1, 20.0, "Alan", 15);
        bdCk.printInvoice();
        bdCk.printCard();
    }
    
}
