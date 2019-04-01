package enuminswitchcase;

enum Directions{
    EAST,
    WEST,
    NORTH,
    SOUTH,
}
class Enum{
    Directions dir;
    public Enum(Directions dir){
        this.dir = dir;
    }
    public void getMyDirection(){
        switch(dir){
            case EAST:
                System.out.println("Direction : IN EAST DIRECTION");
                break;
            case WEST:
                System.out.println("Direction : IN WEST DIRECTION");
                break;
            case NORTH:
                System.out.println("Direction : IN NORTH DIRECTION");
                break;
            case SOUTH:
                System.out.println("Direction : IN SOUTH DIRECTION");
                break;
        }
    }
    
}

public class EnumInSwitchCase {
    public static void main(String[] args) {
        Enum obj1 = new Enum(Directions.EAST);
        obj1.getMyDirection();
        Enum obj2 = new Enum(Directions.SOUTH);
        obj2.getMyDirection();
        
    } 
}
