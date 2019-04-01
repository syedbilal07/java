package methodlocalinnerclass;

public class MethodLocalInnerClass {
    // instance method of the outer class 
    void myMethod()
    {
        int num = 23;
        // method-local inner class
        class MethodInnerClass
        {
            public void display()
            {
                System.out.println("This Is Method OF Method Inner Class : " + num);
            }
        }
        // Accessing the inner class
        MethodInnerClass obj = new MethodInnerClass();
        obj.display();
    }
    public static void main(String[] args) {
        MethodLocalInnerClass obj = new MethodLocalInnerClass();
        obj.myMethod();
    }
}
