package Week_6;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Week 6a: Multiple exception handling demonstration
 */
public class MultipleExceptionDemo {
    
    public static void performDivision(int a, int b) {
        try {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
    
    public static void accessArray(int[] arr, int index) {
        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    
    public static void parseNumber(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: '" + str + "' is not a valid number");
        }
    }
    
    public static void processString(String str) {
        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot process null string");
        }
    }
    
    public static void multipleExceptions() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            int[] numbers = new int[size];
            
            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
            
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();
            
            System.out.print("Enter divisor: ");
            int divisor = scanner.nextInt();
            
            int result = numbers[index] / divisor;
            System.out.println("Result: " + numbers[index] + " / " + divisor + " = " + result);
            
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Invalid input format");
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException: Array size cannot be negative");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid index");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero");
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed - cleanup completed");
            scanner.close();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Multiple Exception Demo ===\n");
        
        // 1. ArithmeticException
        System.out.println("1. ArithmeticException Demo:");
        performDivision(10, 2);
        performDivision(15, 0);
        
        // 2. ArrayIndexOutOfBoundsException
        System.out.println("\n2. ArrayIndexOutOfBoundsException Demo:");
        int[] array = {10, 20, 30};
        accessArray(array, 1);
        accessArray(array, 5);
        
        // 3. NumberFormatException
        System.out.println("\n3. NumberFormatException Demo:");
        parseNumber("123");
        parseNumber("abc");
        
        // 4. NullPointerException
        System.out.println("\n4. NullPointerException Demo:");
        processString("Hello");
        processString(null);
        
        // 5. Multiple exceptions in one method
        System.out.println("\n5. Multiple Exceptions Demo:");
        multipleExceptions();
        
        System.out.println("\n=== Summary ===");
        System.out.println("✓ ArithmeticException - Division by zero");
        System.out.println("✓ ArrayIndexOutOfBoundsException - Invalid array access");
        System.out.println("✓ NumberFormatException - Invalid string to number conversion");
        System.out.println("✓ NullPointerException - Operations on null objects");
        System.out.println("✓ InputMismatchException - Invalid input type");
        System.out.println("✓ Finally block for cleanup operations");
    }
}
