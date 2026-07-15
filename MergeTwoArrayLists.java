//PROBLEM: Create two separate ArrayLists of strings (e.g., two different groups of friends), 
//         merge them into a single ArrayList, and print the final combined list.

import java.util.ArrayList;

public class MergeTwoArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList of strings for the first group of friends
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("ARPIT");
        str1.add("RAHUL");
        System.out.println("str1 is : " + str1);

        // Create the second ArrayList of strings for the second group of friends
        ArrayList<String> str2 = new ArrayList<>();
        str2.add("AMIT");
        str2.add("RAJ");
        System.out.println("str2 is : " + str2);

        // Merge the second ArrayList into the first one using addAll()
        // This adds all elements of str2 to the end of str1
        str1.addAll(str2);
        
        // Print the final combined ArrayList
        System.out.println("Merge final str1 + str2 : " + str1);
    }
}