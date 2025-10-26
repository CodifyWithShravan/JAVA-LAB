package WEEK_08;



import java.util.Scanner;

/**
 * A simple class to hold Employee data (a POJO).
 */
class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // A toString() method is helpful for printing the object's details
    @Override
    public String toString() {
        return "Employee Details:\n" +
               "\tID: " + id + "\n" +
               "\tName: " + name + "\n" +
               "\tDepartment: " + department + "\n" +
               "\tSalary: " + salary;
    }
}

/**
 * 8b) This program displays employee details using the Scanner class.
 * Save this file as: week8/EmployeeScannerDemo.java
 */
public class EmployeeScannerDemo {

    public static void main(String[] args) {
        // 1. Create a Scanner object to read from System.in
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- 8b) Employee Details Entry ---");

        // --- Read Employee ID ---
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        // ** THE SCANNER TRAP FIX **
        // Consume the leftover newline character after nextInt()
        scanner.nextLine(); 

        // --- Read Employee Name ---
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        // --- Read Employee Department ---
        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();

        // --- Read Employee Salary ---
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        // 2. Create the Employee object
        Employee emp = new Employee(id, name, department, salary);

        // 3. Display the details
        System.out.println("\n--- Employee Details Saved ---");
        System.out.println(emp.toString()); // Calls the toString() method

        // 4. Close the scanner
        scanner.close();
    }
}

