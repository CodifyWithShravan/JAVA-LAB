package WEEK_05;

/**
 * 5b) This program demonstrates multiple inheritance using an Interface.
 */

// --- Step 1: Create the Interface ---
// An interface is a contract. It defines methods that
// implementing classes MUST provide.
interface Vehicle {
    // These methods are 'public' and 'abstract' by default
    void start();
    void stop();
    void fuelType();
}

// You could even have a second interface
// FIXED: Added the 'interface' keyword here
interface Radio {
    void playMusic();
}

// --- Step 2: Implement the Interface in a 'Car' class ---
// A class can 'implement' multiple interfaces.
// class Car implements Vehicle, Radio {
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car: Engine started with a key turn.");
    }

    @Override
    public void stop() {
        System.out.println("Car: Stopped by pressing the brake pedal.");
    }

    @Override
    public void fuelType() {
        System.out.println("Car: Runs on Petrol.");
    }

    // If we were implementing Radio, we would also need:
    // @Override
    // public void playMusic() {
    //     System.out.println("Car: Playing radio.");
    // }
}

// --- Step 3: Implement the SAME Interface in a 'Bike' class ---
class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike: Started with a kick-start.");
    }

@Override
    public void stop() {
        System.out.println("Bike: Stopped by using the hand brakes.");
    }

    @Override
    public void fuelType() {
        System.out.println("Bike: Runs on Gasoline.");
    }
}

/**
 * The main class to run the demo.
 */
public class InterfaceDemo {

    public static void main(String[] args) {
        System.out.println("--- 5b) Interface (Multiple Inheritance) Demo ---");

        // --- Step 4: Create objects and call methods ---
        
        // We can create a Car object
        // It's good practice to declare the type as the interface
        Vehicle myCar = new Car();
        
        System.out.println("\n--- Testing Car Object ---");
        myCar.start();
        myCar.fuelType();
        myCar.stop();
        
        // We can create a Bike object
        Vehicle myBike = new Bike();

        System.out.println("\n--- Testing Bike Object ---");
        myBike.start();
        myBike.fuelType();
        myBike.stop();

        // Both Car and Bike are 'Vehicles', but they behave differently.
        // This is a core concept of Polymorphism.
    }
}




