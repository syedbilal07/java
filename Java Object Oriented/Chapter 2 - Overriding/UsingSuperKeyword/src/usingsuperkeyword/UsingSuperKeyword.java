package usingsuperkeyword;

class Animal 
{
   public void move() 
   {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal 
{
   @Override
   public void move() 
   {
      super.move();
      System.out.println("Dogs can walk and run");
   }
}
public class UsingSuperKeyword {
    public static void main(String[] args) {
        Animal obj1 = new Dog(); // Animal reference but Dog object
        obj1.move();
    }
}