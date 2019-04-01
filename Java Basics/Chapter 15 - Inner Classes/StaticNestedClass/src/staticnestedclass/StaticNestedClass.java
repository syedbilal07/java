package staticnestedclass;

public class StaticNestedClass {
    static class Inner
    {
        public void myMethod()
        {
            System.out.println("This Is A Method Of Static Inner Class");
        }
    }
    public static void main(String[] args) {
        StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
        obj.myMethod();
    }
}