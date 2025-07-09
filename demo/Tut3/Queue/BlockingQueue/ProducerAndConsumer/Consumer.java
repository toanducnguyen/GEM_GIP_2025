package demo.Tut3.Queue.BlockingQueue.ProducerAndConsumer;
//tạo ra một class Comsumer triển khai interface Runable dùng để tạo ra các thread
// trong đó có 2 thuộc tính đó chính là tên và một hàng đợi queue sẽ chứa các parameters là Product
// override lại phương thức run trong đó sẽ try khi mà while (true) tạo ra một vòng lặp
//  gọi đến phương thức consume sẽ in ra câu gồm tên của người consumer và phương thức getInfor
// trong đó phải đợi thông tin được trả về khi mà thread ở lớp producer thực hiện xong khi trả về thông số của Product

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private String consumerName;
    private final BlockingQueue<Product> queue;

    public Consumer(String consumerName, BlockingQueue<Product> queue) {
        this.consumerName = consumerName;
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            while (true){
                this.consume(queue.take());
            }
        }catch (InterruptedException ex){

        }
    }

    private void consume(Product x) {
        System.out.println("-->"+ this.consumerName+" >> Consume: " +x.gerInfor());
    }
}
