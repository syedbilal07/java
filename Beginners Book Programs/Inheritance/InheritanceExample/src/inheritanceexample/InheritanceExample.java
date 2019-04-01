package inheritanceexample;

class Vehicle{
    String color;
    int speed;
    int size;
    void attributes(){
        System.out.println("The Color Is : " + color);
        System.out.println("The Speed Is : " + speed);
        System.out.println("The Size Is : " + size);
    }
}

class Car extends Vehicle{
    int CC;
    int gear;
    void attributescar(){
        System.out.println("The Color Is : " + color);
        System.out.println("The Speed Is : " + speed);
        System.out.println("The Size Is : " + size);
        System.out.println("The CC Is : " + CC);
        System.out.println("The Gear Is : " + gear);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.color = "Black";
        mycar.speed = 200;
        mycar.size = 22;
        mycar.CC = 1000;
        mycar.gear = 4;
        mycar.attributescar();
    }  
}
