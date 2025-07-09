package demo.Tut3.Deque.Deque1;

public class Customer {
    private int cusId;
    private String cusName;

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public Customer(int cusId, String cusName) {
        this.cusId = cusId;
        this.cusName = cusName;
    }
}
