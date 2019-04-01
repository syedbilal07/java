package inheritanceandmethodoverloading;

class Shape{
    private int length;
    private int breadth;
    Shape(){
        length = 0;
        breadth = 0;
    }
    Shape(int len, int bdth){
        length = len;
        breadth = bdth;
    }
    void showattributes(){
        System.out.println("The Length Is : " + length);
        System.out.println("The Breadth Is : " + breadth);
    }
}
class Rectangle extends Shape{
    private final String type;
    Rectangle(){
        type = null;
    }
    Rectangle(String ty, int len, int bdth){
        super(len,bdth);
        type = ty;
    }
    @Override
    void showattributes(){
        super.showattributes();
        System.out.println("Type : " + type);
      }
} 

public class InheritanceAndMethodOverloading {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("Blue", 5, 7);
        rect.showattributes();
    }
}
