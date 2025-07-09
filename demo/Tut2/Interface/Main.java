package demo.Tut2.Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia chi chieu dai va chieu rong:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Rectangle r =new Rectangle(width, height);
        System.out.println("dien tich hinh chu nhat la:" +r.getArea());

    }
}
