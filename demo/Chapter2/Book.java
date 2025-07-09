package demo.Chapter2;

public class Book {
    private int ma;
    private String name;
    public Book(int ma,String name){
        this.ma=ma;
        this.name=name;
    }
    public String toString(){
        return ma+"\t"+name;
    }
}
