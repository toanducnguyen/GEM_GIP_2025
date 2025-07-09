package demo.Tut3.Map.Test;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Map<String,Integer> populationMap = new HashMap<>();

        populationMap.put("Vietnam", 98);
        populationMap.put("Phillipine", 109);
        populationMap.put("United States", 330);
        populationMap.put("Indonesia", 273);
        populationMap.put("Russia", 145);

        System.out.println("using iterator to show the population by Collection...values():");
        Collection<Integer> values = populationMap.values();

        for (Integer x :values
             ) {
            System.out.println(x+" millions");
        }
        System.out.println("using entrySet to show infor by 2 two method getKey and getValue");
        Set<Map.Entry<String,Integer>>set = populationMap.entrySet();

        for (Map.Entry<String,Integer> x:set
             ) {
            System.out.println(x.getKey()+" ==> "+x.getValue()+" Millions");
        }

        System.out.println("continue using entrySet and iterator to remove country have population bigger than 200");
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry=iterator.next();

            if (entry.getValue()>200 ){
                iterator.remove();
            }
        }
        set.forEach(entry ->{
            System.out.println(entry.getKey()+"/"+entry.getValue());
        });

    }
}
