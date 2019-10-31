// Sudent Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Lab Assignment 2 - Objects
// Submission Time: 16:55

package carsproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CarsProject {

    public static void main(String[] args) throws FileNotFoundException{
        // First car
        Car c1 = new Car(12313131, 2009, "Camry");
        c1.setMileage(60000);
        saveCarInfo(c1.getInfo());
        
        // Second car
        Car c2 = new Car(95645421, 2010, "Accord");
        c2.setMileage(95000);
        saveCarInfo(c2.getInfo());
           
        // Third car
        Car c3 = new Car(45746587, 2019, "CX5");
        c3.setMileage(600);
        saveCarInfo(c3.getInfo());
    }
    
    /**
     * Saves car info to the file carInfo.txt
     * @param data Data to be saved
     * @throws FileNotFoundException 
     */
    public static void saveCarInfo(String data) throws FileNotFoundException{
        PrintWriter output = new PrintWriter(new FileOutputStream(new File("carInfo.txt"), true));
        output.println(data);
        output.close();
    }
    
}
