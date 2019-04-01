package superkeyword;

class ABC{
    public void myMethod(){
        System.out.println("Class ABC - myMethod");
    }
}

class Test extends ABC{
    @Override
    public void myMethod(){
        super.myMethod();
        System.out.println("Class Test - myMethod");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.myMethod();
    } 
}
