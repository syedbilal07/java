package pkginterface.pkg5;

// In interfaces, the keyword ‘abstract’ is optional to declare a method as an abstract because all the methods are abstract by default

interface A{
    void display1();
}
interface B{
    void display2();
}
interface C extends A,B{
    @Override
    void display1();
    @Override
    void display2();
}
class D implements C{
    @Override
    public void display1(){
        System.out.println("Display1 Method");
    }
    @Override
    public void display2(){
        System.out.println("Display2 Method");
    }
}
public class Interface5 {
    public static void main(String[] args) {
        D obj = new D();
        obj.display1();
        obj.display2();
    }
}
