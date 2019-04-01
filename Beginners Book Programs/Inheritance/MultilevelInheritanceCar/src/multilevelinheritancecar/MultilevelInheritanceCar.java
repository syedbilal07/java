package multilevelinheritancecar;

class Car{
    public Car(){
        System.out.println("Class Car");
    } 
    public void VehicleType(){
        System.out.println("Vehicle-Type : Car");
    }  
}
class Civic extends Car{
    public Civic(){
        System.out.println("Class Civic");
    }
    public void speed(){
        System.out.println("Speed : 200 KM/H");
    }
    public void type(){
        System.out.println("Type : Honda");
    }
}
class Reborn extends Civic{
    public Reborn(){
        System.out.println("Class Reborn");
    }
    public void rebornspeed(){
        System.out.println("Speed : 250 KM/H");
    }
    public void reborntype(){
        System.out.println("Type : Honda");
    }
}

public class MultilevelInheritanceCar {
    public static void main(String[] args) {
        Reborn obj = new Reborn();
        obj.VehicleType();
        obj.speed();
        obj.type();
        obj.rebornspeed();
        obj.reborntype();
    }
}
