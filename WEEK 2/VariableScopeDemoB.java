/*
 * This program demonstrates the key differences between instance and local variables.
 *
 * Instance Variable: A variable declared inside a class but outside any method.
 * Its lifetime is tied to the object, and it retains its value
 * between method calls.
 * Local Variable:    A variable declared inside a method.
 * Its lifetime is the duration of the method call, and it is
 * re-created and re-initialized every time the method is invoked.
 */
public class VariableScopeDemoB {

    // (i) This is an instance variable. It belongs to the object.
    private String instanceName = "Default Instance Name";

    // A counter to show state persistence.
    private int callCount = 0;

    public void demonstrateVariables() {
        System.out.println("--- Method Call #" + (++callCount) + " ---");
        
        // (i) This is a local variable. It is created fresh on each method call.
        String localName = "Local Name";

        System.out.println("Inside the method:");
        System.out.println("  Instance variable 'instanceName': " + this.instanceName);
        System.out.println("  Local variable 'localName': " + localName);

        // Modify the variables
        this.instanceName = this.instanceName + " - modified";
        localName = localName + " - modified";

        System.out.println("After modification inside the method:");
        System.out.println("  Instance variable 'instanceName': " + this.instanceName);
        System.out.println("  Local variable 'localName': " + localName);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an object of the class.
        VariableScopeDemoB obj = new VariableScopeDemoB();

        // (ii) Call the method for the first time.
        // Both variables are initialized and then modified.
        obj.demonstrateVariables();

        // (ii) Call the method a second time.
        // The instance variable retains its modified value from the first call.
        // The local variable is re-initialized with its original value.
        obj.demonstrateVariables();
    }
}
