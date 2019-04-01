package inheritanceprogram;

class Vehicle{
    String color;
    private int speed;
    private int size;
    public int getSize(){
        return size;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSize(int i){
        size = i;
    }
    public void setSpeed(int j){
        speed = j;
    }
}

class Car extends Vehicle{
    int CC;
    int gear;
}

public class InheritanceProgram {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.color = "Blue";
        mycar.CC = 1200;
        mycar.gear = 4;
        mycar.setSize(200);
        mycar.setSpeed(600);
        System.out.println("The Color Is : " + mycar.color);
        System.out.println("The CC Is : " + mycar.CC);
        System.out.println("The Gear Is : " + mycar.gear);
        System.out.println("The Speed Is : " + mycar.getSpeed());
        System.out.println("The Size Is : " + mycar.getSize());
    }
}
