package WEEK_04;

/**
 * 4a) This program demonstrates Single and Multilevel Inheritance.
 */

// --- Base Class (Parent) ---
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// --- 1. SINGLE INHERITANCE ---
// Dog 'extends' Animal. This is single inheritance.
// Dog is the child/subclass, Animal is the parent/superclass.
class Dog extends Animal {

    public Dog(String name) {
        // Call the parent (Animal) constructor
        super(name); 
        System.out.println("Dog constructor called.");
    }

    // Dog inherits eat() and sleep() from Animal
    
    // Dog also has its own specific method
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

// --- 2. MULTILEVEL INHERITANCE ---
// Puppy 'extends' Dog.
// The chain is: Animal -> Dog -> Puppy
class Puppy extends Dog {

    public Puppy(String name) {
        // Call the parent (Dog) constructor, which in turn calls the Animal constructor
        super(name);
        System.out.println("Puppy constructor called.");
    }

    // Puppy inherits eat() and sleep() from Animal
    // Puppy inherits bark() from Dog
    
    // Puppy also has its own specific method
    public void weep() {
        System.out.println(name + " is weeping.");
    }

    // We can also override a method
    @Override
    public void eat() {
        System.out.println(name + " (a puppy) is drinking milk.");
    }
}


/**
 * The main class to run the demo.
 */
public class InheritanceDemo {

    public static void main(String[] args) {
        System.out.println("--- 4a) Inheritance Demo ---");

        System.out.println("\n--- 1. Single Inheritance (Dog) ---");
        // Creating a Dog object
        Dog myDog = new Dog("Buddy");
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Defined in Dog

        System.out.println("\n--- 2. Multilevel Inheritance (Puppy) ---");
        // Creating a Puppy object
        Puppy myPuppy = new Puppy("Tiny");
        myPuppy.eat();    // Overridden in Puppy
        myPuppy.sleep();  // Inherited from Animal
        myPuppy.bark();   // Inherited from Dog
        myPuppy.weep();   // Defined in Puppy
    }
}

