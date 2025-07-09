package demo.Tut3.Map.SortedMap.subMapHeadMapTailMap;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<String,String> myMap = new TreeMap<>();

        myMap.put("A", "VA");
        myMap.put("B", "VB");
        myMap.put("C", "VC");
        myMap.put("D", "VD");
        myMap.put("E", "VE");

        System.out.println("--SubMap--");
        SortedMap<String,String> subMap = myMap.subMap("B","D");
        Set<Map.Entry<String,String>> entrySet = subMap.entrySet();
        for (Map.Entry<String,String> x: entrySet
             ) {
            System.out.println(x.getKey()+" / "+x.getValue());
        }

        System.out.println("subMap after put 2 elements in");
        subMap.put("B1", "VB1");
        subMap.put("B2", "VB2");
        for (Map.Entry<String,String> x: entrySet
        ) {
            System.out.println(x.getKey()+" / "+x.getValue());
        }

        System.out.println("myMap at all:");
        for (String x :myMap.keySet()
             ) {
            System.out.println(x+" / " +myMap.get(x));
        }

        System.out.println("--headMap--");
        SortedMap<String,String> map2= myMap.headMap("D");
        for (String x :map2.keySet()
        ) {
            System.out.println(x+" / " +myMap.get(x));
        }
    }
}
