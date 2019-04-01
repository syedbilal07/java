package thesortedset;
import java.util.*;

public class TheSortedSet {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            Object element = it.next();
            System.out.println(element.toString());
        }
    }
}