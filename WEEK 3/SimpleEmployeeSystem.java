import java.util.Scanner;

class Employee {
    // Instance variables
    String name;
    int id;
    String department;
    double salary;
    
    // Constructor using 'this' keyword
    public Employee(String name, int id, String department, double salary) {
        this.name = name;        // 'this' helps distinguish parameter from instance variable
        this.id = id;
        this.department = department;
        this.salary = salary;
        System.out.println("Employee created using constructor!");
    }
    
    // Default constructor
    public Employee() {
        this.name = "No Name";
        this.id = 0;
        this.department = "No Department";
        this.salary = 0.0;
    }
    
    // 3b) Method to display employee details
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: Rs." + this.salary);
        System.out.println("------------------------");
    }
    
    // 3c) Method to update salary
    public void updateSalary(double salary) {
        this.salary = salary;
        System.out.println("Salary updated to Rs." + this.salary);
    }
    
    // 3c) Method to update department
    public void updateDepartment(String department) {
        this.department = department;
        System.out.println("Department updated to " + this.department);
    }
}

public class SimpleEmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Employee Management System ===\n");
        
        // 3a) Add new employees using constructor
        System.out.println("Creating employees using constructor:\n");
        
        // Employee 1
        Employee emp1 = new Employee("John Smith", 101, "IT", 50000);
        emp1.displayDetails();
        
        // Employee 2  
        Employee emp2 = new Employee("Jane Doe", 102, "HR", 45000);
        emp2.displayDetails();
        
        // Employee 3 using default constructor
        Employee emp3 = new Employee();
        System.out.println("\nEmployee created with default constructor:");
        emp3.displayDetails();
        
        // Demonstrate 'this' keyword importance
        System.out.println("\n=== Demonstrating 'this' keyword ===");
        System.out.println("Without 'this', we couldn't distinguish between:");
        System.out.println("- Parameter 'name' and instance variable 'name'");
        System.out.println("- Parameter 'id' and instance variable 'id'");
        System.out.println("The 'this' keyword refers to the current object.");
        
        // 3c) Update employee attributes
        System.out.println("\n=== Updating Employee Details ===");
        
        System.out.println("Updating John's salary:");
        emp1.updateSalary(55000);
        emp1.displayDetails();
        
        System.out.println("Updating Jane's department:");
        emp2.updateDepartment("Finance");
        emp2.displayDetails();
        
        // Interactive part - add your own employee
        System.out.println("\n=== Add Your Own Employee ===");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear buffer
        
        System.out.print("Enter department: ");
        String dept = sc.nextLine();
        
        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();
        
        // Create new employee using constructor
        Employee newEmp = new Employee(name, id, dept, sal);
        newEmp.displayDetails();
        
        sc.close();
    }
}

/*
SIMPLE EXPLANATION:

CONSTRUCTOR:
- Special method that runs when object is created
- Same name as class name
- Used to set initial values

'THIS' KEYWORD:
- Points to the current object
- Helps when parameter name = instance variable name
- Example: this.name = name;
  (instance variable = parameter)

WHY USE 'THIS'?
- Without 'this': name = name; (confusing - which name?)
- With 'this': this.name = name; (clear - instance var = parameter)
*/