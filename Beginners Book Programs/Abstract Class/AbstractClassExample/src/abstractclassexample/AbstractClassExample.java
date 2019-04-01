package abstractclassexample;

abstract class Sum{
    abstract public int SumOfTwo(Integer n1, Integer n2);
    abstract public int SumOfThree(Integer n1, Integer n2, Integer n3);
    public void display(){
        System.out.println("Display Method Of Class Sum");
    }
}
class Result extends Sum{
    @Override
    public int SumOfTwo(Integer n1, Integer n2){
        return n1 + n2;
    }
    @Override
    public int SumOfThree(Integer n1, Integer n2, Integer n3){
        return n1 + n2 + n3;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Result obj = new Result();
        System.out.println(obj.SumOfTwo(2, 2));
        System.out.println(obj.SumOfThree(5, 5, 5));
        obj.display();
    }
}
