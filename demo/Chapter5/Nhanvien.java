package demo.Chapter5;

public class Nhanvien {
    private String ma;
    private String hoten;
    private int luong;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public Nhanvien(String ma, String hoten, int luong) {
        this.ma = ma;
        this.hoten = hoten;
        this.luong = luong;
    }
    public String toString(){
        return ma+" "+hoten +" "+luong;
    };
}
