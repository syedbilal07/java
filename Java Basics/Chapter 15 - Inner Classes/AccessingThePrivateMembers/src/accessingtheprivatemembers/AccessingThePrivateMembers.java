package accessingtheprivatemembers;

class OuterClass
{
    // private variable of the outer class
    private int num = 175;
    
    // inner class
    public class InnerClass
    {
        public int getNum()
        {
            System.out.println("This Is Inner Class");
            return num;
        }
    }
}

public class AccessingThePrivateMembers {
    public static void main(String[] args) {
        // Instantiating the outer class
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass inner = obj.new InnerClass();
        System.out.println(inner.getNum());
    }
}