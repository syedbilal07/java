package nestedinterfaceinsideanottherinterface;

interface A{
    void display();
    interface B{
        void myMethod();
    }
}
class Interface implements A.B{
    @Override
    public void myMethod(){
        System.out.println("Nested Interface Method - myMethod()");
    }
}

public class NestedInterfaceInsideAnottherInterface {
    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.myMethod();
    }
}
