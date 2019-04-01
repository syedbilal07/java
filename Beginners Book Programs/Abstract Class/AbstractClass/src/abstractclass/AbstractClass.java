package abstractclass;

abstract class Abstract{
    public void display1(){
        System.out.println("Concrete Method Body");
    }
    abstract public void display2();
}
class Abstraction extends Abstract{
    @Override
    public void display2(){
        System.out.println("Oveeriding Method Body");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Abstraction obj = new Abstraction();
        obj.display2();
    }
}
