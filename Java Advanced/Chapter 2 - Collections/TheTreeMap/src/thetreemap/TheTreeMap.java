package thetreemap;
import java.util.*;

public class TheTreeMap {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));
        
        Set set = tm.entrySet();
        
        Iterator it = set.iterator();
        
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
        System.out.println();
        
        double balance = ((Double)tm.get("Zara")).doubleValue();
        tm.put("Zara", balance + 1000);
        System.out.println("Zara New Balance Is : " + tm.get("Zara"));
    }
}