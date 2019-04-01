package thecollectionalgorithms;
import java.util.*;

public class TheCollectionAlgorithms {
    public static void main(String[] args) {
        // Create and initialize linked list
        LinkedList li = new LinkedList();
        li.add(new Integer(1));
        li.add(new Integer(2));
        li.add(new Integer(3));
        li.add(new Integer(4));
        li.add(new Integer(5));
        
        // Create a reverse order comparator
        Comparator r = Collections.reverseOrder();
        
        // Sort list by using the comparator
        Collections.sort(li, r);
        
        // Get iterator
        Iterator i = li.iterator();
        System.out.println("List Sorted In Reverse Order : ");
        
        while(i.hasNext())
        {
            System.out.println(i.next() + " ");
        }
        System.out.println();
        Collections.shuffle(li);
        // display randomized list
        i = li.iterator();
        System.out.print("List Shuffled: ");
        while(i.hasNext())
        {
            System.out.println(i.next() + " ");
        }
        System.out.println();
        System.out.println("Minimum : " + Collections.max(li));
        System.out.println("Maximum : " + Collections.min(li));
    }
}