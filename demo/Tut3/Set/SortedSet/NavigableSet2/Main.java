package demo.Tut3.Set.SortedSet.NavigableSet2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Player tomA = new Player("Tom A", 3, 1, 4);
        Player tomB = new Player("Tom B", 2, 5, 1);
        Player jerryA = new Player("Jerry A", 1, 2, 4);
        Player jerryB = new Player("Jerry B", 3, 2, 3);
        Player donaldA = new Player("Donald A", 2, 2, 1);

        PlayerComparator comparator= new PlayerComparator();
        NavigableSet<Player> players = new TreeSet<Player>(comparator);
        players.add(tomA);
        players.add(tomB);
        players.add(jerryA);
        players.add(jerryB);
        players.add(donaldA);

        System.out.println("player in increasing list: ");

        for (Player p:players
             ) {
            System.out.println(p.getFullName()+" co thong so huy chuong la: "+p.getGoldMedal()+" / "+p.getSliverMedal()+" / "+p.getBronzeMedal() );
        }

    }
}
