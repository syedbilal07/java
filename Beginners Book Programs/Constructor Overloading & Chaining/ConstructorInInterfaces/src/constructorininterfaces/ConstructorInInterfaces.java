package constructorininterfaces;

interface myInterface{
    public int myMethod(int num1, int num2);
}

class SumClass implements myInterface{
    @Override
    public int myMethod(int num1, int num2){
        int op = num1 + num2;
        return op;
    }
}

public class ConstructorInInterfaces{
    public static void main(String[] args) {
        SumClass obj = new SumClass();
        System.out.println(obj.myMethod(2, 7));
    }
}
