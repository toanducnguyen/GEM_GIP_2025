package demo.Tut1;

public class Employee {
    private String name;
    private double currentSalary;
    private  double percentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public Employee(String name, double currentSalary, double percentage) {
        this.name = name;
        this.currentSalary = currentSalary;
        this.percentage = percentage;
    }
    public double newSalary(double currentSalary,double percentage){
        return this.currentSalary + (percentage / 100.0) * this.currentSalary;
    }
}
