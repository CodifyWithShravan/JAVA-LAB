package Week10;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> courses = new HashSet<>();
        courses.add("Math");
        courses.add("Physics");
        courses.add("Chemistry");
        courses.add("Math"); // duplicate ignored

        System.out.println("Contains Physics? " + courses.contains("Physics"));
        courses.remove("Chemistry");

        System.out.println("Courses:");
        for (String c : courses) System.out.println(c);
    }
}
