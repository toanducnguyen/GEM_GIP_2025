package demo.Tut3.Set.SortedSet.SubSetHeadSetTailSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<String>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        System.out.println("luc bat dau");
        for (String s:set
             ) {
            System.out.println(s);
        }
        System.out.println("tao ra mot subset tu");
        SortedSet<String> subSet =set.subSet("b","d");// tao ra mot subset

        for (String s1:subSet
             ) {
            System.out.println(s1);
        }
        subSet.add("b1");
        subSet.add("b2");
        System.out.println("sau khi them phan tu vao subset");
        for (String s2:subSet
             ) {
            System.out.println(s2);

        }
        System.out.println("Set sau khi them subset la");
        for (String s:set
             ) {
            System.out.println(s);
        }



        //headSet

        System.out.println("--HeadSet-- tra ket qua tu dau den b1");
        SortedSet<String> headSet = set.headSet("b1");
        for (String x :headSet
             ) {
            System.out.println(x);
        }
        System.out.println("--TailSet-- tra ket qua tu b1 den het");
        SortedSet<String> tailSet = set.tailSet("b1");
        for (String x :tailSet
             ) {
            System.out.println(x);
        }
    }
}
