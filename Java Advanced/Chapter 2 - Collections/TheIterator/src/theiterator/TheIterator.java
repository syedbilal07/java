package theiterator;
import java.util.*;

public class TheIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        
        // Use iterator to display contents of al
        System.out.println("Original Contents Of Array List : ");
        Iterator itr = al.iterator();
        
        while(itr.hasNext())
        {
            Object element = itr.next();
            System.out.println(element + " ");
        }
        // Modify objects being iterated
        ListIterator litr = al.listIterator();
        
        while(litr.hasNext())
        {
            Object element = litr.next();
            litr.set(element + " ");
        }
        System.out.print("Modified Contents Of List : ");
        itr = al.iterator();
        while(itr.hasNext())
        {
            Object element = itr.next();
            System.out.println(element + " ");
        }
         // Now, display the list backwards
         System.out.print("Modified List Backwards : ");
         System.out.println();
         while(litr.hasPrevious())
         {
             Object element = litr.previous();
             System.out.print(element + " ");
         }
         System.out.println();
    }
}