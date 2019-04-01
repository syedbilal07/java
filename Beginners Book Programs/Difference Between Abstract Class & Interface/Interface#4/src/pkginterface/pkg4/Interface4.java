package pkginterface.pkg4;

// A class can implement any number of interfaces at a time

interface A{
    void display1();
}
interface B{
    void display2();
}
class C implements A,B{
    @Override
    public void display1(){
        System.out.println("Display1 Method");
    }
    @Override
    public void display2(){
        System.out.println("Display2 Method");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display1();
        obj.display2();
    } 
}
