package demo.Tut3.Set.HashSet;

public class Employee {
    private int empId;
    private String empName;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee(int studentId, String studentName) {
        this.empId = studentId;
        this.empName = studentName;
    }
    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }
    @Override
    public boolean equals(Object other)  {
        if(other == null || !(other instanceof Employee)) {
            return false;
        }
        Employee o = (Employee) other;
        return this.empId == o.empId;
    }
}

