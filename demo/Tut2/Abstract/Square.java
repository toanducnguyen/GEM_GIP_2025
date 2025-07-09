package demo.Tut2.Abstract;

public class Square extends Perimeter{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    double Perimeter() {
        return 4 * this.side;
    }
}
