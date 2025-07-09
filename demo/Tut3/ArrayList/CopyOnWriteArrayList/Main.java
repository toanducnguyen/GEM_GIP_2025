package demo.Tut3.ArrayList.CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator1 = list.iterator();

        list.add("X1");
        list.add("X2");

        Iterator<String> iterator2 = list.iterator();

        System.out.println("iterator1");
        while(iterator1.hasNext()){

            System.out.println(iterator1.next());
        }
        System.out.println("iterator2");
        while (iterator2.hasNext()){

            System.out.println(iterator2.next());
        }
    }
}
