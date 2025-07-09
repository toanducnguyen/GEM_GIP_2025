package demo.Tut3.Queue.BlockingQueue.ProducerAndConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Product> q = new ArrayBlockingQueue<Product>(5);
        Producer producer1 = new Producer("Producer 01", q, 1);
        Producer producer2 = new Producer("Producer 02", q,2);
        Consumer consumer1 = new Consumer("Consumer 01", q);
        Consumer consumer2 = new Consumer("Consumer 02", q);
        Consumer consumer3 = new Consumer("Consumer 03", q);

        // Starting the threads
        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
        new Thread(consumer3).start();


    }
}
