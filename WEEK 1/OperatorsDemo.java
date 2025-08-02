public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // Assignment Operators
        int c = 20;
        c += 5; // Equivalent to c = c + 5;
        System.out.println("\nAssignment Operators:");
        System.out.println("c after c += 5: " + c);

        // Unary Operators
        int d = 7;
        System.out.println("\nUnary Operators:");
        System.out.println("d++: " + (d++)); // Post-increment (uses then increments)
        System.out.println("d after d++: " + d);
        int e = 7;
        System.out.println("++e: " + (++e)); // Pre-increment (increments then uses)
    }
}