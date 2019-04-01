package abstractclass.pkg4;

// A class can extend only one abstract class at a time

abstract class A{
    public void display1(){
        System.out.println("Display1 Method Of Class A");
    }
}
class B{
    public void display2(){
        System.out.println("Display2 Method Of Class B");
    }
}
class C extends A{
    @Override
    public void display1(){
        System.out.println("Display1 Method Of Class A");
    }
}
public class AbstractClass4 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display1();
    }   
}
