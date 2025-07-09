package demo.Tut2.StaticAndFinal.Final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Word w = new Word();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        w.setName();
        System.out.println(w.setName(name));
    }
}
