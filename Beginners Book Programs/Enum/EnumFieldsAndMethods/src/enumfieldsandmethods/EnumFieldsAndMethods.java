package enumfieldsandmethods;

enum Directions{
    EAST ("E"),
    WEST ("W"),
    NORTH ("N"),
    SOUTH ("S");
    private final String shortCode;
    Directions(String code){
        this.shortCode = code;
    }
    public String getDirectionsCode(){
        return this.shortCode;
    }
}

public class EnumFieldsAndMethods {
    public static void main(String[] args) {
        Directions dir = Directions.EAST;
        System.out.println(dir.getDirectionsCode());
        Directions dir2 = Directions.SOUTH;
        System.out.println(dir2.getDirectionsCode());
    } 
}
