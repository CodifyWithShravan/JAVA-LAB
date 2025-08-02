/**
 * This is a basic program demonstrating the use of a constructor
 * and the 'this' keyword to create and initialize an Employee object.
 * This class contains the main method to run the program.
 */
public class Employee {
    // Instance variables to store employee data.
    private String name;
    private int id;
    private String department;
    private double salary;

    /**
     * Constructor for the Employee class.
     * The 'this' keyword is used to differentiate between the class's
     * instance variables and the local parameters of the same name.
     */
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    /**
     * Method to display the details of the employee.
     */
    public void displayDetails() {
        System.out.println("-------------------------------------");
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name:        " + this.name);
        System.out.println("Department:  " + this.department);
        System.out.println("Salary:      $" + String.format("%,.2f", this.salary));
        System.out.println("-------------------------------------");
    }

    /**
     * The main method to run the program.
     * It creates two Employee objects and displays their details.
     */
    public static void main(String[] args) {
        // Create the first employee object.
        Employee emp1 = new Employee("Jane Doe", 101, "Engineering", 75000.00);

        // Create the second employee object.
        Employee emp2 = new Employee("John Smith", 102, "Marketing", 62000.50);

        System.out.println("Displaying details for Employee 1:");
        emp1.displayDetails();

        System.out.println("\nDisplaying details for Employee 2:");
        emp2.displayDetails();
    }
}

