package hybridinheritance;

interface A{
    public void methodA();
}
interface B extends A{
    public void methodB();
}
interface C extends A{
    public void methodC();
}
class D implements B,C{
    @Override
    public void methodA(){
        System.out.println("Method-A");
    }
    @Override
    public void methodB(){
        System.out.println("Method-B");
    }
    @Override
    public void methodC(){
        System.out.println("Method-C");
    }
    
}

public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }  
}
