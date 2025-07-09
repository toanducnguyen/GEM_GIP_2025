package demo.Tut2.OverridingAndOverloading.human;

public class Employee extends Student {

    @Override
    void cucacula() {
        System.out.println("demo");
    }

    public void displayInfor(){
        super.displayInfor();
        System.out.println("im a employee");
    };
}
