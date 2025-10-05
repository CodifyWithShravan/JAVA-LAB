package Week_5;

/**
 * Week 5a: Demonstration of super and final keywords
 */

// Base class with final variables and methods
class Vehicle {
    protected final String manufacturer;
    protected final int year;
    protected String model;
    protected double price;
    
    public static final String COMPANY = "Auto Corp";
    
    public Vehicle(String manufacturer, int year, String model, double price) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.model = model;
        this.price = price;
    }
    
    // Final method - cannot be overridden
    public final void displayManufacturer() {
        System.out.println("Manufacturer: " + manufacturer + " (" + year + ")");
    }
    
    public void displayInfo() {
        System.out.println("Vehicle: " + manufacturer + " " + model);
        System.out.println("Price: $" + price);
    }
    
    public void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    private String fuelType;
    
    public Car(String manufacturer, int year, String model, double price, String fuelType) {
        super(manufacturer, year, model, price); // Using super()
        this.fuelType = fuelType;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== Car Information ===");
        super.displayManufacturer(); // Using super to call parent method
        System.out.println("Model: " + super.model); // Using super to access parent field
        System.out.println("Price: $" + super.price);
        System.out.println("Fuel Type: " + fuelType);
    }
    
    @Override
    public void start() {
        super.start(); // Call parent method first
        System.out.println("Car engine started with " + fuelType);
    }
}

// Final class - cannot be extended
final class SportsCar extends Car {
    private int topSpeed;
    
    public SportsCar(String manufacturer, int year, String model, 
                    double price, String fuelType, int topSpeed) {
        super(manufacturer, year, model, price, fuelType);
        this.topSpeed = topSpeed;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo
        System.out.println("Top Speed: " + topSpeed + " mph");
    }
    
    public final void race() {
        System.out.println("Racing at " + topSpeed + " mph!");
    }
}

// This would cause error - cannot extend final class
// class SuperCar extends SportsCar { }

public class SuperFinalDemo {
    public static void main(String[] args) {
        System.out.println("=== Super and Final Keywords Demo ===\n");
        
        // Regular car
        Car car = new Car("Toyota", 2023, "Camry", 25000, "Gasoline");
        car.displayInfo();
        car.start();
        
        System.out.println();
        
        // Sports car (final class)
        SportsCar sportsCar = new SportsCar("Ferrari", 2023, "488", 
                                           280000, "Premium", 205);
        sportsCar.displayInfo();
        sportsCar.start();
        sportsCar.race();
        
        System.out.println("\n=== Key Demonstrations ===");
        System.out.println("✓ super() - Constructor chaining");
        System.out.println("✓ super.method() - Calling parent methods");
        System.out.println("✓ super.field - Accessing parent fields");
        System.out.println("✓ final variables - Cannot be reassigned");
        System.out.println("✓ final methods - Cannot be overridden");
        System.out.println("✓ final class - Cannot be extended");
        System.out.println("✓ static final - Constants");
        
        System.out.println("\nFinal variable example:");
        System.out.println("Car manufacturer: " + car.manufacturer); // Final variable
        System.out.println("Company constant: " + Vehicle.COMPANY); // Static final
        // car.manufacturer = "Honda"; // This would cause error - final variable
    }
}
