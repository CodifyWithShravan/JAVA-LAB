/**
 * Week 1a: Static blocks, variables and methods demonstration
 */
public class StaticDemo {
    static int staticVar = 10;
    int instanceVar = 20;
    
    // Static blocks execute when class is loaded
    static {
        System.out.println("Static block 1: staticVar = " + staticVar);
        staticVar = 30;
    }
    
    static {
        System.out.println("Static block 2: staticVar = " + staticVar);
    }
    
    public StaticDemo() {
        System.out.println("Constructor: instanceVar = " + instanceVar);
    }
    
    static void staticMethod() {
        System.out.println("Static method: staticVar = " + staticVar);
    }
    
    void instanceMethod() {
        System.out.println("Instance method: instanceVar = " + instanceVar + ", staticVar = " + staticVar);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Static Demo ===");
        StaticDemo.staticMethod();
        
        StaticDemo obj1 = new StaticDemo();
        obj1.instanceMethod();
        
        StaticDemo obj2 = new StaticDemo();
        obj2.instanceMethod();
    }
}
