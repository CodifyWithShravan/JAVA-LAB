
import java.util.Scanner;

/**
 * Week 1b: Find maximum and minimum values in an array
 */
public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        // Read 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Find max and min
        int max = numbers[0];
        int min = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }
        
        // Display results
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
        }
        System.out.println("\nMaximum: " + max);
        System.out.println("Minimum: " + min);
        
        scanner.close();
    }
}
