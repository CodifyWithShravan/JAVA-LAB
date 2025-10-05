package Week6;

/**
 * Week 6b: Custom exception handling demonstration
 */

// Custom exception class for age validation
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom exception class for balance validation
class InsufficientBalanceException extends Exception {
    private double currentBalance;
    private double requestedAmount;
    
    public InsufficientBalanceException(String message, double currentBalance, double requestedAmount) {
        super(message);
        this.currentBalance = currentBalance;
        this.requestedAmount = requestedAmount;
    }
    
    public void printDetails() {
        System.out.println("Current Balance: $" + currentBalance);
        System.out.println("Requested Amount: $" + requestedAmount);
        System.out.println("Shortage: $" + (requestedAmount - currentBalance));
    }
}

// Custom exception for invalid operations
class InvalidOperationException extends RuntimeException {
    public InvalidOperationException(String message) {
        super(message);
    }
}

// Person class demonstrating age validation
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        setAge(age);
    }
    
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        if (age > 150) {
            throw new InvalidAgeException("Age seems unrealistic: " + age);
        }
        this.age = age;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// BankAccount class demonstrating balance validation
class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) throws InsufficientBalanceException, InvalidOperationException {
        if (amount <= 0) {
            throw new InvalidOperationException("Withdrawal amount must be positive: " + amount);
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance for withdrawal",
                balance, amount
            );
        }
        balance -= amount;
        System.out.println("Withdrawal successful: $" + amount);
        System.out.println("Remaining balance: $" + balance);
    }
    
    public void deposit(double amount) throws InvalidOperationException {
        if (amount <= 0) {
            throw new InvalidOperationException("Deposit amount must be positive: " + amount);
        }
        balance += amount;
        System.out.println("Deposit successful: $" + amount);
        System.out.println("New balance: $" + balance);
    }
    
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
}

public class CustomExceptionDemo {
    
    public static void testPersonCreation() {
        System.out.println("=== Person Age Validation Test ===");
        
        // Test cases for Person creation
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        int[] ages = {25, -5, 30, 200};
        
        for (int i = 0; i < names.length; i++) {
            try {
                Person person = new Person(names[i], ages[i]);
                System.out.println("Created: " + person);
            } catch (InvalidAgeException e) {
                System.out.println("Failed to create person '" + names[i] + "': " + e.getMessage());
            }
        }
    }
    
    public static void testBankOperations() {
        System.out.println("\n=== Bank Account Operations Test ===");
        
        try {
            BankAccount account = new BankAccount("ACC001", 1000.0);
            System.out.println("Created account: " + account.getAccountNumber() + " with balance: $" + account.getBalance());
            
            // Valid operations
            account.deposit(500.0);
            account.withdraw(200.0);
            
            // Invalid operations
            account.withdraw(-100.0);  // Should throw InvalidOperationException
            
        } catch (InvalidOperationException e) {
            System.out.println("Invalid Operation: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
        
        // Test insufficient balance
        try {
            BankAccount account2 = new BankAccount("ACC002", 100.0);
            account2.withdraw(500.0);  // Should throw InsufficientBalanceException
            
        } catch (InsufficientBalanceException e) {
            System.out.println("\nInsufficient Balance Exception: " + e.getMessage());
            e.printDetails();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("CUSTOM EXCEPTION DEMONSTRATION");
        System.out.println("==============================\n");
        
        // Test Person class with age validation
        testPersonCreation();
        
        // Test BankAccount class with balance validation
        testBankOperations();
        
        System.out.println("\n=== Custom Exception Chain Demo ===");
        try {
            // Demonstrate exception chaining
            simulateComplexOperation();
        } catch (Exception e) {
            System.out.println("Main caught: " + e.getMessage());
            
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Root cause: " + cause.getMessage());
            }
        }
        
        System.out.println("\n=== Summary ===");
        System.out.println("✓ InvalidAgeException - Age validation");
        System.out.println("✓ InsufficientBalanceException - Balance validation with details");
        System.out.println("✓ InvalidOperationException - Runtime exception for invalid operations");
        System.out.println("✓ Exception chaining demonstrated");
        System.out.println("✓ Custom exception methods (printDetails)");
    }
    
    private static void simulateComplexOperation() throws Exception {
        try {
            // Simulate a complex operation that fails
            throw new InvalidOperationException("Database connection failed");
        } catch (InvalidOperationException e) {
            // Wrap the original exception
            throw new Exception("Complex operation failed", e);
        }
    }
}
