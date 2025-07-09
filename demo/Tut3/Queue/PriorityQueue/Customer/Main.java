package demo.Tut3.Queue.PriorityQueue.Customer;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Customer tom = new Customer("Tom", 200);
        Customer jerry = new Customer("Jerry", 50);
        Customer donald = new Customer("Donald", 300);
        Customer mickey = new Customer("Mickey", 30);
        Customer daffy = new Customer("Daffy", 500);

        PriorityQueue<Customer> queue = new PriorityQueue<Customer>();
        queue.add(tom);
        queue.add(jerry);
        queue.add(donald);
        queue.add(mickey);
        queue.add(daffy);

        Customer currentCustomer = null;

        while ((currentCustomer = queue.poll()) !=null){
            System.out.println("--- Serving customer: " + currentCustomer.getFullName() + " ---");
            System.out.println("   >> Loyalty Points: " + currentCustomer.getLoyaltyPoints());
            System.out.println();
        }
    }
}
