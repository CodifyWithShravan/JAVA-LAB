package WEEK_06;

import java.util.Scanner;

/**
 * 6b) Step 1: Create the custom exception class InvalidAgeException.
 * It must extend java.lang.Exception.
 */
class InvalidAgeException extends Exception {
    
    /**
     * A constructor that takes a message and passes it
     * to the parent Exception class's constructor.
     * @param message The error message for this exception.
     */
    public InvalidAgeException(String message) {
        super(message);
    }
}

/**
 * 6b) Step 2: Main class to test the custom exception.
 */
public class CustomExceptionDemo {

    /**
     * A helper method that checks the age and throws
     * our custom exception if the age is invalid.
     * @param age The age to validate
     * @throws InvalidAgeException if age is less than 18
     */
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Step 3: Use the 'throw' keyword to throw our exception
            throw new InvalidAgeException("Invalid Age: User must be 18 or older to register.");
        } else {
            System.out.println("Age is valid (" + age + "). Registration successful.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- 6b) Custom Exception Demo ---");
        System.out.print("Please enter your age: ");

        try {
            int age = scanner.nextInt();
            
            // Step 4: Call the "risky" method from within a try block
            validateAge(age);
            
        } catch (InvalidAgeException e) {
            
            // Step 5: Catch our specific custom exception
            System.out.println("\n--- CATCH (InvalidAgeException) ---");
            System.out.println("Registration failed.");
            // e.getMessage() will return the string we passed to the constructor
            System.out.println("Error details: " + e.getMessage());
            
        } catch (java.util.InputMismatchException e) {
            
            // Also good to handle bad input
            System.out.println("\n--- CATCH (Input Error) ---");
            System.out.println("Error: Please enter a valid number for age.");

        } finally {
            scanner.close();
            System.out.println("\n--- FINALLY ---");
            System.out.println("Age verification process complete.");
        }
    }
}

