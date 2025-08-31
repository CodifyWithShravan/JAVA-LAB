import java.util.Scanner;

class Employee {
    // Instance variables
    String name;
    int id;
    String department;
    double salary;
    
    // 4a) Static variable to count total employees
    static int totalEmployees = 0;
    
    // Constructor
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        totalEmployees++; // Increase count when new employee is created
    }
    
    // 4a) Static method to get total employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    
    // 4b) Static method to display company name
    public static void showCompanyName() {
        System.out.println("Company: TechCorp Solutions");
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    // 4b) Static method to validate employee ID
    public static boolean isValidId(int id) {
        if (id >= 100 && id <= 999) {
            return true;
        } else {
            return false;
        }
    }
    
    // 4b) Static method to validate salary
    public static boolean isValidSalary(double salary) {
        if (salary >= 10000 && salary <= 100000) {
            return true;
        } else {
            return false;
        }
    }
    
    // Regular method to display details
    public void showDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs." + salary);
        System.out.println("------------------------");
    }
    
    // Regular method to update salary
    public void changeSalary(double newSalary) {
        if (isValidSalary(newSalary)) {
            this.salary = newSalary;
            System.out.println("Salary updated!");
        } else {
            System.out.println("Invalid salary! Must be between 10000-100000");
        }
    }
    
    // Regular method to update department
    public void changeDepartment(String newDept) {
        this.department = newDept;
        System.out.println("Department updated!");
    }
}

public class SimpleEmployeeSystemV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Employee System with Static Features ===\n");
        
        // 4b) Show company info using static method
        Employee.showCompanyName();
        
        // Create some employees
        System.out.println("\nCreating employees...");
        
        Employee emp1 = new Employee("Alice", 101, "IT", 50000);
        System.out.println("Employee 1 created. Total employees: " + Employee.getTotalEmployees());
        
        Employee emp2 = new Employee("Bob", 102, "HR", 45000);
        System.out.println("Employee 2 created. Total employees: " + Employee.getTotalEmployees());
        
        Employee emp3 = new Employee("Charlie", 103, "Finance", 48000);
        System.out.println("Employee 3 created. Total employees: " + Employee.getTotalEmployees());
        
        // Display all employees
        emp1.showDetails();
        emp2.showDetails();
        emp3.showDetails();
        
        // 4b) Demonstrate static validation methods
        System.out.println("\n=== Testing Static Validation Methods ===");
        
        System.out.println("Is ID 150 valid? " + Employee.isValidId(150));
        System.out.println("Is ID 50 valid? " + Employee.isValidId(50));
        System.out.println("Is salary 60000 valid? " + Employee.isValidSalary(60000));
        System.out.println("Is salary 5000 valid? " + Employee.isValidSalary(5000));
        
        // Update employee details
        System.out.println("\n=== Updating Employee ===");
        System.out.println("Updating Alice's salary:");
        emp1.changeSalary(55000);
        emp1.showDetails();
        
        System.out.println("Updating Bob's department:");
        emp2.changeDepartment("Marketing");
        emp2.showDetails();
        
        // Show final company statistics
        System.out.println("\n=== Final Statistics ===");
        Employee.showCompanyName();
        
        // Interactive part
        System.out.println("\nWant to add one more employee? (y/n): ");
        String choice = sc.nextLine();
        
        if (choice.equals("y")) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            
            int id;
            do {
                System.out.print("Enter ID (100-999): ");
                id = sc.nextInt();
                if (!Employee.isValidId(id)) {
                    System.out.println("Invalid ID! Try again.");
                }
            } while (!Employee.isValidId(id));
            
            sc.nextLine(); // Clear buffer
            System.out.print("Enter department: ");
            String dept = sc.nextLine();
            
            double sal;
            do {
                System.out.print("Enter salary (10000-100000): ");
                sal = sc.nextDouble();
                if (!Employee.isValidSalary(sal)) {
                    System.out.println("Invalid salary! Try again.");
                }
            } while (!Employee.isValidSalary(sal));
            
            Employee newEmp = new Employee(name, id, dept, sal);
            newEmp.showDetails();
            
            System.out.println("\nFinal employee count: " + Employee.getTotalEmployees());
        }
        
        sc.close();
    }
}

/*
STATIC EXPLANATION:

STATIC VARIABLE:
- Belongs to the class, not to individual objects
- Same copy shared by all objects
- Example: totalEmployees counter

STATIC METHOD:
- Can be called without creating object
- Cannot use instance variables directly
- Called using ClassName.methodName()
- Example: Employee.getTotalEmployees()

DIFFERENCE:
- Static: Employee.showCompanyName() - call on class
- Instance: emp1.showDetails() - call on object

WHY USE STATIC?
- For data that belongs to the whole class
- For utility methods that don't need object data
- For validation methods
- To count total objects created
*/