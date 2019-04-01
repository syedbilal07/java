package pkginterface.pkg6;

// Interface can have only public abstract methods i.e. by default

interface A{
    public void display1();
}
class B implements A{
    @Override
    public void display1(){
        System.out.println("Display1 Method");
    }
    public void display2(){
       System.out.println("Display2 Method"); 
    }
}

public class Interface6 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display1();
        obj.display2();
    }
}
