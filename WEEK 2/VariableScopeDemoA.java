    /*
 * This program demonstrates the scope of local variables.
 * A variable declared inside one method (e.g., main) is not accessible
 * from another method.
 */
public class VariableScopeDemoA {

    // Method to attempt to print a value from another method's scope.
    // This method will NOT compile if 'x' is not passed as a parameter.
    // The commented-out code below illustrates a common error.
    /*
    public void printValue() {
        // ERROR: Cannot find symbol 'x'.
        // 'x' is local to the main method and is not in scope here.
        System.out.println("Attempting to access x: " + x);
    }
    */

    // This is the correct way to share data between methods.
    // The value of x is passed as an argument.
    public void printValue(int value) {
        System.out.println("The value of the variable passed from main() is: " + value);
    }

    public static void main(String[] args) {
        // 'x' is a local variable to the main() method.
        int x = 10;

        System.out.println("Inside main(), the value of x is: " + x);

        // Create an object to call the instance method.
        VariableScopeDemoA demo = new VariableScopeDemoA();

        // Calling the method correctly by passing 'x' as an argument.
        demo.printValue(x);

        // If you uncomment the line below, it would attempt to call the non-compiling method.
        // demo.printValue();
    }
}
