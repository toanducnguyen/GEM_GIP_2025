package demo.Tut3.Map.SortedMap.SortedMap2;


import org.jetbrains.annotations.NotNull;

public class OrderLineId implements Comparable<OrderLineId> {
    private int orderId;
    private int line;
    public OrderLineId(int orderId, int line){
        this.line=line;
        this.orderId=orderId;
    }
    public int getOrderId(){
        return orderId;
    }
    public int getLine(){
        return line;
    }
    public void setOrderId(int orderId){
        this.orderId=orderId;
    }
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public int compareTo(@NotNull OrderLineId o) {
        int delta = this.orderId-o.orderId;
        if (delta != 0){
            return delta;
        }
        return this.line-o.line;
    }
}
