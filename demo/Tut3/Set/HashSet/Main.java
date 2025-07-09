package demo.Tut3.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        //HashCode sẽ so sánh trực tiếp 2 phần tử qua code đã hash ra sau đó so sánh qua phương thức equals
        Student s1 = new Student(1, "Tom");
        Student s2 = new Student(2, "Jerry");
        Student s3 = new Student(1, "Tom");
        Student s4 = new Student(4, "Daffy");
        Student s5 = new Student(5, "Donald");


        Set<Student> set = new HashSet<Student>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        for (Student s :set
             ) {
            System.out.println("Student Id :"+s.getStudentId()+" /"+ " Name: "+s.getStudentName()+" "+"(Hashcode: "+s.hashCode()+")");
        }
        System.out.println("---");

    //CopyOnWriteArraySet sẽ so sánh trực tiếp 2 phần tử qua phương thức equals

        Employee e1 = new Employee(1, "Tom");
        Employee e2 = new Employee(2, "Jerry");
        Employee e3 = new Employee(1, "Tom Cat");

        Set<Employee> set1 = new CopyOnWriteArraySet<Employee>();

        set1.add(e1);
        set1.add(e2);
        set1.add(e3);

        for(Employee e: set1) {
            System.out.println("Emp Id: "+e.getEmpId()+" / Name: "+e.getEmpName()+" (HashCode: "+e.hashCode()+")");
        }
        System.out.println("----");
        //SetOf
        Set<Integer> set2 = Set.of(1,5,6,3,4);
        Iterator<Integer> it2 = set2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
