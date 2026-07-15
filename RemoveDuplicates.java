//PROBLEM: Write a program that takes an ArrayList containing duplicate integer values 
//         and creates a new ArrayList that contains only the unique elements.

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Initialize an ArrayList and add integer elements, including some duplicates (like 8)
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(8);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        System.out.println("Original List : " + arr);
        
        // Create a new ArrayList to store only unique elements
        ArrayList<Integer> Uniquelist = new ArrayList<>();
        
        // Iterate through the original list to check for uniqueness
        for (int i = 0; i < arr.size(); i++) {
            int element = arr.get(i);

            // If the element is not already present in the Uniquelist, add it
            if (!Uniquelist.contains(element)) {
                Uniquelist.add(element);
            }
        }

        // Compare sizes to check if any duplicates were removed
        if (arr.size() == Uniquelist.size()) {
            System.out.println("No duplicates found. The list was already unique.");
        } 
        else {
            System.out.println("Duplicates were removed.");
        }
        
        // Print the final list containing only unique integers
        System.out.println("Final list: " + Uniquelist);
    }
}