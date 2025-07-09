package demo.Tut3.List;

import demo.Tut3.List.Book;
import demo.Tut3.List.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList names = new ArrayList<>();

        names.add("t1");
        names.add("t2");
        names.add("t3");
        names.add("t4");

        System.out.println(names);

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Three");
        list.add("Four");

        list.add(1, "Two");

        System.out.println(list);
        list.remove(2);
        System.out.println(list);

// Book List
        Book b1 = new Book("Python Tutorial", 100f);
        Book b2 = new Book("HTML Tutorial", 120f);

        List<Book> BookList1 = List.of(b1,b2);

        List<Book> BookList = new ArrayList<Book>();
        BookList.add(new Book("Java Tutorial", 300f));
        BookList.add(new Book("C# Tutorial", 200f));
        BookList.addAll(BookList1);

        for(Book book :BookList){
            System.out.println(book.getTitle()+" "+book.getPrice());
        }

//Array.asList
        Book b3 = new Book("Python Tutorial", 100f);
        Book b4 = new Book("Java Tutorial", 300f);

        Book [] bookArray = new Book[]{b3,b4};
        List<Book> BookList2 = Arrays.asList(bookArray);

        for(Book b :BookList2){
            System.out.println(b.getPrice());
        }

//ListIterrator
        List<String> list3 = new ArrayList<String>();
        list3.add("One");
        list3.add("Two");
        list3.add("Three");
        list3.add("Four");

        ListIterator<String> listIterator=list3.listIterator();
            String first = listIterator.next();
            System.out.println("First "+first);
            String second = listIterator.next();
            System.out.println("Second "+second);
            if(listIterator.hasPrevious()){
                System.out.println("back");
                String value = listIterator.previous();
                System.out.println("value "+value);
            }
            System.out.println("------");
            while (listIterator.hasNext()){
                String value = listIterator.next();
                System.out.println("value "+value);
            }


//Stream
        List<String> myList= Arrays.asList("b1","b2","b3","c3");
            myList.stream()
                    .filter(s -> s.endsWith("3"))
                    .map(String::toUpperCase)
                    .sorted()
                    .forEach(System.out::println);

        System.out.println("---");
            myList.forEach(x -> System.out.println(x));


    //Predicate
        Employee john = new Employee("John P.", 1500, "M");
        Employee sarah = new Employee("Sarah M.", 2000, "F");
        Employee charles = new Employee("Charles B.", 1700, "M");
        Employee mary = new Employee("Mary T.", 5000, "F");
        Employee sophia = new Employee("Sophia B.", 7000, "F");
        //add to list
        List<Employee> employees = Arrays.asList(john,sophia,sarah,charles,mary);
        //logic predicate
        Predicate<Employee> predicate = e -> e.isFemale() && e.getSalary()>2500;
        //Stream
        employees
                .stream()
                .filter(predicate)
                .forEach(e -> System.out.println(e.getName()+": "+e.getSalary()));

        System.out.println("-------");
    //Sort
        employees
                .stream()
                .sorted(
                        (e1,e2)->(int)(e2.getSalary()-e1.getSalary())
                )
                .forEach(e -> System.out.println(e.getName()+": "+e.getSalary()));

//subInt
        List<String> originList = new ArrayList<String>();

        originList.add("A");//0
        originList.add("B");//1
        originList.add("C");//2
        originList.add("D");//3
        originList.add("E");//4

        List<String> subList = originList.subList(2,4);//  start with 2 and stop before 4 mean 2,3
        for(String s :subList){
            System.out.println(s);
        }
        subList.clear();//clear
        for(String s :originList){
            System.out.println(s);
        }
        System.out.println("----------");
//List to Array (nguoc voi Array.asList)

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("A");//0
        arrayList.add("B");//1
        arrayList.add("C");//2
        arrayList.add("D");//3
        arrayList.add("E");//4

        String[] array = new String[arrayList.size()];
        arrayList.toArray(array);
        for (String x :array){
            System.out.println(x);
        }
        System.out.println();
    }
}