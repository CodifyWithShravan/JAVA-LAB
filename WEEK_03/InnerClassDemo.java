package WEEK_03;

/**
 * 3a) This program demonstrates Member Inner Classes
 * and Static Nested Classes.
 */

class OuterClass {

    // A private non-static variable (member)
    private String outerMessage = "Hello from Outer Class object";
    
    // A private static variable
    private static String staticMessage = "Hello from Outer Class (static)";

    // --- 1. Member Inner Class ---
    // This class is non-static
    class MemberInnerClass {
        
        public void display() {
            System.out.println("\n--- MemberInnerClass Display ---");
            // It can access BOTH static and non-static members
            // of the OuterClass.
            System.out.println("Accessing non-static member: " + outerMessage);
            System.out.println("Accessing static member: " + staticMessage);
        }
    }

    // --- 2. Static Nested Class ---
    // This class is static
    static class StaticNestedClass {

        public void display() {
            System.out.println("\n--- StaticNestedClass Display ---");
            // It can ONLY access static members of the OuterClass.
            System.out.println("Accessing static member: " + staticMessage);

            // --- This would cause a COMPILE ERROR ---
            // System.out.println(outerMessage);
            // Error: "Cannot make a static reference to the non-static field outerMessage"
        }
    }

} // End of OuterClass


/**
 * The main class to run the demo.
 */
public class InnerClassDemo {

    public static void main(String[] args) {
        System.out.println("--- 3a) Nested Classes Demo ---");

        // --- Instantiating the Member Inner Class ---
        System.out.println("\nCreating Member Inner Class...");
        // 1. You MUST have an OuterClass object first
        OuterClass outer = new OuterClass();
        // 2. You use the outer object to create the inner object
        OuterClass.MemberInnerClass inner = outer.new MemberInnerClass();
        
        // Call its method
        inner.display();

        // --- Instantiating the Static Nested Class ---
        System.out.println("\nCreating Static Nested Class...");
        // 1. You DO NOT need an OuterClass object.
        // You create it directly using the OuterClass name.
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();

        // Call its method
        nested.display();
    }
}
