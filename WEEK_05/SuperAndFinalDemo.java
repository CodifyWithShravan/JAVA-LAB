package WEEK_05;

/**
 * 5a) This program demonstrates the 'super' and 'final' keywords.
 */

// --- 'final' CLASS Example ---
// If we made this class 'final', the Dog class could not extend it.
// public final class Animal {
class Animal {
    
    // --- 'final' VARIABLE Example ---
    // A final variable is a constant. Its value cannot be changed.
    final String KINGDOM = "Animalia";

    String name;

    // Parent class constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called (setting name: " + name + ")");
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    // --- 'final' METHOD Example ---
    // A final method cannot be overridden by a child class.
    public final void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

/**
 * Dog is a child class (subclass) of Animal.
 */
class Dog extends Animal {

    String name; // This 'name' shadows the parent's 'name'

    public Dog(String parentName, String ownName) {
        // --- 'super()' CONSTRUCTOR Example ---
        // 'super(parentName)' calls the parent (Animal) constructor.
        // It MUST be the very first line in the child constructor.
        super(parentName); 
        this.name = ownName;
        System.out.println("Dog constructor called (setting name: " + ownName + ")");
    }

    /**
     * This method overrides the eat() method from the Animal class.
     */
    @Override
    public void eat() {
        // --- 'super.method()' Example ---
        // We call the parent's eat() method using 'super'
        super.eat(); 
        
        // Then we add our own specific logic
        System.out.println("The dog is eating kibble.");
    }

    // --- This would cause a COMPILE ERROR ---
    // @Override
    // public void sleep() { 
    //     System.out.println("The dog is sleeping in its bed.");
    // }
    // Error: "Cannot override the final method from Animal"

    /**
     * This method demonstrates accessing shadowed variables.
     */
    public void printNames() {
        // --- 'super.variable' Example ---
        // 'this.name' refers to the 'name' in the Dog class
        System.out.println("Dog's name (this.name): " + this.name); 
        // 'super.name' refers to the 'name' in the Animal class
        System.out.println("Animal's name (super.name): " + super.name);
    }
}


/**
 * The main class to run the demo.
 */
public class SuperAndFinalDemo {

    public static void main(String[] args) {
        System.out.println("--- 5a) Super and Final Demo ---");

        // Creating a Dog object
        // This will call both the Animal and Dog constructors
        Dog myDog = new Dog("Canine", "Buddy");
        
        System.out.println("\n--- Testing methods ---");
        myDog.eat();    // Calls the overridden Dog method
        myDog.sleep();  // Calls the final Animal method
        
        System.out.println("\n--- Testing variables ---");
        myDog.printNames(); // Demonstrates super.variable
        
        // We can access the final variable (but we can't change it)
        System.out.println("Dog's Kingdom: " + myDog.KINGDOM);
        
        // --- This would cause a COMPILE ERROR ---
        // myDog.KINGDOM = "Plantae";
        // Error: "Cannot assign a value to final variable 'KINGDOM'"
    }
}

