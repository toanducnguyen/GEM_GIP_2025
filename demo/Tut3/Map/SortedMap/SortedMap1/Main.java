package demo.Tut3.Map.SortedMap.SortedMap1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortedMap<String,Integer> map = new TreeMap<>();

        map.put("B", 100);
        map.put("A", 200);
        map.put("F", 400);
        map.put("D", 500);
        map.put("E", 100);

        System.out.println("--keySet--");
        Set<String> keyset = map.keySet();
        for (String key:keyset
             ) {
            System.out.println(key+" --> "+map.get(key));
        }

        System.out.println("--entrySet--");
        Set<Map.Entry<String,Integer>> mapEntry = map.entrySet();

        for (Map.Entry<String,Integer> entry:mapEntry
             ) {
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
    }
}
