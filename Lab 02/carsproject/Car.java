// Sudent Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Lab Assignment 2 - Objects
// Submission Time: 16:55

package carsproject;

public class Car {
    private long VIN_number;
    private int year;
    private String model;
    private double mileage;
    
    /**
     * Constructs a basic car
     */
    public Car(){
        VIN_number = 0;
        year = 0;
        model = "NONE";
    }
    
    /**
     * Constructs a car with given parameters
     * @param input_VIN VIN number to be applied
     * @param input_year year to be applied
     * @param input_model model to be applied
     */
    public Car(long input_VIN, int input_year, String input_model){
        VIN_number = input_VIN;
        year = input_year;
        model = input_model;
    }
    
    /**
     * Sets the mileage of the car
     * @param input_mileage 
     */
    public void setMileage(double input_mileage){
        mileage = input_mileage;
    }
    
    /**
     * Returns vehicular information
     * @return vehicle info as a string
     */
    public String getInfo(){
        return year + " " + model + " " + "(VIN: " + VIN_number + ", mileage: " + String.format("%.1f", mileage) + " mile)";
    }
    
    
}
