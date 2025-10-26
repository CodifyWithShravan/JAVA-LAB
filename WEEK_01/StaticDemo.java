package WEEK_01;

/**
 * 1a) This program demonstrates the execution of static blocks,
 * static variables, and static methods.
 */
public class StaticDemo {

    // 1. Static Variable (Class Variable)
    // This variable belongs to the class. There is only ONE copy.
    static int staticCounter = 0;

    // 2. Non-Static Variable (Instance Variable)
    // Each object will get its OWN copy of this.
    int instanceCounter = 0;

    // 3. Static Block
    // This runs ONLY ONCE when the class is first loaded into memory,
    // even before the main() method.
    static {
        System.out.println("--- Static Block Executed ---");
        staticCounter = 100; // Initialize static variables here
        System.out.println("Static counter initialized to: " + staticCounter);
    }

    // 4. Static Method
    // This method belongs to the class, not to an object.
    public static void incrementStaticCounter() {
        System.out.println("\n--- Static Method Called ---");
        staticCounter++; // It can access static variables
        System.out.println("Static counter is now: " + staticCounter);

        // --- COMPILE ERROR ---
        // A static method CANNOT access non-static (instance) variables.
        // instanceCounter++; // This line would cause an error.
    }

    // 5. Non-Static Method (Instance Method)
    public void incrementInstanceCounter() {
        System.out.println("\n--- Instance Method Called ---");
        // An instance method can access BOTH instance and static variables.
        instanceCounter++;
        staticCounter++;
        System.out.println("Instance counter: " + instanceCounter);
        System.out.println("Static counter: " + staticCounter);
    }


    // The main method is always static, so it can run without an object
    public static void main(String[] args) {
        System.out.println("\n--- Main Method Started ---");

        // We can call the static method without creating any object
        // We call it using the Class Name
        StaticDemo.incrementStaticCounter();

        // Let's create two objects (instances) of StaticDemo
        System.out.println("\nCreating first object (obj1)...");
        StaticDemo obj1 = new StaticDemo();
        obj1.incrementInstanceCounter();

        System.out.println("\nCreating second object (obj2)...");
        StaticDemo obj2 = new StaticDemo();
        obj2.incrementInstanceCounter();

        System.out.println("\n--- Final State ---");
        // obj1 and obj2 have their own separate 'instanceCounter'
        System.out.println("obj1 instance counter: " + obj1.instanceCounter); // Output: 1
        System.out.println("obj2 instance counter: " + obj2.instanceCounter); // Output: 1
        
        // But they SHARE the single 'staticCounter'
        System.out.println("obj1 static counter: " + StaticDemo.staticCounter); // Output: 104
        System.out.println("obj2 static counter: " + StaticDemo.staticCounter); // Output: 104
        System.out.println("Accessing static counter via class: " + StaticDemo.staticCounter); // Output: 104
    }
}

