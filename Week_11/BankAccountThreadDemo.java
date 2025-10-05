package Week_11;

public class BankAccountThreadDemo {
    static class Account {
        private int balance = 0;

        // synchronized to make deposits thread-safe
        public synchronized void deposit(int amount) {
            int old = balance;
            balance = old + amount; // simulate non-atomic read-modify-write
        }

        public int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Account acc = new Account();

        Runnable depositor = () -> {
            for (int i = 0; i < 1000; i++) {
                acc.deposit(1);
            }
        };

        Thread t1 = new Thread(depositor);
        Thread t2 = new Thread(depositor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final balance: " + acc.getBalance() + " (expected 2000)");
    }
}
