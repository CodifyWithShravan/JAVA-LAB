package WEEK_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 3b) This program sorts a given list of names in ascending order.
 */
public class SortingDemo {

    public static void main(String[] args) {
        System.out.println("--- 3b) Sorting Names Demo ---");

        // 1. Create a List and add names
        // We use ArrayList, which is a common type of List
        // We can use Arrays.asList to quickly create a list
        List<String> names = new ArrayList<>(
            Arrays.asList("Charlie", "Alice", "David", "Bob", "Eve")
        );

        // 2. Display the list before sorting
        System.out.println("Before sorting: " + names);

        // 3. Sort the list
        // Collections.sort() sorts the list "in-place"
        // For Strings, it sorts alphabetically (ascending order) by default.
        Collections.sort(names);

        // 4. Display the list after sorting
        System.out.println("After sorting:  " + names);
    }
}

