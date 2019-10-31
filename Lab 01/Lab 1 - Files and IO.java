// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: lap Assignment 1 - Files and IO
// Submission Time: 17:14

package filesproject;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 *
 * @author btsai2
 */
public class FilesProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Please enter the number of files: ");
        Scanner user_input = new Scanner(System.in);
        int numOfFiles = user_input.nextInt();
        //System.out.println(numOfFiles);
        System.out.print("Pease enter the number of random integers: ");
        int numOfRandInts = user_input.nextInt();
        //System.out.println(numOfRandInts);
        
        populateFiles(numOfFiles, numOfRandInts);
        calculateStat(numOfFiles, numOfRandInts);       
        
    }
    
    /**
     * Populates files based on the number of files with a specified number of random integers
     * @param numberOfFiles Number of files to populate
     * @param numOfRandomInts Number of integers to populate with
     */
    public static void populateFiles(int numberOfFiles, int numOfRandomInts) throws FileNotFoundException
    {
        for ( int i = 1; i <= numberOfFiles; i++ ){
            String filename = "numbers_" + Integer.toString(i) + ".txt";
            PrintWriter newFile = new PrintWriter(filename);
            Random rand = new Random();
            for ( int num = 0; num < numOfRandomInts; num++ ){
                int randomInteger = rand.nextInt(9) + 1;
                newFile.println(randomInteger);
            }
            newFile.close();            
        }
       
    }
    
    
    /**
     * Calculates the summation and int mean of the numbers in the file, and saves it in stats.txt
     * @param numOfFiles Number of files to read from
     * @param numOfRandomInts Number of integers to read
     */
    public static void calculateStat(int numOfFiles, int numOfRandomInts) throws FileNotFoundException{
        PrintWriter output_file = new PrintWriter("stats.txt");
        
        for ( int i = 1; i <= numOfFiles; i++ ){
            String filename = "numbers_" + Integer.toString(i) + ".txt";
            File input_file = new File(filename);
            
            Scanner input = new Scanner(input_file);
            
            int sum = 0;
            double mean = 0;
            
            for ( int counter = 0; counter < numOfRandomInts; counter++ ){
                int num = input.nextInt();
               
                sum += num;  
            }
            
            input.close();
            
            mean = sum / numOfRandomInts;
            
            output_file.printf("%-16s %-7d %.3f \n", filename, sum, mean);
            
        }
        
        output_file.close();
        
        
    }
    
    
}
