package abstractclass.pkg6;

// Abstract class can have protected , public and public abstract methodsAbstract class can have protected , public and public abstract methods

abstract class A{
    protected void display1(){};
    public void display2(){};
    public abstract void display3();
}
class B extends A{
    @Override
    public void display1(){
        System.out.println("Display1 Method");
    }
    @Override
    public void display2(){
        System.out.println("Display2 Method");
    }
    @Override
    public void display3(){
        System.out.println("Display3 Method");
    }
}
public class AbstractClass6 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
