package demo.Tut3.Deque.Deque2;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();

        deque.add("Ace");
        deque.add("King");
        deque.add("Queen");
        deque.add("Jack");

        System.out.println(deque);

        System.out.println("----");
        String CardAtTop = deque.remove();
        System.out.println("Card At top: "+CardAtTop);

        System.out.println("----");
        String CardAtTop2 = deque.peekFirst();
        System.out.println("Card At Top After remove the Fist Card: "+CardAtTop2);

        System.out.println("----");
        System.out.println("deque sau khi remove lá bài đầu tiên: "+deque);
    }
}
