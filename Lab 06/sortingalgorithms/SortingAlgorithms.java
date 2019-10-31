// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Lab Assignment 6 - Sorting Algorithms
// Submission Time: 17:40

package sortingalgorithms;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;


public class SortingAlgorithms {

    
    public static void main(String[] args) {
        
        System.out.println("Please enter the size of your file:");
        
        Scanner input = new Scanner(System.in);
        int listSize = input.nextInt();
        
        int[] array = new int[listSize];
        Random rand = new Random();
        
        for(int i= 0 ; i<listSize; i++)
            array[i] = rand.nextInt(1000);
        
        //int[] array2 = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Instant start = Instant.now();
        //long count = bubbleSort(array.clone());
        //long count = bubbleSort_shortCircuit(array.clone());
        long count = selectionSort(array.clone());
        //long count = insertionSort(array.clone());
        Instant finish = Instant.now();
        System.out.println(count);
        System.out.println("Time is: "+ Duration.between(start, finish).toMillis());
    }
    
    public static long bubbleSort(int[] array){
        long count = 0;
        for(int j = array.length - 1; j >= 0; j--){
            for(int i = 0; i < j; i ++){
                count ++;
                if (array[i] > array[i + 1]){
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        
        return count;
    }
    
    public static long bubbleSort_shortCircuit(int[] array){
        long count = 0;
        for(int j = array.length - 1; j >= 0; j--){
            boolean modded = false;
            for(int i = 0; i < j; i ++){
                count ++;
                if (array[i] > array[i + 1]){
                    modded = true;
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            if(!modded)
                break;
        }
        
        return count;
    }
    
    public static long selectionSort(int[] array){
        long count = 0;
        
        for (int i = 0; i < array.length; i++ ){
            int min = array[i];
            int min_loc = i;
            for (int j = i + 1; j < array.length; j++ ){
                count ++;
                if (array[j] < min){
                    min = array[j];
                    min_loc = j;
                }                
            }
            array[min_loc] = array[i];
            array[i] = min;
        }
        
        return count;
    }
    
    public static long insertionSort(int[] array){
        long count = 0;
        for (int i = 1; i < array.length; i++){
            int val = array[i];
            int j = i;
            while (j - 1 >= 0 && array[j - 1] > val){
                count++;
                array[j] = array[j - 1];
                j--;
            }
            array[j] = val;
        }
        return count;
    }
    
}
