package demo.Tut3.Queue.PriorityQueue.Employee;

public class Employee {
    private String fullName;
    private int salary;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }
}
