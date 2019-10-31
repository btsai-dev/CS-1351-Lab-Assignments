// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Assignment 5 - Object Oriented Design
// Submission Time: 17:10

package phonebookproject;

public class Contact {
    private String name;
    private long phone;
    
    /**
     * Initializes a generic contact
     * @param name Name
     * @param phone Phone number
     */
    public Contact(String name, long phone){
        this.name = name;
        this.phone = phone;
    }
    
    /**
     * Returns name and phone
     * @return 
     */
    public String getinfo(){
        return String.format("%-20s%-15d", name, phone);
    }
}
