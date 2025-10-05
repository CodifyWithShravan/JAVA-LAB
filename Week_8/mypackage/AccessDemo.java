package Week_8.mypackage;

public class AccessDemo {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("publicName: " + p.publicName);
        System.out.println("protectedName: " + p.getProtectedName());
        System.out.println("defaultName: " + p.getDefaultName());
        // privateName is not directly accessible here
        System.out.println("privateName via getter: " + p.getPrivateName());
    }
}
