/**
 * Week 4b: Abstract class Shape with Rectangle, Triangle, and Circle
 */

package Week4;

/**
 * Week 4b: Abstract class demonstration
 */

// Abstract base class
abstract class Shape {
    protected int dimension1;
    protected int dimension2;
    
    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    
    // Abstract method - must be implemented by concrete classes
    public abstract void printArea();
    
    public void displayDimensions() {
        System.out.println("Dimension 1: " + dimension1 + ", Dimension 2: " + dimension2);
    }
}

// Rectangle class
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }
    
    @Override
    public void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Rectangle - Length: " + dimension1 + ", Width: " + dimension2);
        System.out.println("Area: " + area + " square units");
    }
}

// Triangle class
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }
    
    @Override
    public void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Triangle - Base: " + dimension1 + ", Height: " + dimension2);
        System.out.println("Area: " + area + " square units");
    }
}

// Circle class
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0); // Only radius is needed for circle
    }
    
    @Override
    public void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Circle - Radius: " + dimension1);
        System.out.println("Area: " + String.format("%.2f", area) + " square units");
    }
    
    @Override
    public void displayDimensions() {
        System.out.println("Radius: " + dimension1);
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Shape Demo ===\n");
        
        // Creating objects of concrete classes
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(8, 6);
        Shape circle = new Circle(7);
        
        // Array of shapes for polymorphism
        Shape[] shapes = {rectangle, triangle, circle};
        
        // Display information for each shape
        for (int i = 0; i < shapes.length; i++) {
            System.out.println((i + 1) + ". " + shapes[i].getClass().getSimpleName());
            shapes[i].printArea();
            System.out.println();
        }
        
        // Demonstrate polymorphism
        System.out.println("=== Polymorphism Demo ===");
        System.out.println("Same method call, different implementations:");
        
        for (Shape shape : shapes) {
            System.out.println("\n" + shape.getClass().getSimpleName() + ":");
            shape.displayDimensions();
            shape.printArea();
        }
    }
}
