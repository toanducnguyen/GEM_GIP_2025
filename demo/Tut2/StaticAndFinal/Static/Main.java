package demo.Tut2.StaticAndFinal.Static;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Company.name= name;
        Company.printName();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Calculator.add(a,b));
        System.out.println(Calculator.name);
    }
}
