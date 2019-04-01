package pkginterface.pkg3;

// Interface can only have abstract methods, they cannot have concrete methods

interface A{
    public abstract void display1();
}
class B implements A{
    @Override
    public void display1(){
        System.out.println("Display1 Method");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display1();
    }
}
