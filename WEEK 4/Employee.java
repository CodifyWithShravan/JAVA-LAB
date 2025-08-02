/**
 * This is an updated program demonstrating the use of a constructor, the 'this' keyword,
 * and static members (variables and methods) to manage employee data.
 *
 * 4a) It now includes a static variable to maintain a shared count of all employees.
 * 4b) It also defines a static utility method to display a company name.
 */
public class Employee {
    // Instance variables to store employee data.
    private String name;
    private int id;
    private String department;
    private double salary;

    // 4a) A static variable to maintain a shared count of all employees.
    // This variable belongs to the class, not to any specific employee object.
    private static int employeeCount = 0;
    
    // A static constant for the company name, accessible by all objects.
    public static final String COMPANY_NAME = "Tech Innovations Inc.";

    /**
     * Constructor for the Employee class.
     * The 'this' keyword is used to differentiate between the class's
     * instance variables and the local parameters of the same name.
     * When a new employee object is created, the static employeeCount is incremented.
     */
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        
        // Increment the static counter each time a new Employee object is instantiated.
        employeeCount++;
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

    // 4b) Static utility method to display the company name.
    // This method can be called without creating an object of the Employee class.
    public static void displayCompanyName() {
        System.out.println("Company: " + COMPANY_NAME);
    }
    
    // Static method to get the total number of employees.
    public static int getEmployeeCount() {
        return employeeCount;
    }

    /**
     * The main method to run the program.
     * It creates two Employee objects and displays their details, along with
     * the static company name and total employee count.
     */
    public static void main(String[] args) {
        // Display company name using the static method before creating any objects.
        Employee.displayCompanyName();

        // Create the first employee object.
        Employee emp1 = new Employee("Jane Doe", 101, "Engineering", 75000.00);

        // Create the second employee object.
        Employee emp2 = new Employee("John Smith", 102, "Marketing", 62000.50);

        System.out.println("\nDisplaying details for Employee 1:");
        emp1.displayDetails();

        System.out.println("\nDisplaying details for Employee 2:");
        emp2.displayDetails();
        
        // Display the total number of employees using the static method.
        System.out.println("\nTotal number of employees created: " + Employee.getEmployeeCount());
    }
}
