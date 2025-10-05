package Week2;
import java.util.Scanner;

/**
 * Week 2: Bank Account with constructors and 'this' keyword
 */

/**
 * Week 2: Bank Account class with constructors and 'this' keyword
 */
class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    
    // No-argument constructor
    public BankAccount() {
        this.accountHolderName = "Unknown";
        this.accountNumber = "000000";
        this.balance = 0.0;
    }
    
    // Parameterized constructor
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        this.accountHolderName = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        this.accountNumber = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        this.balance = scanner.nextDouble();
        scanner.close();
    }
    
    void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount + ", New Balance: $" + this.balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }
    
    void withdraw(int amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", Balance: $" + this.balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    
    void displayAccountDetails() {
        System.out.println("\n=== Account Details ===");
        System.out.println("Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: $" + this.balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        // Default constructor
        BankAccount account1 = new BankAccount();
        account1.displayAccountDetails();
        
        // Parameterized constructor
        BankAccount account2 = new BankAccount("John Doe", "123456", 1000.0);
        account2.displayAccountDetails();
        
        // Test operations
        account2.deposit(500);
        account2.withdraw(200);
        account2.displayAccountDetails();
    }
}
