package compiletimepolymorhism;

class Overload{
    public void method(int a){
        System.out.println(a);
    }
    public void method(int a, int b){
        System.out.println(a + " " + b);
    }
    public void method(char c){
        System.out.println(c);
    }
}

public class CompiletimePolymorhism {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.method(10);
        obj.method(10, 20);
        obj.method('B');
    }  
}
