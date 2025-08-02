/**
 * This program demonstrates the use of abstract classes, inheritance, and the 'super' keyword.
 *
 * 5a) An abstract 'Employee' class serves as the base class for different employee types.
 * 5b) 'Manager' and 'Developer' are concrete subclasses that extend the 'Employee' class.
 */
import java.text.DecimalFormat;

// 5a) Abstract base class for all employee types.
abstract class Employee {
    // Instance variables common to all employees.
    private String name;
    private int id;
    private String designation;
    
    // A constant to format salary output.
    private static final DecimalFormat df = new DecimalFormat("###,###.00");

    /**
     * Constructor to initialize common employee attributes.
     * The 'this' keyword is used to distinguish between instance variables and parameters.
     *
     * @param name The employee's name.
     * @param id The employee's unique ID.
     * @param designation The employee's designation.
     */
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    /**
     * Abstract method to calculate the salary.
     * Subclasses must provide their own implementation for this method.
     *
     * @return The calculated salary.
     */
    public abstract double calculateSalary();

    /**
     * Abstract method to display employee details.
     * Subclasses must provide their own implementation for this method.
     */
    public abstract void displayDetails();
    
    // Getter methods for common attributes.
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public String getDesignation() {
        return designation;
    }
}

// 5b) Subclass representing a Developer.
class Developer extends Employee {
    private double baseSalary;
    private double bonus;

    /**
     * Constructor for the Developer class.
     * The 'super' keyword is used to call the constructor of the base Employee class.
     *
     * @param name The developer's name.
     * @param id The developer's unique ID.
     * @param baseSalary The base salary for the developer.
     * @param bonus The bonus for the developer.
     */
    public Developer(String name, int id, double baseSalary, double bonus) {
        super(name, id, "Developer");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // Developer's salary is the base salary plus a bonus.
        return baseSalary + bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("-------------------------------------");
        System.out.println("Employee ID:   " + this.getId());
        System.out.println("Name:          " + this.getName());
        System.out.println("Designation:   " + this.getDesignation());
        System.out.println("Base Salary:   $" + String.format("%,.2f", baseSalary));
        System.out.println("Bonus:         $" + String.format("%,.2f", bonus));
        System.out.println("Total Salary:  $" + String.format("%,.2f", calculateSalary()));
        System.out.println("-------------------------------------");
    }
}

// 5b) Subclass representing a Manager.
class Manager extends Employee {
    private double baseSalary;
    private double teamBonus;

    /**
     * Constructor for the Manager class.
     * The 'super' keyword is used to call the constructor of the base Employee class.
     *
     * @param name The manager's name.
     * @param id The manager's unique ID.
     * @param baseSalary The base salary for the manager.
     * @param teamBonus The bonus for the manager's team.
     */
    public Manager(String name, int id, double baseSalary, double teamBonus) {
        super(name, id, "Manager");
        this.baseSalary = baseSalary;
        this.teamBonus = teamBonus;
    }

    @Override
    public double calculateSalary() {
        // Manager's salary is the base salary plus a team bonus.
        return baseSalary + teamBonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("-------------------------------------");
        System.out.println("Employee ID:   " + this.getId());
        System.out.println("Name:          " + this.getName());
        System.out.println("Designation:   " + this.getDesignation());
        System.out.println("Base Salary:   $" + String.format("%,.2f", baseSalary));
        System.out.println("Team Bonus:    $" + String.format("%,.2f", teamBonus));
        System.out.println("Total Salary:  $" + String.format("%,.2f", calculateSalary()));
        System.out.println("-------------------------------------");
    }
}

// The main class to demonstrate the program.
public class EmployeeSystemDemo {
    public static void main(String[] args) {
        // Create an instance of the Developer subclass.
        Employee dev = new Developer("Alice Johnson", 101, 80000.00, 5000.00);

        // Create an instance of the Manager subclass.
        Employee manager = new Manager("Bob Williams", 201, 120000.00, 15000.00);

        System.out.println("--- Employee Records ---");
        
        // Call the displayDetails method on the Developer object.
        dev.displayDetails();
        
        // Call the displayDetails method on the Manager object.
        manager.displayDetails();
    }
}

