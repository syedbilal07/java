package abstractclass.pkg7;

// Abstract class can have static, final or static final variables with any access specifier

abstract class A{
    public static int numOne = 100;
    protected final int numTwo = 200;
    public static final int numThree = 300;
}
class B extends A{
    public void display1(){
        System.out.println("numOne Is " + numOne);
    }
    public void display2(){
        System.out.println("numTwo Is " + numTwo);
    }
    public void display3(){
        System.out.println("numThree Is " + numThree);
    }
}

public class AbstractClass7 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
