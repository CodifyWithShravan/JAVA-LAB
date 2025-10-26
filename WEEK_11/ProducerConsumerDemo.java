package WEEK_11;

import java.util.LinkedList;

/**
 * 11b) This program implements the classic Producer-Consumer problem
 * using a shared buffer and inter-thread communication
 * with wait() and notifyAll().
 */
public class ProducerConsumerDemo {

    public static void main(String[] args) {
        // Create the shared buffer with a capacity of 5
        SharedBuffer buffer = new SharedBuffer(5);

        // Create the Producer thread
        Thread producerThread = new Thread(new Producer(buffer), "Producer");
        
        // Create the Consumer thread
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer");

        System.out.println("Starting Producer and Consumer threads...");
        System.out.println("Buffer capacity is 5. Type Ctrl+C to stop.");
        
        producerThread.start();
        consumerThread.start();
    }

    /**
     * The SharedBuffer class holds the data.
     * It is the object on which threads will be synchronized and will wait/notify.
     */
    static class SharedBuffer {
        private LinkedList<Integer> buffer;
        private int capacity;

        public SharedBuffer(int capacity) {
            this.buffer = new LinkedList<>();
            this.capacity = capacity;
        }

        /**
         * The Producer calls this method to add an item to the buffer.
         */
        public void produce(int item) throws InterruptedException {
            synchronized (this) {
                // Use 'while' to re-check the condition after waking up
                // This guards against "spurious wakeups"
                while (buffer.size() == capacity) {
                    System.out.println(Thread.currentThread().getName() + " found buffer is FULL. Waiting...");
                    wait(); // Releases the lock and goes to sleep
                }

                // Woke up and re-acquired lock, or buffer was not full
                buffer.add(item);
                System.out.println(Thread.currentThread().getName() + " produced item: " + item + ". Buffer size: " + buffer.size());

                // Notify ALL waiting threads (i.e., any Consumers)
                // that the state has changed (it's no longer empty).
                notifyAll();
            }
        }

        /**
         * The Consumer calls this method to remove an item from the buffer.
         */
        public int consume() throws InterruptedException {
            synchronized (this) {
                // Use 'while' to re-check the condition after waking up
                while (buffer.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + " found buffer is EMPTY. Waiting...");
                    wait(); // Releases the lock and goes to sleep
                }

                // Woke up and re-acquired lock, or buffer was not empty
                int item = buffer.removeFirst();
                System.out.println(Thread.currentThread().getName() + " consumed item: " + item + ". Buffer size: " + buffer.size());

                // Notify ALL waiting threads (i.e., any Producers)
                // that the state has changed (it's no longer full).
                notifyAll();
                return item;
            }
        }
    }

    /**
     * The Producer runnable class.
     * It runs in its own thread and continuously produces items.
     */
    static class Producer implements Runnable {
        private SharedBuffer buffer;

        public Producer(SharedBuffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            int item = 0;
            try {
                while (true) {
                    buffer.produce(item++);
                    // Simulate time taken to produce an item
                    Thread.sleep(100); 
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted.");
            }
        }
    }

    /**
     * The Consumer runnable class.
     * It runs in its own thread and continuously consumes items.
     */
    static class Consumer implements Runnable {
        private SharedBuffer buffer;

        public Consumer(SharedBuffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    buffer.consume();
                    // Simulate time taken to consume an item
                    Thread.sleep(1000); // Consumer is slower than producer
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted.");
            }
        }
    }
}

