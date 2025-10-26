package WEEK_11;

/**
 * 11a) This program simulates a bank account where multiple threads
 * deposit money concurrently. It demonstrates the need for synchronization
 * to prevent race conditions.
 */

// This class represents the shared resource (the bank account)
class BankAccount {
    // volatile keyword ensures that the 'balance' variable is read from/written to main memory,
    // but it is NOT enough to solve the race condition on its own.
    private volatile long balance;

    public BankAccount(long initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * This is the UNSAFE deposit method.
     * If multiple threads call this at the same time, it will cause a race condition.
     * The read-modify-write operation is not atomic.
     */
    public void unsafeDeposit(long amount) {
        long currentBalance = this.balance; // 1. Read
        // Simulate some processing time, making a race condition more likely
        try { Thread.sleep(1); } catch (InterruptedException e) {}
        long newBalance = currentBalance + amount; // 2. Modify
        this.balance = newBalance; // 3. Write
    }

    /**
     * This is the SAFE deposit method.
     * The 'synchronized' keyword ensures that only one thread can execute this
     * method at any given time for this specific BankAccount instance.
     * It acquires a lock, performs the entire operation atomically, and then releases the lock.
     */
    public synchronized void safeDeposit(long amount) {
        long currentBalance = this.balance; // 1. Read
        // We can still simulate work inside the synchronized block
        try { Thread.sleep(1); } catch (InterruptedException e) {}
        long newBalance = currentBalance + amount; // 2. Modify
        this.balance = newBalance; // 3. Write
    }

    public long getBalance() {
        return this.balance;
    }
}

// This class is the Thread that will try to make a deposit
class DepositThread extends Thread {
    private BankAccount account;
    private long depositAmount;
    private int depositCount;
    private boolean useSafeMethod;

    public DepositThread(BankAccount account, long amount, int count, boolean safe) {
        this.account = account;
        this.depositAmount = amount;
        this.depositCount = count;
        this.useSafeMethod = safe;
    }

    @Override
    public void run() {
        for (int i = 0; i < depositCount; i++) {
            if (useSafeMethod) {
                account.safeDeposit(depositAmount);
            } else {
                account.unsafeDeposit(depositAmount);
            }
        }
    }
}

// Main class to run the simulation
public class BankAccountSimulation {
    
    public static void main(String[] args) throws InterruptedException {
        runSimulation(false); // Run with the UNSAFE method first
        runSimulation(true);  // Run with the SAFE method
    }

    public static void runSimulation(boolean useSafeMethod) throws InterruptedException {
        System.out.println("--- Running simulation with " + (useSafeMethod ? "SAFE (synchronized)" : "UNSAFE") + " method ---");
        
        long initialBalance = 0;
        long depositAmount = 10;
        int depositCount = 100;
        int numThreads = 10;
        
        BankAccount account = new BankAccount(initialBalance);
        DepositThread[] threads = new DepositThread[numThreads];

        // Create all the threads
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new DepositThread(account, depositAmount, depositCount, useSafeMethod);
        }

        // Start all the threads
        for (int i = 0; i < numThreads; i++) {
            threads[i].start();
        }

        // Wait for all threads to complete
        // The join() method causes the main thread to wait until the other thread dies.
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        // --- Calculate Results ---
        long expectedBalance = initialBalance + (depositAmount * depositCount * numThreads);
        long actualBalance = account.getBalance();
        
        System.out.println("Expected Balance: " + expectedBalance);
        System.out.println("Actual Balance:   " + actualBalance);
        
        if (expectedBalance == actualBalance) {
            System.out.println("SUCCESS: Balances match!");
        } else {
            System.out.println("FAILURE: Race condition detected! Balances do not match.");
        }
        System.out.println("--------------------------------------------------\n");
    }
}

