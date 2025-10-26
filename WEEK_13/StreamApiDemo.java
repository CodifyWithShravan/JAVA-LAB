package WEEK_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This program demonstrates various operations available in the Java Stream API,
 * showcasing the functional style of programming.
 */
public class StreamApiDemo {

    public static void main(String[] args) {

        // --- Sample Data ---
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna", "Alex");

        System.out.println("--- Program 13a: Stream API Operations ---");

        // --- Example 1: filter() and forEach() ---
        // 'filter' is an intermediate operation that selects elements based on a condition.
        // 'forEach' is a terminal operation that performs an action for each element.
        System.out.println("\n1. Even numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0) // Lambda expression as a Predicate
               .forEach(System.out::println); // Method reference for a Consumer

        // --- Example 2: map() and collect() ---
        // 'map' is an intermediate operation that transforms each element.
        // 'collect' is a terminal operation that gathers results into a collection.
        System.out.println("\n2. Names in uppercase:");
        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase()) // Lambda expression as a Function
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);

        // --- Example 3: Chaining multiple operations ---
        // Get a list of squares of all odd numbers.
        System.out.println("\n3. Squares of odd numbers:");
        List<Integer> squaresOfOdds = numbers.stream()
                .filter(n -> n % 2 != 0) // Filter for odd numbers
                .map(n -> n * n)          // Map to their squares
                .collect(Collectors.toList()); // Collect into a new list
        System.out.println(squaresOfOdds);

        // --- Example 4: reduce() ---
        // 'reduce' is a terminal operation that combines all elements into a single result.
        System.out.println("\n4. Sum of all numbers:");
        // The '0' is the identity (starting value).
        // (a, b) -> a + b is the accumulator function.
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum is: " + sum);

        // --- Example 5: sorted() and distinct() ---
        // 'sorted' and 'distinct' are stateful intermediate operations.
        List<Integer> duplicateNumbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);
        System.out.println("\n5. Sorted list of unique numbers:");
        List<Integer> uniqueSorted = duplicateNumbers.stream()
                .distinct() // Keeps only unique elements (1, 3, 4, 5, 9, 2, 6)
                .sorted()   // Sorts them (1, 2, 3, 4, 5, 6, 9)
                .collect(Collectors.toList());
        System.out.println(uniqueSorted);

        // --- Example 6: anyMatch() ---
        // 'anyMatch' is a short-circuiting terminal operation.
        // It stops as soon as it finds a match.
        System.out.println("\n6. Does any name start with 'A'?");
        boolean startsWithA = names.stream()
                .anyMatch(name -> name.startsWith("A"));
        System.out.println(startsWithA); // true
    }
}

