package demo.Tut3.Queue.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<String>();

        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        queue.offer("Five");

        String x;
        while ((x =queue.poll())!= null){  //khởi tạo x = giá trị đầu tiên của phần tử lấy ra, tiếp tục print ra cho đến khi x = null(queue rỗng)
            System.out.println(x);
        }

    }
}
