package demo.Tut2.OverridingAndOverloading.Calculate;

public class Area {
   
    public double computeArea(double length,double breadth){
        return length*breadth;
    }
    public double computeArea(double length){
        return length*length;
    }
}
