package anonymousinnerclass;

abstract class AnonymousClass
{
    public abstract void myMethod();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousClass obj = new AnonymousClass()
        {
            @Override
            public void myMethod()
            {
                System.out.println("This Is My Method");
            }
        };
        obj.myMethod();
    }
}