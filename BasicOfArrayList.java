import java.util.ArrayList;
import java.util.Collections;

public class BasicOfArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of Integer type to store a list of numbers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the end of the list
        list.add(9);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(8);
        System.out.println("Initial List : " + list);

        // Retrieve an element at a specific index (index 3)
        System.out.println("Element at index 3: " + list.get(3));

        // Insert an element at a specific index
        list.add(0, 1);
        System.out.println("After adding 1 at index 0: " + list);

        // Replace/Update an element at a specific index without shifting others
        list.set(1, 3);
        System.out.println("After setting 3 at index 1: " + list);

        // Remove an element located at a specific index
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        // Get the current number of elements in the ArrayList
        System.out.println("Size of the list: " + list.size());

        // Iterate/Loop through the list to print each element individually
        System.out.print("Looping through the list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sort the list elements in ascending order using the Collections utility class
        Collections.sort(list);
        System.out.println("Ascending Sorted list: " + list);

        // Sort the list in Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Sorted list: " + list);
    }
}