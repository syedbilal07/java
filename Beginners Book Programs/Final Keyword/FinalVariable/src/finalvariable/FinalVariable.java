package finalvariable;

class Method{
    final int MAX_VALUE;
    Method(){
        MAX_VALUE = 10;
    }
    void myMethod(){
        System.out.println("The Value Of MAX_VALUE Is " + MAX_VALUE);
    }
    
}

public class FinalVariable {
    public static void main(String[] args) {
        Method obj = new Method();
        obj.myMethod();
    }
}
