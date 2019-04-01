package pkginterface.pkg2;

// Interfaces can be extended only by interfaces. Classes has to implement them instead of extend

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
        System.out.println("Interface A Method");
    }
    @Override
    public void display2(){
        System.out.println("Interface B Method");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        D obj = new D();
        obj.display1();
        obj.display2();
    }
}
