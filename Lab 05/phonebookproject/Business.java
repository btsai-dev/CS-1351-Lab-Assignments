// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Assignment 5 - Object Oriented Design
// Submission Time: 17:10

package phonebookproject;

public class Business extends Contact implements Comparable<Business>{
    private int Zip;
    
    /**
     * Intializes a business contact
     * @param name Name
     * @param phone Phone number
     * @param Zip Zip number
     */
    public Business(String name, long phone, int Zip){
        super(name, phone);
        this.Zip = Zip;
    }
    
    /**
     * Compares each business by name (first in the getInfo)
     * @param business Business to be compared to
     * @return 
     */
    @Override
    public int compareTo(Business business){
        return this.getInfo().compareTo(business.getInfo());
    }
    
    /**
     * Returns name, phone, and zip
     * @return 
     */
    public String getInfo(){
        return super.getinfo() + String.format("%-15d", Zip);
    } 
    
}
