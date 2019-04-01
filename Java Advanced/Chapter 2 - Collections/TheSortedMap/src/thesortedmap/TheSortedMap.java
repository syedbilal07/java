package thesortedmap;
import java.util.*;

public class TheSortedMap {
    public static void main(String[] args) {
        SortedMap tm = new TreeMap();
        // Put elements to the map
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));
        
        // Get a set of the entries
        Set set = tm.entrySet();
        
        // Get an iterator
        Iterator it = set.iterator();
        // Display elements
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
        System.out.println();
        
        // Deposit 1000 into Zara's account
        double balance = ((Double)tm.get("Zara")).doubleValue();
        tm.put("Zara", balance + 1000);
        System.out.println("The New Balance Of Zara Is : " + tm.get("Zara"));
    }
}