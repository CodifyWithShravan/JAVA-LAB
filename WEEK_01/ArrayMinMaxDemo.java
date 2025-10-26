package WEEK_01;

import java.util.Scanner;

/**
 * 1b) This program reads 10 integers into an array
 * and prints the maximum and minimum values.
 */
public class ArrayMinMaxDemo {

    public static void main(String[] args) {
        System.out.println("--- 1b) Array Min/Max Demo ---");

        // 1. Create an array to hold 10 integers
        int[] numbers = new int[10];
        
        // 2. Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers, pressing Enter after each:");

        // 3. Loop to read 10 integers into the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 4. Find the max and min values
        
        // --- Important: Initialize min and max to the FIRST element ---
        int min = numbers[0];
        int max = numbers[0];

        // 5. Loop through the *rest* of the array (start from i = 1)
        for (int i = 1; i < numbers.length; i++) {
            
            // Check for a new maximum
            if (numbers[i] > max) {
                max = numbers[i]; // Found a new max
            }

            // Check for a new minimum
            if (numbers[i] < min) {
                min = numbers[i]; // Found a new min
            }
        }

        // 6. Display the results
        System.out.println("\n--- Results ---");
        System.out.println("You entered the following numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nMaximum value: " + max);
        System.out.println("Minimum value: " + min);
        scanner.close();
    }
}
