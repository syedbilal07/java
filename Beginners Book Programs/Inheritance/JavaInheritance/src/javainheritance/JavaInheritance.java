package javainheritance;

class Shape{
    private int length;
    private int breadth;
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int i){
        length = i;
    }  
    public void setBreadth(int j){
        breadth = j;
    }
    Shape(){
        length = 0;
        breadth = 0;
        System.out.println("Inside Default Constructor Of Shape");
    }
    Shape(int len, int bdth){
        length = len;
        breadth = bdth;
        System.out.println("Inside Parameterized Constructor Of Shape");
        System.out.println("Length :" + length);
        System.out.println("Breadth :" + breadth);
    }
}
class Rectangle extends Shape{
    private String type;
    Rectangle(){
        super();
        type = null;
        System.out.println("Inside Default Constructor Of Rectangle");
    }
    Rectangle(int len, int bdth, String type){
        super(len,bdth);
        System.out.println("Inside Parameterized Constructor Of Rectangle");
        System.out.println("Length:" + len);
        System.out.println("Breadth:" + bdth);
        System.out.println("Type:" + type);
    }
    public String getType(){
        return type;
    }
    public void setType(String string){
        type = string;
    }
}
class ColoredRectangle extends Rectangle{
    private String color;
    ColoredRectangle(){
        super();
        color = null;
        System.out.println("Inside Default Constructor Of Colored Rectangle");
    }
    ColoredRectangle(String ty,String c, int len,int bdth){
        super(ty,c,len,bdth);
        System.out.println("Inside Parameterized Constructor Of Colored Rectangle");
        System.out.println("Length:" + len);
        System.out.println("Breadth:" + bdth);
        System.out.println("Type:" + ty);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String string){
        color = string;
    }
}
public class JavaInheritance {
    public static void main(String[] args) {
        ColoredRectangle CR1 = new ColoredRectangle();
        ColoredRectangle CR2 = new ColoredRectangle("Red", "Big", 5, 2);
    } 
}
