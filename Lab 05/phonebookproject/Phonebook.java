// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Assignment 5 - Object Oriented Design
// Submission Time: 17:10

package phonebookproject;

import java.util.ArrayList;
import java.util.Collections;

class Phonebook {
    private ArrayList<Person> person_list;
    private ArrayList<Business> business_list;
    
    /**
     * Initializes the phonebook with lists
     */
    public Phonebook(){
        person_list = new ArrayList();
        business_list = new ArrayList();
    }
    
    /**
     * Adds a person
     * @param name Person name
     * @param phone Person phone number
     * @param relationship Person relationship
     */
    public void addPerson(String name, long phone, String relationship){
        person_list.add(new Person(name, phone, relationship));
    }
    
    /**
     * Adds a business
     * @param name Business name
     * @param phone Business phone number
     * @param Zip Business zip
     */
    public void addBusiness(String name, long phone, int Zip){
        business_list.add(new Business(name, phone, Zip));        
    }
    
    /**
     * Prints the contact info in alphabetical order (name)
     */
    public void printContacts(){
        String line = "--------------------------------------------------";
        System.out.printf("%-20s%-15s%-15s\n", "Person name", "Phone", "Relationship");
        System.out.println(line);
        Collections.sort(person_list);
        Collections.sort(business_list);
        
        for (Person person: person_list){
            System.out.println(person.getInfo());            
        }
        
        System.out.println(line);
        System.out.printf("%-20s%-15s%-15s\n", "Business name", "Phone", "Zip");
        System.out.println(line);
        for (Business business: business_list){
            System.out.println(business.getInfo());            
        }
    }
}
