package Week_8;

import java.util.Scanner;

public class EmployeeScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter department: ");
        String dept = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);

        sc.close();
    }
}
