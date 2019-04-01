package innerclass;

class OuterClass
{
    int num;
    // inner class
    private class Inner
    {
        public void print()
        {
            System.out.println("This Is Inner Class");
        }
        // Accessing he inner class from the method within
    }
    public void displayInner()
    {
        Inner obj = new Inner();
        obj.print();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // Instantiating the outer class 
        OuterClass obj = new OuterClass();
        // Accessing the displayInner() method.
        obj.displayInner();
        
    }
}