package WEEK_13;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * This program demonstrates the use of the Optional class to handle
 * null values safely and Method References as shorthand for lambdas.
 */
public class OptionalAndMethodRefDemo {

    // A helper list for our Optional demo
    private static final List<String> USER_DATABASE = Arrays.asList("Alice", "Charlie", "David");

    /**
     * A helper method that returns an Optional.
     * It searches for a name and returns an Optional<String> if found,
     * or Optional.empty() if not found.
     */
    public static Optional<String> findUserByName(String name) {
        if (USER_DATABASE.contains(name)) {
            return Optional.of(name); // Value is present
        }
        return Optional.empty(); // Value is absent
    }

    public static void main(String[] args) {

        // --- Part 1: Optional Class Demo ---
        System.out.println("--- Program 13b Part 1: Optional Class ---");

        // Example 1: Value is Present
        System.out.println("\nSearching for 'Alice':");
        Optional<String> userAlice = findUserByName("Alice");
        
        // Good: Using ifPresent() to perform an action
        userAlice.ifPresent(name -> System.out.println("Found user: " + name));

        // Example 2: Value is Absent
        System.out.println("\nSearching for 'Bob':");
        Optional<String> userBob = findUserByName("Bob");

        // Check using isPresent()
        if (userBob.isPresent()) {
            System.out.println("Found user: " + userBob.get()); // .get() is safe here
        } else {
            System.out.println("User 'Bob' not found.");
        }

        // Better: Using orElse() to provide a default value
        String foundUser = userBob.orElse("Guest");
        System.out.println("User to greet: " + foundUser);

        // Example 3: Using map() on an Optional
        // The 'map' operation only runs if the Optional is not empty.
        String upperAlice = userAlice.map(String::toUpperCase).orElse("NOT_FOUND");
        String upperBob = userBob.map(String::toUpperCase).orElse("NOT_FOUND");
        System.out.println("\nUppercase Alice: " + upperAlice);
        System.out.println("Uppercase Bob: " + upperBob);


        // --- Part 2: Method References Demo ---
        System.out.println("\n--- Program 13b Part 2: Method References ---");

        List<String> names = Arrays.asList("anna", "bob", "charlie");
        List<String> strNumbers = Arrays.asList("1", "2", "3");

        // Type 1: Reference to a static method (ClassName::staticMethod)
        System.out.println("\n1. Static Method Reference (Integer::parseInt):");
        // Lambda: .map(s -> Integer.parseInt(s))
        List<Integer> numbers = strNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numbers);

        // Type 2: Reference to an instance method of a particular object (object::instanceMethod)
        System.out.println("\n2. Instance Method Reference (System.out::println):");
        // Lambda: .forEach(s -> System.out.println(s))
        names.stream().forEach(System.out::println);

        // Type 3: Reference to an instance method of an arbitrary object (ClassName::instanceMethod)
        System.out.println("\n3. Arbitrary Object Instance Method (String::toUpperCase):");
        // Lambda: .map(s -> s.toUpperCase())
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperNames);

        // Type 4: Reference to a constructor (ClassName::new)
        System.out.println("\n4. Constructor Reference (Person::new):");
        // Lambda: .map(name -> new Person(name))
        List<Person> people = names.stream()
                .map(Person::new)
                .collect(Collectors.toList());
        
        people.forEach(person -> System.out.println("Created: " + person.getName()));
    }
}

/**
 * A helper class for the Constructor Reference demo.
 */
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor called for: " + name);
    }

    public String getName() {
        return name;
    }
}
