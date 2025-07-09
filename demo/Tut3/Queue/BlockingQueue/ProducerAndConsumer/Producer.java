package demo.Tut3.Queue.BlockingQueue.ProducerAndConsumer;
// khởi tạo một class producer triển khai interface Runable
// có các thuộc tính  là 1 biến static seri = 1, tên producer, một hàng đợi trong đó chuyền vào đối tượng Product và một integer delay
// phương thức run while(true) sẽ tạo ra một vòng lặp vô hạn tạo ra các thread các nhau sẽ là delay*1000 second
// và chèn vào hàng đợi phương thức produce trong đó sẽ in ra productName
// và sau đó mới return lại Class Product trong đó truyền vào tham số là IPhone và dãy seri tăng dần
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private static int serial  = 1;

    private final String producerName;
    private BlockingQueue<Product>queue;
    private final  int delay;

    public Producer(String producerName, BlockingQueue<Product> queue, int delay) {
        this.producerName = producerName;
        this.queue = queue;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            while (true){
                Thread.sleep(this.delay*1000);
                this.queue.put(this.produce());
            }
        }catch (InterruptedException ex){

        }
    }

    private Product produce() {
        System.out.println("# "+this.producerName+" >> Create a new product");
        return new Product("iphone14",serial++);
    }
}
