package Week_5;

/**
 * Week 5b: Multiple inheritance using interfaces
 */

// Vehicle interface
interface Vehicle {
    void start();
    void stop();
    String fuelType();
}

// Car class implementing Vehicle interface
class Car implements Vehicle {
    private String brand;
    private String model;
    private String fuel;
    private boolean isRunning;
    
    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.isRunning = false;
    }
    
    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " " + model + " car started!");
        } else {
            System.out.println("Car is already running!");
        }
    }
    
    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(brand + " " + model + " car stopped!");
        } else {
            System.out.println("Car is already stopped!");
        }
    }
    
    @Override
    public String fuelType() {
        return fuel;
    }
    
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Fuel: " + fuel);
        System.out.println("Status: " + (isRunning ? "Running" : "Stopped"));
    }
    
    public void openTrunk() {
        System.out.println("Car trunk opened!");
    }
}

// Bike class implementing Vehicle interface
class Bike implements Vehicle {
    private String brand;
    private String model;
    private String fuel;
    private boolean isRunning;
    
    public Bike(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.isRunning = false;
    }
    
    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " " + model + " bike started!");
        } else {
            System.out.println("Bike is already running!");
        }
    }
    
    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(brand + " " + model + " bike stopped!");
        } else {
            System.out.println("Bike is already stopped!");
        }
    }
    
    @Override
    public String fuelType() {
        return fuel;
    }
    
    public void displayInfo() {
        System.out.println("Bike: " + brand + " " + model);
        System.out.println("Fuel: " + fuel);
        System.out.println("Status: " + (isRunning ? "Running" : "Stopped"));
    }
    
    public void wheelie() {
        if (isRunning) {
            System.out.println("Performing wheelie!");
        } else {
            System.out.println("Start the bike first!");
        }
    }
}

public class MultipleInheritanceDemo {
    public static void testVehicle(Vehicle vehicle) {
        System.out.println("\nTesting " + vehicle.getClass().getSimpleName() + ":");
        System.out.println("Fuel Type: " + vehicle.fuelType());
        vehicle.start();
        vehicle.stop();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Multiple Inheritance Demo ===\n");
        
        // Create objects
        Car car = new Car("Toyota", "Camry", "Gasoline");
        Bike bike = new Bike("Honda", "CBR", "Petrol");
        
        // Display information
        car.displayInfo();
        System.out.println();
        bike.displayInfo();
        
        System.out.println("\n=== Vehicle Interface Methods ===");
        
        // Test interface methods
        testVehicle(car);
        testVehicle(bike);
        
        System.out.println("\n=== Specific Methods ===");
        
        // Test specific methods
        car.start();
        car.openTrunk();
        
        bike.start();
        bike.wheelie();
        
        System.out.println("\n=== Polymorphism Demo ===");
        
        Vehicle[] vehicles = {car, bike};
        
        for (Vehicle vehicle : vehicles) {
            System.out.println("\n" + vehicle.getClass().getSimpleName() + ":");
            vehicle.start();
            System.out.println("Uses " + vehicle.fuelType());
            vehicle.stop();
        }
        
        System.out.println("\n=== Key Points ===");
        System.out.println("✓ Interfaces enable multiple inheritance in Java");
        System.out.println("✓ Classes can implement multiple interfaces");
        System.out.println("✓ Interface references support polymorphism");
        System.out.println("✓ Each class provides its own implementation");
    }
}
