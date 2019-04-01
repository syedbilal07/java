package staticclass;
    
public class StaticClass {
    static class X{
        static String str = "Inside Class X Of Static Example";
    }
    public static void main(String[] args) {
        X.str = "Inside Main Method";
        System.out.println("String Stored In str Is :- " + X.str);
    }
}
