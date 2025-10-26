package WEEK_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This program demonstrates the solutions for Week 10 exercises,
 * covering ArrayList, HashSet, and HashMap.
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        // Run the demo for 10a) ArrayList
        demoArrayList();
        
        // Run the demo for 10b) HashSet
        demoHashSet();
        
        // Run the demo for 10c) HashMap
        demoHashMap();
    }

    /**
     * 10a) Demonstrates operations on an ArrayList
     */
    public static void demoArrayList() {
        System.out.println("--- 10a) ArrayList Demo (Student Names) ---");

        // Create an ArrayList to store student names
        List<String> studentNames = new ArrayList<>();

        // Add names to the list
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("Diana");
        System.out.println("Initial list: " + studentNames);

        // Remove a name by value
        studentNames.remove("Bob");
        System.out.println("After removing 'Bob' (by value): " + studentNames);

        // Remove a name by index (e.g., remove the first student)
        studentNames.remove(0); // Removes "Alice"
        System.out.println("After removing index 0: " + studentNames);

        // Update a name at a specific index
        // Let's update the first element (index 0, which is now "Charlie")
        studentNames.set(0, "Charles");
        System.out.println("After updating index 0: " + studentNames);

        // Add more names for iteration demo
        studentNames.add("Eve");

        // Display all names using a for-each loop
        System.out.println("\nDisplaying with for-each loop:");
        for (String name : studentNames) {
            System.out.println("- " + name);
        }

        // Display all names using an iterator
        System.out.println("\nDisplaying with Iterator:");
        Iterator<String> it = studentNames.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("- " + name);
        }
        System.out.println("----------------------------------------------\n");
    }

    /**
     * 10b) Demonstrates operations on a HashSet
     */
    public static void demoHashSet() {
        System.out.println("--- 10b) HashSet Demo (Unique Course Names) ---");

        // Create a HashSet to store unique course names
        Set<String> courseNames = new HashSet<>();

        // Add elements
        courseNames.add("Java");
        courseNames.add("Python");
        courseNames.add("Database");
        System.out.println("Initial set: " + courseNames);

        // Add a duplicate element
        boolean added = courseNames.add("Java");
        System.out.println("Tried to add 'Java' again (wasAdded: " + added + "): " + courseNames);

        // Remove an element
        courseNames.remove("Python");
        System.out.println("After removing 'Python': " + courseNames);

        // Search for elements (using contains)
        boolean hasJava = courseNames.contains("Java");
        boolean hasPython = courseNames.contains("Python");
        System.out.println("Set contains 'Java'? " + hasJava);
        System.out.println("Set contains 'Python'? " + hasPython);

        // Display all items using an enhanced for loop
        System.out.println("\nDisplaying with enhanced for-loop:");
        for (String course : courseNames) {
            System.out.println("- " + course);
        }
        System.out.println("---------------------------------------------\n");
    }

    /**
     * 10c) Demonstrates operations on a HashMap
     */
    public static void demoHashMap() {
        System.out.println("--- 10c) HashMap Demo (Student Roll Numbers & Names) ---");

        // Create a HashMap with Integer keys (Roll No) and String values (Name)
        Map<Integer, String> studentMap = new HashMap<>();

        // Add key-value pairs
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        System.out.println("Initial map: " + studentMap);

        // Update an entry (just 'put' with the same key)
        studentMap.put(102, "Robert (Bob)");
        System.out.println("After updating key 102: " + studentMap);

        // Remove an entry
        studentMap.remove(103);
        System.out.println("After removing key 103: " + studentMap);

        // Retrieve an entry
        String student101 = studentMap.get(101);
        String student103 = studentMap.get(103); // Will be null
        System.out.println("Student with Roll No 101: " + student101);
        System.out.println("Student with Roll No 103: " + student103);

        // Display all key-value pairs (using entrySet - the recommended way)
        System.out.println("\nDisplaying all entries (Key=Value):");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("------------------------------------------------\n");
    }
}

