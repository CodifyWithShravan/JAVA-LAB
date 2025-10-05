package Week_11;

import java.util.LinkedList;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        final LinkedList<Integer> buffer = new LinkedList<>();
        final int CAP = 5;

        Runnable producer = () -> {
            int value = 0;
            try {
                while (true) {
                    synchronized (buffer) {
                        while (buffer.size() == CAP) buffer.wait();
                        buffer.add(value);
                        System.out.println("Produced " + value);
                        value++;
                        buffer.notifyAll();
                    }
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable consumer = () -> {
            try {
                while (true) {
                    int v;
                    synchronized (buffer) {
                        while (buffer.isEmpty()) buffer.wait();
                        v = buffer.removeFirst();
                        System.out.println("Consumed " + v);
                        buffer.notifyAll();
                    }
                    Thread.sleep(400);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread p = new Thread(producer);
        Thread c = new Thread(consumer);
        p.start();
        c.start();

        Thread.sleep(3000);
        p.interrupt();
        c.interrupt();
    }
}
