package abstractclass.pkg2;

// Abstract class can be inherited by a class or an abstract class

class A{
    public void display1(){
        System.out.println("Display Method Of Class A");
    }
}
abstract class B{
    void display2(){};
}
class C extends B{
    @Override
    public void display2(){
        System.out.println("Display Method Of Class B In Class C");
    }
}

public class AbstractClass2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display2();
    }
}
