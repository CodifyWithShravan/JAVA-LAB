package Week_9;

import java.io.*;

public class SerializationDemo {
    public static class Employee implements Serializable {
        private static final long serialVersionUID = 1L;
        int id;
        String name;

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "Employee[id=" + id + ", name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Shravan");
        String file = "employee.ser";

        // serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(emp);
            System.out.println("Serialized: " + emp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            Employee e2 = (Employee) in.readObject();
            System.out.println("Deserialized: " + e2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
