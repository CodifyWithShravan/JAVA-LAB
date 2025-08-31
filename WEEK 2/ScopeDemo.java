public class ScopeDemo {
    // Instance variable
    int instanceVar = 100;
    String name = "Instance Name";
    
    public static void main(String[] args) {
        System.out.println("=== Variable Scope Demo ===\n");
        
        // 2a) Scope Problem Demo
        System.out.println("2a) Scope Problem:");
        int x = 50; // Local variable in main
        System.out.println("x in main method = " + x);
        
        ScopeDemo demo = new ScopeDemo();
        demo.tryToAccessX(); // Will show scope problem
        demo.accessXCorrectly(x); // Pass x as parameter
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        // 2b) Instance vs Local Variables
        System.out.println("2b) Instance vs Local Variables:");
        
        // i) Create variables with same name
        demo.showVariableDifference();
        
        // ii) Call method twice to show behavior
        System.out.println("\nFirst method call:");
        demo.testVariableLifetime();
        
        System.out.println("Second method call:");
        demo.testVariableLifetime();
        
        // iii) Modify instance variable and call again
        System.out.println("After modifying instance variable:");
        demo.name = "Changed Instance Name";
        demo.testVariableLifetime();
    }
    
    // Method showing scope problem
    public void tryToAccessX() {
        System.out.println("Trying to access x from main...");
        // int result = x; // This would cause ERROR!
        System.out.println("ERROR: Cannot access x - it's out of scope!");
    }
    
    // Method accessing x correctly through parameter
    public void accessXCorrectly(int x) {
        System.out.println("x passed as parameter = " + x);
        System.out.println("This works because x is a parameter!");
    }
    
    // i) Method with instance and local variables having same name
    public void showVariableDifference() {
        String name = "Local Name"; // Local variable
        
        System.out.println("Local variable name = " + name);
        System.out.println("Instance variable name = " + this.name);
        System.out.println("Instance variable instanceVar = " + instanceVar);
    }
    
    // ii & iii) Method to test variable lifetime
    public void testVariableLifetime() {
        int localCounter = 0; // Created fresh each time method is called
        
        System.out.println("Start of method:");
        System.out.println("  Local counter = " + localCounter);
        System.out.println("  Instance name = " + name);
        System.out.println("  Instance var = " + instanceVar);
        
        // Modify both variables
        localCounter = localCounter + 10;
        instanceVar = instanceVar + 5;
        
        System.out.println("After modification:");
        System.out.println("  Local counter = " + localCounter);
        System.out.println("  Instance var = " + instanceVar);
        System.out.println("End of method - local variables destroyed\n");
    }
}

/* 
SIMPLE EXPLANATION:

LOCAL VARIABLES:
- Live only inside the method where they are created
- Die when method ends
- Created fresh each time method is called

INSTANCE VARIABLES:
- Live as long as the object exists
- Keep their values between method calls
- Shared by all methods in the class

SCOPE:
- Local variables can only be used in their method
- Instance variables can be used anywhere in the class
- Use 'this' to refer to instance variables when names conflict
*/