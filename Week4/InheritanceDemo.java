package Week4;

/**
 * Week 4a: Single and multi-level inheritance
 */

// Base class
class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Single inheritance
class Mammal extends Animal {
    protected String furColor;
    
    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    
    public void giveBirth() {
        System.out.println(name + " gives birth to live young");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fur Color: " + furColor);
    }
}

// Multi-level inheritance
class Dog extends Mammal {
    private String breed;
    
    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }
    
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " is eating dog food");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// Another inheritance chain
class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    
    public void chirp() {
        System.out.println(name + " is chirping");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Can Fly: " + canFly);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Inheritance Demo ===\n");
        
        // Single inheritance: Animal -> Mammal
        Mammal mammal = new Mammal("Lion", 5, "Golden");
        mammal.displayInfo();
        mammal.eat();
        mammal.giveBirth();
        
        System.out.println();
        
        // Multi-level inheritance: Animal -> Mammal -> Dog
        Dog dog = new Dog("Buddy", 3, "Brown", "Golden Retriever");
        dog.displayInfo();
        dog.eat();        // Overridden method
        dog.bark();       // Dog-specific method
        dog.giveBirth();  // Inherited from Mammal
        dog.sleep();      // Inherited from Animal
        
        System.out.println();
        
        // Another inheritance chain
        Bird bird = new Bird("Parrot", 2, true);
        bird.displayInfo();
        bird.chirp();
        bird.eat();
        
        System.out.println("\n=== Polymorphism Demo ===");
        Animal[] animals = {mammal, dog, bird};
        
        for (Animal animal : animals) {
            System.out.println("\n" + animal.getClass().getSimpleName() + ":");
            animal.displayInfo();
            animal.eat(); // Each class has its own implementation
        }
    }
}
