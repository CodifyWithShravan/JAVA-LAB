package WEEK_08.p1;



/**
 * 8a) Part 1: The class in the "p1" package.
 * This class demonstrates all four access modifiers.
 * Save this file as: week8/p1/AccessDemo.java
 */
public class AccessDemo {
    
    // Accessible to everyone, everywhere
    public String publicVar = "This is public";

    // Accessible in package p1 and subclasses anywhere
    protected String protectedVar = "This is protected";

    // Accessible only within package p1
    String defaultVar = "This is default (package-private)";

    // Accessible only within this AccessDemo class
    private String privateVar = "This is private";

    // A public method to demonstrate access to private members
    public void printPrivate() {
        System.out.println("Inside AccessDemo, can access privateVar: " + privateVar);
    }
}

