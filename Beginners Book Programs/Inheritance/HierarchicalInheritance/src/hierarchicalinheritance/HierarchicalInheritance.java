package hierarchicalinheritance;

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
class C extends A{
    public void methodC(){
        System.out.println("Method-C Of Class C");
    }
}
class D extends A{
    public void methodD(){
        System.out.println("Method-D Of Class D");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        D obj1 = new D();
        B obj2 = new B();
        C obj3 = new C();
        obj1.methodA();
        obj2.methodB();
        obj3.methodC();
        obj1.methodD();
    }
}
