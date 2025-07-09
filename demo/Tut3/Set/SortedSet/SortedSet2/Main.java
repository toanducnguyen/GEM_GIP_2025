package demo.Tut3.Set.SortedSet.SortedSet2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Staff e1 = new Staff("Tom A", 5000);
        Staff e2 = new Staff("Tom A", 2000);
        Staff e3 = new Staff("Jerry A", 1000);
        Staff e4 = new Staff("Tom B", 1000);
        Staff e5 = new Staff("Jerry B", 5000);
        Staff e6 = new Staff("Donald A", 1000);

        StaffComparator comparator = new StaffComparator();

        SortedSet<Staff> staff= new TreeSet<Staff>(comparator);
        staff.add(e1);
        staff.add(e2);
        staff.add(e3);
        staff.add(e4);
        staff.add(e5);
        staff.add(e6);

        for (Staff s :staff
             ) {
            System.out.println(s.getFullName()+" / "+s.getSalary());
        }
    }
}
