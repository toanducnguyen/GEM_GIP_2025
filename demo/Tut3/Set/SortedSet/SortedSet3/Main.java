package demo.Tut3.Set.SortedSet.SortedSet3;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(9);
        Circle c4 = new Circle(7);


        CircleComparator comparator = new CircleComparator();
        SortedSet<Circle> set = new TreeSet<Circle>(comparator);

        set.add(null);
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);


        for (Circle c :set
             ) {
            System.out.println("Circle: "+ (c == null ? null : c.getRadius()));   //condition:==null value if true:null,value if false: c.getRadius
        }
    }
}
