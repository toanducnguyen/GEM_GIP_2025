package demo.Tut3.Deque.Deque1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Customer> deque= new ArrayDeque<Customer>(2);

        deque.addFirst(new Customer(1, "Tom"));
        deque.addFirst(new Customer(2, "Jerry"));
        deque.addLast(new Customer(3, "Donald"));
        /// thứ tự của mảng sẽ là[3,1,2]

        Customer x = null;

        while ((x = deque.pollLast()) != null){
            System.out.println(x.getCusName() +" / "+x.getCusId());
        }
    }
}
