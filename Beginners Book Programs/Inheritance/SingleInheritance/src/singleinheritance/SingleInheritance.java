package singleinheritance;

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

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.methodA();
        obj.methodB();
    }
}
