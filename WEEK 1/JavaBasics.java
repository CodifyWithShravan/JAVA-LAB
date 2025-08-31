public class JavaBasics {
    public static void main(String[] args) {
        System.out.println("=== Java Fundamentals ===\n");
        
        // 1. Data Types
        System.out.println("1. Data Types:");
        int age = 25;
        double salary = 50000.50;
        char grade = 'A';
        boolean isActive = true;
        String name = "John";
        
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Active: " + isActive);
        System.out.println("Name: " + name);
        
        // 2. Variables
        System.out.println("\n2. Variables:");
        int x = 10;
        int y = 5;
        System.out.println("x = " + x + ", y = " + y);
        
        // 3. Operators
        System.out.println("\n3. Operators:");
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x > y = " + (x > y));
        System.out.println("x == y = " + (x == y));
        
        // 4. Control Structures
        System.out.println("\n4. Control Structures:");
        
        // If-else
        int marks = 85;
        if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
        
        // For loop
        System.out.println("\nCounting 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        
        // While loop
        System.out.println("\n\nCountdown:");
        int count = 3;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println("Done!");
    }
}