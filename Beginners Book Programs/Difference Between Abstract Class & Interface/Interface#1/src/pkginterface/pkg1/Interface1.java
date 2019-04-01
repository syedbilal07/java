package pkginterface.pkg1;

// Interface can extend any number of interfaces at a time 

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
public class Interface1 {
    public static void main(String[] args) {
        D obj = new D();
        obj.display1();
        obj.display2();
    }
}
