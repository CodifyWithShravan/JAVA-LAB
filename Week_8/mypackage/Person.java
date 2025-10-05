package Week_8.mypackage;

/**
 * Person demonstrates fields with different access modifiers inside a user-defined package.
 */
public class Person {
    public String publicName = "Public Alice"; // accessible everywhere
    protected String protectedName = "Protected Bob"; // accessible in same package and subclasses
    String defaultName = "Default Carol"; // package-private: accessible within package
    private String privateName = "Private Dave"; // accessible only inside this class

    public Person() {}

    // public getter for privateName to show controlled access
    public String getPrivateName() {
        return privateName;
    }

    // protected method
    protected String getProtectedName() {
        return protectedName;
    }

    // package-private method
    String getDefaultName() {
        return defaultName;
    }

    // private method
    // (no unused private helpers to avoid lint warnings)
}
