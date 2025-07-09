package demo.Tut3.Queue.PriorityQueue.Employee;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Employee tom = new Employee("Tom", 2000);
        Employee jerry = new Employee("Jerry", 500);
        Employee donald = new Employee("Donald", 3000);
        Employee mickey = new Employee("Mickey", 2000);
        Employee daffy = new Employee("Daffy", 5000);

        EmployeeComparator comparator = new EmployeeComparator();
        PriorityQueue<Employee> queue = new PriorityQueue<Employee>(comparator);

        queue.add(tom);
        queue.add(jerry);
        queue.add(donald);
        queue.add(mickey);
        queue.add(daffy);

        Employee currentEmployee =null;

        while ((currentEmployee = queue.poll()) != null){
            System.out.println("--- Serving employee: " + currentEmployee.getFullName() + " ---");
            System.out.println("   >> Salary: " + currentEmployee.getSalary());
            System.out.println();
        }
    }
}
