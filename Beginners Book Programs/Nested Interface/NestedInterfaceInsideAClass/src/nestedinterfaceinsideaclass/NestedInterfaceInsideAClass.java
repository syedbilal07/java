package nestedinterfaceinsideaclass;

class myClass{
    interface A{
        void display();
    }
}
class OverridingClass implements myClass.A{
    @Override
    public void display(){
        System.out.println("Nested Interface Of myClass");
    }
}

public class NestedInterfaceInsideAClass {
    public static void main(String[] args) {
        OverridingClass obj = new OverridingClass();
        obj.display();
    }
}
