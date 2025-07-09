package demo.Chapter4;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String re ="\\d+";
        int so;
        while (true){
            try {
                System.out.println("Nhap so: ");
                String sso =sc.nextLine();
                if(sso.matches(re)){
                    so = Integer.parseInt(sso);
                    break;
                }
                throw new SoException("Nhap vao so?");
            }catch (SoException e){
                System.err.println(e);
            }
        }
        System.out.println("so: "+so);
    }
}

