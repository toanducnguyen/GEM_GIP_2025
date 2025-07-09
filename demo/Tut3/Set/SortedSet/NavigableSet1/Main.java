package demo.Tut3.Set.SortedSet.NavigableSet1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1970, 1966, 1962, 1958, 1954, 1950, 1938, 1934, 1930);

        NavigableSet<Integer> WorldCupSet = new TreeSet<Integer>(list) ;
        System.out.println("years  of world cup: "+ WorldCupSet);

        NavigableSet<Integer> ReverseYears =WorldCupSet.descendingSet();
        System.out.println("reverse wc years: "+ReverseYears);

        NavigableSet<Integer> tailSet = WorldCupSet.tailSet(1954,false);//true false standing for the element  included in list
        System.out.println("wc years start from 1954 : "+tailSet);

        NavigableSet<Integer> headSet = WorldCupSet.headSet(1954,true);
        System.out.println("wc years from beginning to 1954: "+headSet);

        int year1 = WorldCupSet.lower(1966);
        System.out.println("wc years before 1966: " + year1);

        int year2 = WorldCupSet.higher(1966);
        System.out.println("wc year after 1966: "+year2);
    }
}
