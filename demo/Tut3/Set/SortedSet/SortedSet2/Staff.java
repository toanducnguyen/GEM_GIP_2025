package demo.Tut3.Set.SortedSet.SortedSet2;

public class Staff {
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

    public Staff(String fullName, float salary){
        this.fullName=fullName;
        this.salary=salary;
    }
}
