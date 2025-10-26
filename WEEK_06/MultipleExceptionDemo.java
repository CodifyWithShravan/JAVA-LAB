package WEEK_06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 6a) This program demonstrates handling multiple exceptions
 * using multiple catch blocks.
 */
public class MultipleExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // --- Code that can throw exceptions ---

            // 1. Potential ArrayIndexOutOfBoundsException
            int[] numbers = {10, 20, 30};
            System.out.println("Accessing array element 5...");
            // This line will throw the exception
            System.out.println(numbers[5]); 

            // 2. Potential ArithmeticException
            System.out.print("Enter a number to divide 100 by: ");
            int divisor = scanner.nextInt();
            int result = 100 / divisor; // Can throw ArithmeticException
            System.out.println("Result is: " + result);
            
            // 3. Potential InputMismatchException
            // (Note: The code above for ArithmeticException also handles this
            // if the user enters a non-number, but we'll put it in the
            // catch blocks anyway to show handling.)
            
        } catch (ArrayIndexOutOfBoundsException e) {
            
            // --- Handler for array index errors ---
            System.out.println("\n--- CATCH (Array Error) ---");
            System.out.println("Error: You tried to access an array element that does not exist.");
            System.out.println("Exception message: " + e.getMessage());

        } catch (ArithmeticException e) {
            
            // --- Handler for division by zero ---
            System.out.println("\n--- CATCH (Math Error) ---");
            System.out.println("Error: You cannot divide a number by zero.");
            System.out.println("Exception message: " + e.getMessage());

        } catch (InputMismatchException e) {
            
            // --- Handler for bad user input ---
            System.out.println("\n--- CATCH (Input Error) ---");
            System.out.println("Error: You must enter a valid integer.");
            System.out.println("Exception message: " + e.getMessage());

        } catch (Exception e) {
            
            // --- A generic handler for all other exceptions ---
            // This should always be the last catch block.
            System.out.println("\n--- CATCH (Generic Error) ---");
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            
            // --- Cleanup code ---
            // This block ALWAYS executes, whether an exception
            // happened or not.
            System.out.println("\n--- FINALLY ---");
            System.out.println("The 'finally' block is always executed.");
            scanner.close(); // Good practice to close the scanner here
        }

        System.out.println("\nProgram continues after the try-catch-finally blocks.");
    }
}

