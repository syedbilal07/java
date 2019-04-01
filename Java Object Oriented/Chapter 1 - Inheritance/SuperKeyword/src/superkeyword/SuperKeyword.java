package superkeyword;

class BaseClass
{
    int num = 20;
    
    public void display()
    {
        System.out.println("Value Of Num In Base Class Is : " + num);
    }
}
public class SuperKeyword extends BaseClass {
    int num = 10;
    
    @Override
    public void display()
    {
        System.out.println("Value Of Num In Derived Class Is : " + num);
    }
        public void myMethod()
    {
        SuperKeyword obj = new SuperKeyword();
        obj.display();
        super.display();
    }
    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();
        obj.myMethod();
    }
}