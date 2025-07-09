package demo.Tut3.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //remove
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(55);
        list.add(22);
        list.add(77);
        list.add(33);
        list.add(99);
        list.add(11);

        ListIterator<Integer> lister = list.listIterator();

        int a = lister.next();
        while (lister.hasNext()){
            int b = lister.next();
            if(b<a){
                lister.remove();
            }else {
                a=b;
            }
        }
        for (Integer value:list
             ) {
            System.out.println(value);
        }

        //set
        list.add(-111);
        list.add(555);
        list.add(-222);
        list.add(777);
        list.add(-333);
        list.add(999);
        list.add(111);

        ListIterator<Integer> list1 = list.listIterator();
        while (list1.hasNext()){
            int current = list1.next();
                    if(current<0){
                        list1.set(0);
                    }
        }
        for (Integer value:list
             ) {
            System.out.println(value);
        }

        //add
        List<String> listString = new ArrayList<String>();
        listString.add("One");
        listString.add("Two");
        listString.add("Three");
        listString.add("Four");
        listString.add("Five");

        ListIterator<String> listerString = listString.listIterator();

        listerString.next();
        listerString.next();
        listerString.next();
        listerString.previous();
        listerString.add("Hello");

        for (String x:listString
             ) {
            System.out.println(x);
        }
    }
}
