package demo.Chapter5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(34);
        c.add("hanoi");
        c.add(new Nhanvien("1","toan",123));
        System.out.println(c);
        Iterator i = c.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
