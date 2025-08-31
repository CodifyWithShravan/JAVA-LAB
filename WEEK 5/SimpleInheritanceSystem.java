import java.util.Scanner;

// 5a) Abstract Employee class
abstract class Employee {
    // Instance variables
    protected String name;
    protected int id;
    protected String designation;
    protected double salary;
    
    // Static variable
    protected static int totalEmployees = 0;
    
    // Constructor using 'this' keyword
    public Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        totalEmployees++;
        System.out.println("Employee constructor called!");
    }
    
    // Abstract methods - subclasses MUST implement these
    public abstract double calculateSalary();
    public abstract void displayDetails();
    
    // Regular method that can be inherited
    public void showBasicInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Designation: " + this.designation);
    }
    
    // Static method
    public static int getTotalEmployees() {
        return totalEmployees;
    }
}

// 5b) Manager class extending Employee
class Manager extends Employee {
    double bonus;
    int teamSize;
    
    // Constructor using 'super' keyword
    public Manager(String name, int id, double salary, double bonus, int teamSize) {
        super(name, id, "Manager", salary); // Call parent constructor with 'super'
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println("Manager constructor called!");
    }
    
    // Must implement abstract method
    @Override
    public double calculateSalary() {
        return salary + bonus + (teamSize * 1000); // Base + bonus + team bonus
    }
    
    // Must implement abstract method  
    @Override
    public void displayDetails() {
        System.out.println("\n=== MANAGER DETAILS ===");
        super.showBasicInfo(); // Call parent method with 'super'
        System.out.println("Base Salary: Rs." + salary);
        System.out.println("Bonus: Rs." + bonus);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Total Salary: Rs." + calculateSalary());
        System.out.println("---------------------------");
    }
    
    // Manager specific method
    public void manageTeam() {
        System.out.println(name + " is managing " + teamSize + " team members.");
    }
}

// 5b) Developer class extending Employee
class Developer extends Employee {
    String language;
    int projects;
    
    // Constructor using 'super' keyword
    public Developer(String name, int id, double salary, String language, int projects) {
        super(name, id, "Developer", salary); // Call parent constructor with 'super'
        this.language = language;
        this.projects = projects;
        System.out.println("Developer constructor called!");
    }
    
    // Must implement abstract method
    @Override
    public double calculateSalary() {
        return salary + (projects * 2000); // Base salary + project bonus
    }
    
    // Must implement abstract method
    @Override
    public void displayDetails() {
        System.out.println("\n=== DEVELOPER DETAILS ===");
        super.showBasicInfo(); // Call parent method with 'super'
        System.out.println("Base Salary: Rs." + salary);
        System.out.println("Programming Language: " + language);
        System.out.println("Projects Completed: " + projects);
        System.out.println("Total Salary: Rs." + calculateSalary());
        System.out.println("----------------------------");
    }
    
    // Developer specific method
    public void writeCode() {
        System.out.println(name + " is writing code in " + language);
    }
}

public class SimpleInheritanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Inheritance Demo ===\n");
        
        // Create Manager using 'super' in constructor
        System.out.println("Creating Manager:");
        Manager mgr = new Manager("Alice Johnson", 201, 60000, 15000, 5);
        
        // Create Developer using 'super' in constructor  
        System.out.println("\nCreating Developer:");
        Developer dev = new Developer("Bob Smith", 301, 50000, "Java", 8);
        
        // Display details using overridden methods
        mgr.displayDetails();
        dev.displayDetails();
        
        // Show total employees using static method
        System.out.println("Total employees created: " + Employee.getTotalEmployees());
        
        // Demonstrate method calls
        System.out.println("\n=== Method Demonstrations ===");
        mgr.manageTeam();
        dev.writeCode();
        
        // Demonstrate polymorphism
        System.out.println("\n=== Polymorphism Demo ===");
        Employee emp1 = mgr; // Manager object referred by Employee reference
        Employee emp2 = dev; // Developer object referred by Employee reference
        
        System.out.println("Calling displayDetails() on Employee references:");
        emp1.displayDetails(); // Calls Manager's version
        emp2.displayDetails(); // Calls Developer's version
        
        // Interactive: Create your own employee
        System.out.println("\n=== Create Your Own Employee ===");
        System.out.print("Create (1) Manager or (2) Developer? ");
        int choice = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter base salary: ");
        double salary = sc.nextDouble();
        
        if (choice == 1) {
            System.out.print("Enter bonus: ");
            double bonus = sc.nextDouble();
            
            System.out.print("Enter team size: ");
            int teamSize = sc.nextInt();
            
            Manager newMgr = new Manager(name, id, salary, bonus, teamSize);
            newMgr.displayDetails();
            newMgr.manageTeam();
            
        } else if (choice == 2) {
            sc.nextLine(); // Clear buffer
            System.out.print("Enter programming language: ");
            String lang = sc.nextLine();
            
            System.out.print("Enter projects completed: ");
            int projects = sc.nextInt();
            
            Developer newDev = new Developer(name, id, salary, lang, projects);
            newDev.displayDetails();
            newDev.writeCode();
        }
        
        System.out.println("\nFinal total employees: " + Employee.getTotalEmployees());
        sc.close();
    }
}

/*
SIMPLE INHERITANCE EXPLANATION:

ABSTRACT CLASS:
- Cannot create objects directly (Employee emp = new Employee(); ❌)
- Must be extended by other classes
- Can have abstract methods (no body) and regular methods

ABSTRACT METHODS:
- Declared but not implemented in abstract class
- MUST be implemented in subclasses
- Forces subclasses to provide their own version

'SUPER' KEYWORD:
- Calls parent class constructor: super(name, id, ...)
- Calls parent class methods: super.showBasicInfo()
- Must be first line in constructor if used

INHERITANCE BENEFITS:
- Code reuse (write once, use in many subclasses)
- Common structure (all employees have name, id, etc.)
- Different behavior (Manager vs Developer salary calculation)

METHOD OVERRIDING:
- Subclass provides its own version of parent method
- Same method name, different implementation
- @Override annotation ensures correct signature
*/