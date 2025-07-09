package demo.Tut2.OverridingAndOverloading.human;

import demo.Tut2.OverridingAndOverloading.human.Person;

public abstract class Student extends Person {
    abstract void cucacula();
    public void displayInfor(){
        super.displayInfor();
        System.out.println("im a student");
    }
}
