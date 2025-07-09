package demo.Tut3.Set.SortedSet.SortedSet2;

import java.util.Comparator;

public class StaffComparator implements Comparator<Staff>{
    @Override
    public int compare( Staff o1, Staff o2) {
            float delta = o1.getSalary()-o2.getSalary();
            if (delta > 0) {
                return 1;
            } else if (delta < 0) {
                return -1;
            }
            return o1.getFullName().compareTo(o2.getFullName());
        }
}

