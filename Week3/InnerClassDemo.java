package Week3;

/**
 * Week 3a: Inner classes and nested classes demonstration
 */
public class InnerClassDemo {
    private int outerVar = 10;
    private static int staticVar = 20;
    
    // Member inner class
    public class MemberInner {
        private int innerVar = 30;
        
        public void display() {
            System.out.println("Inner class - outerVar: " + outerVar + 
                             ", innerVar: " + innerVar + ", staticVar: " + staticVar);
        }
    }
    
    // Static nested class
    public static class StaticNested {
        private int nestedVar = 40;
        
        public void display() {
            System.out.println("Nested class - nestedVar: " + nestedVar + 
                             ", staticVar: " + staticVar);
            // Cannot access outerVar directly
        }
    }
    
    public void outerMethod() {
        System.out.println("Outer class - outerVar: " + outerVar + ", staticVar: " + staticVar);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Inner Class Demo ===\n");
        
        // Create outer class object
        InnerClassDemo outer = new InnerClassDemo();
        outer.outerMethod();
        
        // Create member inner class object
        InnerClassDemo.MemberInner inner = outer.new MemberInner();
        inner.display();
        
        // Create static nested class object
        InnerClassDemo.StaticNested nested = new InnerClassDemo.StaticNested();
        nested.display();
    }
}
