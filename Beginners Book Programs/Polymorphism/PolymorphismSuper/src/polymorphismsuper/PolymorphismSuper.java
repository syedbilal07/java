package polymorphismsuper;

class Vehicle{
    public void move(){
       System.out.println("Vehicles Are Used For Moving From One Place To Another"); 
    }
}
class Car extends Vehicle{
    @Override
    public void move(){
        super.move();
        System.out.println("Car Is A Good Medium Of Transport");
    }
}

public class PolymorphismSuper {
    public static void main(String[] args) {
        Vehicle Obj = new Car();
        Obj.move();
    }
}
