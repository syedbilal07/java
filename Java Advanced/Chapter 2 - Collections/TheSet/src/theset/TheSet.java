package theset;
import java.util.*;

public class TheSet {
    public static void main(String[] args) {
        int[] count = {34, 22,10,60,30,22};
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 6; i++)
        {
            set.add(count[i]);
        }
        System.out.println(set);
        
        TreeSet sortedSet = new TreeSet<Integer>(set);
        System.out.println("The Sorted List Is : ");
        System.out.println(sortedSet);
        
        System.out.println("The First Element Of The Set Is : "+ (Integer)sortedSet.first());
        System.out.println("The Last Element Of The Set Is : "+ (Integer)sortedSet.last());
    } 
}