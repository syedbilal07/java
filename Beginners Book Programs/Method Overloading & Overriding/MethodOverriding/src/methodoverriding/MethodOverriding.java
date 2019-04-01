package methodoverriding;

class ABC{
    public void disp(){
        System.out.println("disp() Method Of Parent Class");
    }
    public void abc(){
        System.out.println("abc() Method Of Parent Class");
    }
}

class Test extends ABC{
    @Override
    public void disp(){
        System.out.println("disp() Method Of Child Class");
    }
    public void xyz(){
        System.out.println("xyz() Method Of Child Class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        ABC obj = new Test();
        obj.disp();
        obj.abc();
    } 
}
