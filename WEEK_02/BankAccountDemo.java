package WEEK_02;

import java.util.Scanner;

/**
 * This class represents the BankAccount blueprint.
 * It contains the data members and methods as per the prompt.
 */
class BankAccount {
    // 1. Data Members (Fields)
    String accountHolderName;
    long accountNumber;
    double balance;

    // 2. No-Argument Constructor
    public BankAccount() {
        // Initializes with default values
        this.accountHolderName = "N/A";
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    // 3. Parameterized Constructor (using 'this')
    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        // 'this.variable' refers to the class's data member
        // 'variable' refers to the constructor's parameter
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // --- 4. Methods ---

    /**
     * Fills in the account details using user input.
     * This is useful after creating an object with the no-arg constructor.
     */
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Creating New Account ---");
        System.out.print("Enter Account Holder Name: ");
        this.accountHolderName = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        this.accountNumber = scanner.nextLong();
        System.out.print("Enter Initial Deposit: ");
        this.balance = scanner.nextDouble();
        System.out.println("Account created successfully!");
         scanner.close();
    }

    /**
     * Deposits a given amount into the account.
     */
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("\nSuccessfully deposited: " + amount);
            System.out.println("New Balance: " + this.balance);
        } else {
            System.out.println("\nCannot deposit a zero or negative amount.");
        }
    }

    /**
     * Withdraws a given amount from the account.
     * Includes a check for sufficient funds.
     */
    public void withDraw(int amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance = this.balance - amount;
                System.out.println("\nSuccessfully withdrew: " + amount);
                System.out.println("Remaining Balance: " + this.balance);
            } else {
                System.out.println("\nWithdrawal failed: Insufficient funds.");
                System.out.println("Your balance is only: " + this.balance);
            }
        } else {
            System.out.println("\nCannot withdraw a zero or negative amount.");
        }
    }

    /**
     * Displays all account details.
     */
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance:  " + this.balance);
    }
}


/**
 * This is the main class with the main() method to test the BankAccount class.
 */
public class BankAccountDemo {

    public static void main(String[] args) {
        System.out.println("--- Week 2: Bank Account Demo ---");

        // --- Demo 1: Using No-Arg Constructor + createAccount() ---
        
        // 1. Create object using no-arg constructor
        BankAccount acc1 = new BankAccount();
        System.out.println("\nCreated 'acc1' with default values:");
        acc1.displayAccountDetails();
        
        // 2. Set details using createAccount()
        acc1.createAccount();
        
        // 3. Test methods
        acc1.displayAccountDetails();
        acc1.deposit(5000);
        acc1.withDraw(2000);
        acc1.withDraw(50000); // Test insufficient funds
        acc1.displayAccountDetails();
        

        // --- Demo 2: Using Parameterized Constructor ---
        System.out.println("\n=====================================");
        System.out.println("Creating 'acc2' with parameterized constructor...");
        
        // 1. Create and initialize object in one line
        BankAccount acc2 = new BankAccount("Jane Doe", 987654321L, 10000.0);
        
        // 2. Test methods
        acc2.displayAccountDetails();
        acc2.deposit(1500);
        acc2.withDraw(3000);
        acc2.displayAccountDetails();

       
    }
}

