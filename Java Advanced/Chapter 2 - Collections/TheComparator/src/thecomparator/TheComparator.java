package thecomparator;
import java.util.*;

class Dog implements Comparator<Dog>, Comparable<Dog>
{
    private String name;
    private int age;
    Dog(){};
    Dog(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    public String getDogName()
    {
        return name;
    }
    public int getDogAge()
    {
        return age;
    }
    // Overriding the compareTo method
    @Override
    public int compareTo(Dog d)
    {
        return (this.name).compareTo(d.name);
    }
    // Overriding the compare method to sort the age
    @Override
    public int compare(Dog d1, Dog d2)
    {
        return d1.age - d2.age;
    }
}

public class TheComparator {
    public static void main(String[] args) {
        // Takes a list o Dog objects
        List<Dog> list = new ArrayList<Dog>();
        
        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));
        
        Collections.sort(list);
        
        // printing the sorted list of names
        for(Dog a : list)
        {
            System.out.println(a.getDogName());
        }
        // Sorts the array list using comparator
        Collections.sort(list, new Dog());
        System.out.println(" ");
        // printing the sorted list of ages
        for(Dog a : list)
        {
            System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");
        }
        
    }
}