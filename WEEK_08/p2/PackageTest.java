package WEEK_08.p2;



// We must import the class from the other package to use it
import WEEK_08.p1.AccessDemo;

/**
 * 8a) Part 2: The test class in the "p2" package.
 * This class is in a different package and is a subclass of AccessDemo.
 * Save this file as: week8/p2/PackageTest.java
 */
public class PackageTest extends AccessDemo {

    public static void main(String[] args) {
        System.out.println("--- 8a) Access Modifier Demo ---");

        // --- 1. Accessing via an instance of the class ---
        AccessDemo demo = new AccessDemo();
        System.out.println("\nTesting access with an 'AccessDemo' instance:");
        
        // PUBLIC: OK
        System.out.println("Accessing demo.publicVar: " + demo.publicVar);
        
        // PROTECTED: COMPILE ERROR!
        // We are in a different package, AND we are not accessing
        // it through our own (subclass) instance.
        // System.out.println("Accessing demo.protectedVar: " + demo.protectedVar); 
        System.out.println("Accessing demo.protectedVar: [COMPILE ERROR]");

        // DEFAULT: COMPILE ERROR!
        // We are in a different package (p2).
        // System.out.println("Accessing demo.defaultVar: " + demo.defaultVar);
        System.out.println("Accessing demo.defaultVar: [COMPILE ERROR]");

        // PRIVATE: COMPILE ERROR!
        // We are outside the class.
        // System.out.println("Accessing demo.privateVar: " + demo.privateVar);
        System.out.println("Accessing demo.privateVar: [COMPILE ERROR]");
        
        // We can call the public method, which prints the private var
        demo.printPrivate();

        
        // --- 2. Accessing inherited members (as a Subclass) ---
        PackageTest test = new PackageTest();
        System.out.println("\nTesting access with a 'PackageTest' (subclass) instance:");

        // PUBLIC: OK (Inherited)
        System.out.println("Accessing test.publicVar: " + test.publicVar);

        // PROTECTED: OK!
        // We are a subclass, so we inherit the protected member.
        System.out.println("Accessing test.protectedVar: " + test.protectedVar);
        
        // DEFAULT: COMPILE ERROR! (Not inherited across packages)
        // System.out.println("Accessing test.defaultVar: " + test.defaultVar);
        System.out.println("Accessing test.defaultVar: [COMPILE ERROR]");
        
        // PRIVATE: COMPILE ERROR! (Not inherited)
        // System.out.println("Accessing test.privateVar: " + test.privateVar);
        System.out.println("Accessing test.privateVar: [COMPILE ERROR]");
    }
}

