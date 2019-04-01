package multilevelinheritance;

class A{
    public void methodA(){
        System.out.println("Method-A Of Class A");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("Method-B Of Class B");
    }
}
class C extends B{
    public void methodC(){
        System.out.println("Method-C Of Class C");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    } 
}
