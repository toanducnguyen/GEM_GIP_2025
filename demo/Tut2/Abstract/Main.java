package demo.Tut2.Abstract;

public class Main {
    public static void main(String[] args) {
        Rectangle r =new Rectangle(2.00,4.00);
        System.out.println("chu vi hinh chu nhat co chieu dai la "+r.getBreadth()+" chieu rong la "+r.getLength()+" se la :" +r.Perimeter());
        r.Perimeter();
        Square s = new Square(4.00);
        System.out.println("chu vi hinh vuong co canh la "+ s.getSide()+" bang : "+s.Perimeter());
        s.Hello();

    }
}
