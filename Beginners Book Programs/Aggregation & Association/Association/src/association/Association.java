package association;

class Car{
    String carName;
    double carSpeed;
    int carID;
    Car(String name, double speed, int id){
        this.carName = name;
        this.carSpeed = speed;
        this.carID = id;  
    }
}

class Driver{
    String driverName;
    int driverAge;
    Driver(String name, int age){
        this.driverName = name;
        this.driverAge = age;
    }
}

public class Association {
    public static void main(String[] args) {
        Car obj1 = new Car("Civic", 250, 7);
        Driver obj2 = new Driver("Bilal", 23);
        System.out.println(obj2.driverName + " Is A Driver Of Car ID : " + obj1.carID);
    }
}
