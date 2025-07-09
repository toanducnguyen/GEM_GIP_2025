package demo.Tut3.Set.SortedSet.SortedSet3;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1 == null && o2==null){
            return 0;
        } if (o1 ==null ) {
            return -1; //o1<o2
        } else if (o2== null) {
            return 1; //o2<o1
        }
        double delta = o1.getRadius()-o2.getRadius();
        if (delta < 0) {
            return -1; //o1<o2
        } else if (delta>0) {
            return 1; //o2<o1;
        }
        return 0;
    }
}
