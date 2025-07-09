package demo.Chapter2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static int [] input(int n){
      int[] t = new int[n];

        System.out.println("Nhap day so: ");
        for (int i = 0; i <10 ; i++) {
            t[i] = sc.nextInt();
        }
        return t;
    };
    public static void  output(int  [] a){

        System.out.println(" day so: ");

        for (int i = 0; i < a.length; i++) {
            System.out.println( a[i] +"");
        }
        System.out.println();
    };

    private  static int sum(int...a){
        int t = 0;
        for (int i:a
             ) {
            t +=i;
        }return t;
    }
    private static void out(Book[] b){
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
    public static void main(String[] args) {
        int[] a = {-4, 5, 76, 90, -50};
        System.out.println("so phan tu :" + a.length);
        System.out.print("cac phan tu :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

//        int n;
//        int [] b;
//        System.out.println("n =");
//        n = sc.nextInt();
//        b = input(n);
//            output(b);
        System.out.println("Tong cua array : +" + sum(a));
        System.out.println("Tong cua danhs sach liet ke" + sum(1, 2, 3, 4));

        Book book1 = new Book(1,"2");
        Book book2 = new Book(2,"3");
        Book book3 = new Book(3,"4");

    }
}
