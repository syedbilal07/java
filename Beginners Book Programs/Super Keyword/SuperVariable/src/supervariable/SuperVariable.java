package supervariable;

class ParentClass{
    int num = 100;
}
class ChildClass extends ParentClass{
    int num = 110;
    void myMethod(){
        System.out.println("The Value Of 'num' Is " + super.num);
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.myMethod();
    }
}
