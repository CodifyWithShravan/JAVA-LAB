package Week_10;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        // add
        students.put(1, "Alice");
        students.put(2, "Bob");

        // update
        students.put(2, "Bobby");

        // remove
        students.remove(1);

        // retrieve
        System.out.println("Student with roll 2: " + students.get(2));

        // display all
        System.out.println("All entries:");
        for (Map.Entry<Integer, String> e : students.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
