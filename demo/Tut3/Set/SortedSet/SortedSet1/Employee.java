package demo.Tut3.Set.SortedSet.SortedSet1;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee> {
    private String fullName;
    private float salary;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(String fullName, float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }


    @Override
    public int compareTo(@NotNull Employee o) {
        float delta = this.salary - o.salary;
        if (delta>0){
            return 1;
        }else if (delta<0){
            return -1;
        }
        return this.fullName.compareTo(o.fullName);
    }
}
