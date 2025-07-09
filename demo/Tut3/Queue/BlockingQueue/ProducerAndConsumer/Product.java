package demo.Tut3.Queue.BlockingQueue.ProducerAndConsumer;
//tạo ra một class product trong đó sẽ có các thuộc tính là name và seri
// ta sẽ gọi các hàm getter setter constructor
// và một hàm getInfor trả về câu bao gồm tên sản phẩm và seri
public class Product {
    private String name;
    private int serial;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
    public String gerInfor(){
        return "Product: "+this.name+" /serial: "+this.serial;
    }

    public Product(String name, int serial){
        this.name=name;
        this.serial=serial;
    }
}
