package polymorphismmethodoverriding;

class BaseClass{
    public void MethodToOverride(){
        System.out.println("I'm The Method Of Base Class");
    }
}
class DerivedClass extends BaseClass{
    @Override
    public void MethodToOverride(){
        System.out.println("I'm The Method Of Derived Class");
    }
}

public class PolymorphismMethodOverriding {
    public static void main(String[] args) {
        BaseClass obj = new BaseClass();
        DerivedClass obj1 = new DerivedClass();
        obj.MethodToOverride();
        obj1.MethodToOverride();
    }
}
