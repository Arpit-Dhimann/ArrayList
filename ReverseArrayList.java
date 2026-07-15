//PROBELM: Create an ArrayList of strings (e.g., names of cities) and reverse the order of 
//         elements in the list without using the built-in Collections.reverse() method.

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store the city name characters
        ArrayList<String> str = new ArrayList<>();
        
        // Add individual characters of the city name
        str.add("D");
        str.add("E");
        str.add("H");
        str.add("R");
        str.add("A");
        str.add("D");
        str.add("U");
        str.add("N");
        System.out.println("Original List = " + str);

        // Calculate the middle index to perform swapping efficiently
        // We only need to iterate halfway through the list
        int n = str.size() / 2;
        
        for (int i = 0; i < n; i++) {
            // Get the element from the front (left side)
            String front = str.get(i);

            // Get the corresponding element from the back (right side)
            String back = str.get(str.size() - 1 - i);

            // Swap the front element with the back element
            str.set(i, back);
            str.set(str.size() - 1 - i, front);
        }
        
        // Print the final reversed list
        System.out.println("Reversed List : " + str);
    }    
}