package WEEK_12;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * This program demonstrates the use of Lambda Expressions and
 * the common Built-in Functional Interfaces from java.util.function.
 */
public class LambdaAndFunctionalInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("--- Program 12: Lambdas & Functional Interfaces ---");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // --- Example 1: Predicate<T> ---
        // A Predicate takes one argument and returns a boolean.
        // We'll define a Predicate lambda that checks if a name starts with 'A'.
        System.out.println("\n1. Predicate (Names starting with 'A'):");
        Predicate<String> startsWithA = (name) -> name.startsWith("A");

        // We can use this predicate to filter a stream
        List<String> aNames = names.stream()
                .filter(startsWithA)
                .collect(Collectors.toList());
        System.out.println(aNames);

        // --- Example 2: Function<T, R> ---
        // A Function takes one argument (T) and returns a result (R).
        // We'll define a Function that takes a String and returns its length (Integer).
        System.out.println("\n2. Function (Length of each name):");
        Function<String, Integer> nameLength = (name) -> name.length();

        // We can use this function with map() to transform the list
        List<Integer> lengths = names.stream()
                .map(nameLength)
                .collect(Collectors.toList());
        System.out.println(lengths);

        // --- Example 3: Consumer<T> ---
        // A Consumer takes one argument and returns no result (void).
        // We'll define a Consumer that simply prints a value.
        System.out.println("\n3. Consumer (Print all numbers):");
        Consumer<Integer> printNumber = (number) -> System.out.println("Number: " + number);

        // We can use this consumer with forEach()
        numbers.forEach(printNumber);

        // --- Example 4: Supplier<T> ---
        // A Supplier takes no arguments and returns a result.
        // We'll define a Supplier that provides a default welcome message.
        System.out.println("\n4. Supplier (Get a default message):");
        Supplier<String> welcomeMessage = () -> "Hello, World!";
        System.out.println(welcomeMessage.get());

        // --- Example 5: Chaining them together ---
        // Let's find the lengths of all names that DON'T start with 'A',
        // and then print those lengths.
        System.out.println("\n5. Chaining: Print lengths of names not starting with 'A':");
        
        // We can use .negate() on a predicate
        Predicate<String> notStartsWithA = startsWithA.negate();
        Consumer<Integer> printLength = (len) -> System.out.println("Length: " + len);

        names.stream()
             .filter(notStartsWithA) // Predicate
             .map(nameLength)        // Function
             .forEach(printLength);   // Consumer
    }
}
