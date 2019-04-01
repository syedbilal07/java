package pkginterface.pkg7;

// Interface can have only static final (constant) variable i.e. by default

interface A{
    int numOne = 100;
}
class B implements A{
    void display(){
        System.out.println("numOne Is " + numOne);
    }
}
public class Interface7 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
