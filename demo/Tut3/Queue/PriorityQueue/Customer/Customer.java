package demo.Tut3.Queue.PriorityQueue.Customer;

import org.jetbrains.annotations.NotNull;

public class Customer implements Comparable<Customer> {
    private String fullName;
    private int loyaltyPoints;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public Customer(String fullName, int loyaltyPoints){
        this.fullName=fullName;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public int compareTo(@NotNull Customer o) {
        if (o ==null){
            return -1;
        }
        int delta = this.loyaltyPoints-o.loyaltyPoints;
        if (delta !=0){
            return delta;
        }
        return this.fullName.compareTo(o.fullName);
    }

}
