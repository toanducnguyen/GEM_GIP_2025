package demo.Tut3.Map.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Sử dụng keySet");
        Map<String,String> phoneBook = new HashMap<String,String>();
        phoneBook.put("01000005", "Tom");
        phoneBook.put("01000002", "Jerry");
        phoneBook.put("01000003", "Tom");
        phoneBook.put("01000004", "Donald");

        Set<String> phoneNumbers = phoneBook.keySet();

        for (String phoneNumber:phoneNumbers
             ) {
            String name = phoneBook.get(phoneNumber);

            System.out.println("sdt: "+phoneNumber+" /name: "+name);
        }


        System.out.println("Map.Entry sẽ có 2 phương thức getKey và getValue");
        Map<String,String> phoneBook2= new HashMap<String,String>();
        phoneBook2.put("01000005", "Tom");
        phoneBook2.put("01000002", "Jerry");
        phoneBook2.put("01000003", "Tom");
        phoneBook2.put("01000004", "Donald");

        Set<Map.Entry<String,String>> contacts =phoneBook2.entrySet();

        for (Map.Entry<String,String> x:contacts
        ) {
            String phoneNumber = x.getKey();
            String name = x.getValue();

            System.out.println(phoneNumber+" / "+name);
        }


        System.out.println("sử dụng map.entry và iterator");
        Map map = new HashMap<>();
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"?"+entry.getValue());

        }
    }
}
