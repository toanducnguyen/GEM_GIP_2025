package demo.Tut3.Set.SortedSet.NavigableSet2;

import org.jetbrains.annotations.NotNull;

//public class Player implements Comparable<Player> {
//    private String fullName;
//    private int goldMedal;
//    private int sliverMedal;
//    private int bronzeMedal;
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public int getGoldMedal() {
//        return goldMedal;
//    }
//
//    public void setGoldMedal(int goldMedal) {
//        this.goldMedal = goldMedal;
//    }
//
//    public int getSliverMedal() {
//        return sliverMedal;
//    }
//
//    public void setSliverMedal(int sliverMedal) {
//        this.sliverMedal = sliverMedal;
//    }
//
//    public int getBronzeMedal() {
//        return bronzeMedal;
//    }
//
//    public void setBronzeMedal(int bronzeMedal) {
//        this.bronzeMedal = bronzeMedal;
//    }
//
//    public Player(String fullName, int goldMedal, int sliverMedal, int bronzeMedal) {
//        this.fullName = fullName;
//        this.goldMedal = goldMedal;
//        this.sliverMedal = sliverMedal;
//        this.bronzeMedal = bronzeMedal;
//    }
//
//    @Override
//    public int compareTo(@NotNull Player o) {
//     int x = this.getGoldMedal() - getGoldMedal();
//     if(x != 0){
//         return x;
//     }
//     int y = this.getSliverMedal()-o.getSliverMedal();
//     if (y != 0){
//         return y;
//     }
//     int z = this.getBronzeMedal()-o.getBronzeMedal();
//     if(z != 0){
//         return z;
//     }
//     return this.getFullName().compareTo(o.getFullName());
//    }
//}
    public class Player {
    private String fullName;
    private int goldMedal;
    private int sliverMedal;
    private int bronzeMedal;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGoldMedal() {
        return goldMedal;
    }

    public void setGoldMedal(int goldMedal) {
        this.goldMedal = goldMedal;
    }

    public int getSliverMedal() {
        return sliverMedal;
    }

    public void setSliverMedal(int sliverMedal) {
        this.sliverMedal = sliverMedal;
    }

    public int getBronzeMedal() {
        return bronzeMedal;
    }

    public void setBronzeMedal(int bronzeMedal) {
        this.bronzeMedal = bronzeMedal;
    }

    public Player(String fullName, int goldMedal, int sliverMedal, int bronzeMedal) {
        this.fullName = fullName;
        this.goldMedal = goldMedal;
        this.sliverMedal = sliverMedal;
        this.bronzeMedal = bronzeMedal;
    }
}