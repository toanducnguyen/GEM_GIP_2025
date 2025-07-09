package demo.Chapter3;

import java.util.Scanner;

public class Student {
    private String code;
    private String name;
    private int birthYear;
    private String address;

    public Student(String code, String name, int birthYear, String address) {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


//    public Student(){
//
//    }
//    public Student(String code,String name,int birthYear, String address){
//        this.code=code;
//        this.name=name;
//        this.address=address;
//        this.birthYear=birthYear;
//    }
//    public void setCode(String code) {
//        this.code = code;
//    }
//    public String getCode(){
//        return code;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setBirthYear(int birthYear){
//        this.birthYear=birthYear;
//    }
//
//    public int getBirthYear() {
//        return birthYear;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    @Override
//    public String toString(){
//        return code +" "+ name+" "+ address+" "+birthYear;
//    }
//    public void input(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("code: ");
//        code=sc.nextLine();
//        System.out.println("name: ");
//        name=sc.nextLine();
//        System.out.println("birthYear: ");
//        birthYear=sc.nextInt();
//        System.out.println("address");
//        sc.nextLine();//nuot cai enter
//        address=sc.nextLine();
//    }
}

