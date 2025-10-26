package WEEK_04;

/**
 * 4b) This program demonstrates abstract classes and methods.
 */

// --- Step 1: Create the Abstract Class ---
/**
 * 'Shape' is an abstract class. It cannot be instantiated.
 * It acts as a base for other classes.
 */
abstract class Shape {
    // These variables will be inherited by all child classes
    int dim1;
    int dim2;

    /**
     * A constructor to set the dimensions.
     * Child class constructors will call this using super().
     */
    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    /**
     * This is an 'abstract method'. It has no body.
     * It's a "contract" that forces any non-abstract child class
     * to provide an implementation for this method.
     */
    public abstract void printArea();
}

// --- Step 2: Create Concrete Subclasses ---

/**
 * Rectangle is a "concrete" class that extends Shape.
 * It MUST provide an implementation for printArea().
 */
class Rectangle extends Shape {
    
    public Rectangle(int length, int width) {
        // Call the parent (Shape) constructor
        super(length, width);
    }

    // Provide the required implementation for printArea
    @Override
    public void printArea() {
        // dim1 is length, dim2 is width
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle (l:" + dim1 + ", w:" + dim2 + ") is: " + area);
    }
}

/**
 * Triangle is another concrete class that extends Shape.
 */
class Triangle extends Shape {

    public Triangle(int base, int height) {
        // Call the parent (Shape) constructor
        super(base, height);
    }

    // Provide the required implementation for printArea
    @Override
    public void printArea() {
        // dim1 is base, dim2 is height
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle (b:" + dim1 + ", h:" + dim2 + ") is: " + area);
    }
}

/**
 * Circle is the third concrete class that extends Shape.
 * Note: A circle only needs one dimension (radius). We will
 * pass the radius as 'dim1' and 0 as 'dim2' to satisfy the
 * parent constructor.
 */
class Circle extends Shape {
    
    public Circle(int radius) {
        // Call the parent (Shape) constructor
        // We use 'dim1' for radius and pass 0 for 'dim2'
        super(radius, 0); 
    }

    // Provide the required implementation for printArea
    @Override
    public void printArea() {
        // dim1 is the radius
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle (r:" + dim1 + ") is: " + String.format("%.2f", area));
    }
}


/**
 * The main class to run the demo.
 */
public class AbstractClassDemo {

    public static void main(String[] args) {
        System.out.println("--- 4b) Abstract Class 'Shape' Demo ---");

        // --- Step 3: Create objects and call the method ---
        
        // We can declare variables of the abstract type 'Shape'
        // But we instantiate them as the concrete classes.
        Shape rect = new Rectangle(10, 5);
        Shape tri = new Triangle(8, 4);
        Shape circ = new Circle(7);
        
        // This is Polymorphism:
        // We call the same method 'printArea()' on three
        // different object types, and the correct
        // implementation is executed for each.
        
        rect.printArea();
        tri.printArea();
        circ.printArea();

        // --- This line would cause a COMPILE ERROR ---
        // Shape myShape = new Shape(5, 5);
        // Error: "Cannot instantiate the type Shape"
    }
}

