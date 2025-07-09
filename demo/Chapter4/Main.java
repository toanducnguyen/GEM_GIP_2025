package demo.Chapter4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int  x,y,z;
        x=8;
        y=0;
        //unchecked exception
        try {
            z=x/y;
            System.out.println("z" +z);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("viec tiep1");
        System.out.println("viec tiep2");
        System.out.println("viec tiep3");
        String st ="Ngay Ha Noi";
        try {
            System.out.println(st.substring(5));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
        //checked

        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        String sd = "20/12/20 02";
        String snum ="b123";
        try {
            Date d = f.parse(sd);
            System.out.println(d);
            int num = Integer.parseInt(snum);
            System.out.println(num);
        }catch (ParseException e){
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println(e);
        }finally {
            System.out.println("Thuc Hien");
        }

    }
}
