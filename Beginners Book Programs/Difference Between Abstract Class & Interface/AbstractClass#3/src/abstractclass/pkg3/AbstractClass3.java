package abstractclass.pkg3;

// Abstract class can have both abstract and concrete methods

abstract class A{
    public void display1(){};
    public void display2(){
        System.out.println("Display2 Method");
    }
}
class B extends A{
    @Override
    public void display1(){
    System.out.println("Display1 Method");
    }
}
public class AbstractClass3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display1();
        obj.display2();
    }
}
