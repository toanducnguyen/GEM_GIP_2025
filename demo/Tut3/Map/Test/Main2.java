package demo.Tut3.Map.Test;

import java.util.HashMap;
import java.util.Map;

//Null Key/Value
public class Main2 {
    public static void main(String[] args) {
        Map<String,Integer> mapCar = new HashMap<>();

        mapCar.put("C300",2023);
        mapCar.put("E250",2021);

        mapCar.put(null,2020);

        System.out.println(mapCar.get(null));
        System.out.println("--");

        Map<String,Integer> map = new HashMap<>();

        map.put("Aa",null);
        Integer value = map.get("Aa");
        System.out.println("Aa ==> " +value);

        boolean test = map.containsKey("Aa");
        System.out.println("Map contains Aa?: "+test);

        boolean test2 = map.containsValue(12);
        System.out.println("Map contains value 12?: "+test2);
    }
}
