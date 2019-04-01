package theproperties;
import java.util.*;

public class TheProperties {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set status;
        String str;
        
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Pakistan", "Islamabad");
        
        // Show all states and capitals in hashtable.
        status = capitals.keySet(); // get set-view of keys
        Iterator itr = status.iterator();
        
        while(itr.hasNext())
        {
            str = (String) itr.next();
            System.out.println("The Capital Of " + str + " Is " + capitals.getProperty(str) + ".");
        }
        System.out.println();
        
        // look for state not in list -- specify default
        str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The Capital Of Florida Is " + str + ".");
    }
}