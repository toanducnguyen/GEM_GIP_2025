package demo.Tut3.Queue.PriorityQueue.Employee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1 == o2){
            return 0;
        }
        if (o1 == null){
            return -1;
        }
        if (o2 == null){
            return 1;
        }
        int s = o1.getSalary()-o2.getSalary();
        if (s!=0){
            return s;
        }
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
