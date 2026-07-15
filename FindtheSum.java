//PROBLEM: Create an ArrayList of integers, add numbers from 1 to 10 to it, 
//         and calculate the sum of all elements present in the list.

import java.util.ArrayList;

public class FindtheSum {
    public static void main(String[] args) {
        // Create an ArrayList of type Integer
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Populate the ArrayList with numbers from 1 to 10 using a loop
        for(int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        System.out.println("Original List : " + arr);
        
        // Initialize a variable to hold the total sum
        int sum = 0;
        
        // Iterate through the ArrayList to calculate the sum of all elements
        for(int i = 0; i < arr.size(); i++) {
            // Retrieve each element by index and add it to the sum variable
            sum += arr.get(i);
        }
        
        // Print the final calculated sum
        System.out.println("Sum of all elements : " + sum);
    }
}