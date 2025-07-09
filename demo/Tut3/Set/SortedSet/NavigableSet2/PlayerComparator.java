package demo.Tut3.Set.SortedSet.NavigableSet2;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
     int x = o1.getGoldMedal()-o2.getGoldMedal();
        if(x != 0){
         return x;
     }
     int y = o1.getSliverMedal()-o2.getSliverMedal();
     if (y != 0){
         return y;
     }
     int z = o1.getBronzeMedal()-o2.getBronzeMedal();
     if(z != 0){
         return z;
     }
     return o1.getFullName().compareTo(o2.getFullName());
    }
}
