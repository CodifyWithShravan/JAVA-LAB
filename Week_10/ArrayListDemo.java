package Week10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        // Add names
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        // Remove by value and index
        students.remove("Bob");
        students.remove(1); // removes index 1 (after previous removal)

        // Update at index
        students.add("David");
        students.set(1, "Eve");

        // Display using for-each
        System.out.println("For-each loop:");
        for (String s : students) System.out.println(s);

        // Display using iterator
        System.out.println("Iterator:");
        Iterator<String> it = students.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
