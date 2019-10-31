// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Assignment 5 - Object Oriented Design
// Submission Time: 17:10

package phonebookproject;

public class Person extends Contact implements Comparable<Person>{
    private String relationship;
    
    /**
     * Initializes a person contact
     * @param name Name
     * @param phone Phone number
     * @param relationship Relationship
     */
    public Person(String name, long phone, String relationship){
        super(name, phone);
        this.relationship = relationship;
    }
    
    /**
     * Compares each person by name (first in the getInfo)
     * @param person Person to be compared to
     * @return 1, 0, or -1
     */
    @Override
    public int compareTo(Person person){
        return this.getInfo().compareTo(person.getInfo());
    }
    
    /**
     * Returns name, phone, and relationship
     * @return 
     */
    public String getInfo(){
        return super.getinfo() + String.format("%-15s", relationship);
    }    


}
