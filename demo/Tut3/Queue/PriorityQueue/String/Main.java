package demo.Tut3.Queue.PriorityQueue.String;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();

        queue.add("F");
        queue.add("D");
        queue.add("B");
        queue.add("A");
        queue.add("C");

        String s ;
        while ((s=queue.poll()) != null){
            System.out.println(s);
        }
    }
}
