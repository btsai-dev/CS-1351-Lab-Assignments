// Student Name: Brian Tsai
// LSU ID: btsai2
// Lab Section: 002
// Assignment: Lab Assignment 7 - Sorting in O(nlogn)
// Submission Time: 

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
        
        
        
        //long count = bubbleSort(array.clone());
        //long count = bubbleSort_shortCircuit(array.clone());
        //long count = selectionSort(array.clone());
        //long count = insertionSort(array.clone());
        
        //System.out.println("");
        //for (int i = 0; i < array.length; i++)
        //    System.out.println(array[i]);
        //System.out.println("");
        //quickSort(array, 0, array.length - 1);
        //for (int i = 0; i < array.length; i++)
        //    System.out.println(array[i]);
        //Instant finish = Instant.now();
        //System.out.println(count);
        //System.out.println("Time is: "+ Duration.between(start, finish).toMillis());
        
        /**
        int[] array2 = {9, 5, 3, 1 ,3 ,3, 3, 0, 5};
        mergeSort(array2, 0, array2.length - 1);
        for (int i = 0; i < array2.length; i++)
            System.out.println(array2[i]);
        **/
        
        
        long count = 0;
        Instant start0 = Instant.now();
        count = selectionSort(array.clone());
        Instant finish0 = Instant.now();
        System.out.println("Time is: "+ Duration.between(start0, finish0).toMillis());
        
        Instant start1 = Instant.now();
        count = insertionSort(array.clone());
        Instant finish1 = Instant.now();
        System.out.println("Time is: "+ Duration.between(start1, finish1).toMillis());
        
        int[] merging_array = array.clone();
        Instant start2 = Instant.now();
        mergeSort(merging_array, 0, merging_array.length - 1);
        Instant finish2 = Instant.now();
        System.out.println("Time is: "+ Duration.between(start2, finish2).toMillis());
        
        int[] quick_array = array.clone();
        Instant start3 = Instant.now();
        quickSort(quick_array, 0, quick_array.length - 1);
        Instant finish3 = Instant.now();
        System.out.println("Time is: "+ Duration.between(start3, finish3).toMillis());
        
    }
    
    public static void mergeSort(int[] array, int start, int end){
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            combine(array, start, mid, end);
        }
    }
    
    public static void combine(int[] array, int start, int mid, int end){
        int left_size = mid - start + 1;
        int right_size = end - mid;
        
        int[] left = new int[left_size];
        int[] right = new int[right_size];
        
        for (int i_0 = 0; i_0 < left_size; ++i_0) 
            left[i_0] = array[start + i_0]; 
        
        for (int i_1 = 0; i_1 < right_size; ++i_1) 
            right[i_1] = array[mid + 1 + i_1]; 
        
        int counter_l = 0;
        int counter_r = 0;
        
        int index = start;
        while (counter_l < left_size && counter_r < right_size){
            if(left[counter_l] <= right[counter_r]){
                array[index] = left[counter_l];
                counter_l++;
            }
            else{
                array[index] = right[counter_r];
                counter_r++;
            }
            index++;
        }
        
        while (counter_l < left_size){
            array[index] = left[counter_l];
            counter_l ++;
            index++;
        }
        while (counter_r < right_size){
            array[index] = right[counter_r];
            counter_r ++;
            index++;
        }
        
            
    }
    
    public static void quickSort(int[] array, int start, int end){
        if (start >= end)
            return;
        int j = partition(array, start, end);
        quickSort(array, start, j - 1);
        quickSort(array, j + 1, end);
    }
    
    public static int partition(int[] array, int start, int end){
        int pivot = array[start];
        int i = start - 1;
        int j = end + 1;
        
        while (i < j){
            i++;
            while (array[i] < pivot){
                i++;
            }
            j--;
            while (array[j] > pivot){
                j--;
            }
            if(i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return j;
        
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
