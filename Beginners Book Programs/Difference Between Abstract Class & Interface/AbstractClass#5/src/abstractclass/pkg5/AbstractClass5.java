package abstractclass.pkg5;

// In abstract class, the keyword ‘abstract’ is mandatory to declare a method as an abstract

abstract class A{
    void display1(){
        System.out.println("Display1 Method");
    }
    void display2(){};
}
class B extends A{
    @Override
    void display2(){
        System.out.println("Display2 Method");
    }
}
public class AbstractClass5 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display1();
        obj.display2();
    }
}
