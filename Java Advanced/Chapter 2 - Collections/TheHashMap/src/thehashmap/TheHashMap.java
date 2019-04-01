package thehashmap;
import java.util.*;

public class TheHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));
        
        Set set = hm.entrySet();
        
        Iterator it = set.iterator();
        
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
        System.out.println();
        
        double balance = ((Double)hm.get("Zara")).doubleValue();
        hm.put("Zara", balance + 1000);
        System.out.println("Zara New Balance Is : " + hm.get("Zara"));
    }
}