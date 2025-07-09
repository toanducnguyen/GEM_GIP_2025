package demo.Tut2.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhap ten: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Greeting g = new Greeting();
        LocalGreeting lg = new LocalGreeting();
        g.hello(name);
        lg.hello(name);
    }
}
