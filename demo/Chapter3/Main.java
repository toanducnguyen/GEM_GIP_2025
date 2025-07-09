package demo.Chapter3;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        double diem = 4;
//        if(diem < 4 ){
//            System.out.println("kem");
//        }else if(  diem < 7){
//            System.out.println("kha");
//        }else {
//            System.out.println("gioi");
//        }
//        System.out.println( diem>=5?"dat":"khong dat");
//        //
//
//        int c = 4;
//        switch (c){
//            case 1:
//            System.out.println("ban chon 1");
//            break;
//            case 2:
//                System.out.println("ban chon 2");
//            case 3:
//                System.out.println("ban chon 3");
//                break;
//            default:
//                System.out.println("khong chon");
//        }

//        Random r = new Random();
//        int so;
//        do{
//            so =r.nextInt(5);
//            System.out.println(so);
//        }while (so != 3);

//        int [] so ={3,14,85,-23};
//        for(int i=0;i< so.length;i++){
//            System.out.print(so[i] +" ");
//        }
//        System.out.println();
//
//        for (int x :so){
//            System.out.print (x +" ");
//        }

//        int a;
//        boolean answer;
//        String name;
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("a =");
//        a = sc.nextInt();
//        System.out.println("ban co dong y?");
//        answer =sc.nextBoolean();
//        System.out.println("ten?");
//        name= sc.next();
//        System.out.println("a ="+a+"tra loi: "+(answer?"dong y":"khong dong y"));
//        System.out.println("ten: "+ name);

//        while (true) {
//            System.out.println("2. chon 2");
//            System.out.println("3. chon 3");
//            System.out.println("4. chon 4");
//            System.out.println("5. chon 5");
//            System.out.println("1. chon 1");
//            System.out.println("0. Thoat");
//            System.out.print("Moi ban chon (0-5): ");
//            int chon;
//            Scanner sc = new Scanner(System.in);
//            chon = sc.nextInt();
//            switch (chon){
//                case 0:
//                    System.out.println("Exit");
//                    System.exit(0);
//                case 1:
//                    System.out.println("Ban chon 1");
//                    break;
//                case 2:
//                    System.out.println("Ban chon 2");
//                    break;
//                case 3:
//                    System.out.println("Ban chon 3");
//                    break;
//                case 4:
//                    System.out.println("Ban chon 4");
//                    break;
//                case 5:
//                    System.out.println("Ban chon 5");
//                    break;
//                default:
//                    System.out.println("ban phai chon tu 1-5");
//            }
//        }

        //buoi 2


//        Student st = new Student();
//        st.setCode("9097");
//        st.setName("toan");
//        st.setAddress("da nang");
//        st.setBirthYear(2002);
//
//        System.out.println(st.toString());
//        Student st1 = new Student("2012","toan",2002,"Hanoi");
//        st1.setName("leoan");
//        System.out.println(st1.getName());
//        System.out.println(st1.toString());
//
//
//        Student s1 = new Student();
//        s1.input();
//        System.out.println(s1);
        Student s1 = new Student("12","toan",21,"as");



    }
}
