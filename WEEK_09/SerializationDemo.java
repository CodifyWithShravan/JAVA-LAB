package WEEK_09;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * This class represents a student.
 * It MUST implement the 'Serializable' interface to be serialized.
 * Serializable is a "marker interface" - it has no methods to implement.
 */
class Student implements Serializable {
    
    // A version ID to ensure the class matches during deserialization
    private static final long serialVersionUID = 1L;

    int rollNo;
    String name;
    
    // 'transient' keyword means this field will NOT be serialized.
    // It will be null or its default value (0) after deserialization.
    transient int age; 

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student { " +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age + // This will be 0 after deserialization
                " }";
    }
}

/**
 * 9b) This program demonstrates Object Serialization (writing an object to a file)
 * and Deserialization (reading an object from a file).
 */
public class SerializationDemo {

    public static void main(String[] args) {
        
        String filename = "student.ser"; // .ser is a common extension for serialized objects
        Student s1 = new Student(101, "Alice", 22);

        // --- 1. SERIALIZATION (Write object to file) ---
        System.out.println("--- Serialization ---");
        System.out.println("Original object: " + s1);

        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            // This one line serializes the object and writes it to the file
            oos.writeObject(s1);

            System.out.println("Object successfully serialized to " + filename);

        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }


        // --- 2. DESERIALIZATION (Read object from file) ---
        System.out.println("\n--- Deserialization ---");
        Student s2 = null; // Create a variable to hold the deserialized object

        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            // This one line reads the file and reconstructs the object
            // We must cast the result from Object to Student
            s2 = (Student) ois.readObject();

            System.out.println("Object successfully deserialized from " + filename);
            System.out.println("Deserialized object: " + s2);

            // Check the values
            if (s2 != null) {
                System.out.println("Name: " + s2.name);
                System.out.println("Roll No: " + s2.rollNo);
                System.out.println("Age: " + s2.age + " (Note: 'age' is 0 because it was 'transient')");
            }

        } catch (IOException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // This error happens if the Student.class file isn't available
            System.err.println("Error: Student class not found: " + e.getMessage());
        }
    }
}

