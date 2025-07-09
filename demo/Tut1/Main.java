package demo.Tut1;

public class Main {
    public static void main(String[] args) {
        Student s1= new Student("Flex",80);
        Student s2 =new Student("leoan",60);

        System.out.println("hoc sinh " + s2.getName()+" co so diem la "+s2.getScore()+" "+s2.checkPassFail(s2.getScore()) +" ki thi");
        Employee e1 = new Employee("toan", 1000.00,20.00);

        System.out.println("Nhan vien "+e1.getName()+" co luong moi la : "+e1.newSalary(e1.getCurrentSalary(), e1.getPercentage())) ;
    }
}
