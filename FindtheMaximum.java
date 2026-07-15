//PROBLEM: Write a Java program to create an ArrayList of integers, add some 
//         random numbers to it, and find the largest number in the list.

import java.util.ArrayList;

public class FindtheMaximum {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> arr = new ArrayList<>();

        // Add random integer values to the list
        arr.add(6);
        arr.add(1);
        arr.add(9);
        arr.add(4);
        arr.add(2);
        System.out.println("Original list: " + arr);

        // Assume the first element is the largest initially
        int largest = arr.get(0);

        // Iterate through the list to compare each element with 'largest'
        for (int i = 0; i < arr.size(); i++) {
            // If the current element is greater than 'largest', update 'largest'
            if (largest < arr.get(i)) {
                largest = arr.get(i);                
            }
        }
        
        // Output the final largest value found in the ArrayList
        System.out.println("Largest element is: " + largest);
    }
}