package thevector;
import java.util.*;

public class TheVector {
    public static void main(String[] args) {
        // initial size is 3, increment is 2
        Vector v = new Vector(3,2);
        System.out.println("Initial Size Is : " + v.size());
        System.out.println("Initial Capacity Is : " + v.capacity());
        
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity After Four Additions : " + v.capacity());
        
        v.addElement(new Double(5.45));
        System.out.println("Capacity After Adding Double : " + v.capacity());
        
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current Capacity: " + v.capacity());
      
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current Capacity: " + v.capacity());
      
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        
        System.out.println("First Element : " + (Integer)v.firstElement());
        System.out.println("Last Element : " + (Integer)v.lastElement());
        
        if(v.contains(3))
        {
            System.out.println("Vector Contains 3");
        }
        
        // enumerate the elements in the vector.
        Enumeration en = v.elements();
        while(en.hasMoreElements())
        {
            System.out.println("Element : " + en.nextElement());
            System.out.println();
        }
    }
}