package Week8;

import Week8.mypackage.Person;

public class AccessOutsideDemo extends Person {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("publicName (outside): " + p.publicName);
        // protectedName is NOT accessible through a Person reference in a different package
        // but is accessible in a subclass via 'this' (demonstrated below)

        AccessOutsideDemo sub = new AccessOutsideDemo();
        System.out.println("protectedName (in subclass): " + sub.getProtectedName());
        // defaultName and privateName are not accessible here
    }
}
