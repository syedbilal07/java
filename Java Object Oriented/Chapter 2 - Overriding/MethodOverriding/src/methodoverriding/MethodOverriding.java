package methodoverriding;

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
      System.out.println("Dogs can walk and run");
   }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal obj1 = new Animal(); // Animal reference and object
        Animal obj2 = new Dog(); // Animal reference but Dog object
        obj1.move();
        obj2.move();
    }
}