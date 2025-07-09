package demo.Tut3.Queue.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();

        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        queue.offer("Five");

        String x;
        while ((x=queue.poll()) != null){
            System.out.println(x);
        }
    }
}
