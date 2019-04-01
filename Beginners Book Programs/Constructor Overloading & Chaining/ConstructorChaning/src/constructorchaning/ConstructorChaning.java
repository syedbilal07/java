package constructorchaning;

class Chaining{
    Chaining(){
        System.out.println("Default Constructor");
    }
    Chaining(String str){
        this();
        System.out.println("Parameterized Constructor With Single Parameter");
    }
    Chaining(String str, int num){
        this("Hello");
        System.out.println("Parameterized Constructor With Two Parameter");
    }
    Chaining(int num1, int num2, int num3){
        this("Hello",2);
        System.out.println("Parameterized Constructor With Two Parameter");
    }
}

public class ConstructorChaning {
    public static void main(String[] args) {
        Chaining obj = new Chaining(5,6,10);
    }
}
