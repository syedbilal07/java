package objectcloning;

class DogName implements Cloneable{
    private String Name;
    public DogName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    // Overriding clone() method of Object class
    @Override
    public Object clone() throws CloneNotSupportedException{
    return(DogName) super.clone();
    }
}
public class ObjectCloning {
    public static void main(String[] args) {
        DogName obj1 = new DogName("Tom");
        try{
            obj1.setName("Tom");
            //Cloning obj1 into obj2
            DogName obj2 = (DogName) obj1.clone();
            //Displaying both the objects content
            System.out.println(obj1.getName());
            System.out.println(obj2.getName());
            //Setting up name in obj2
            obj1.setName("Jerry");
            //Displaying both the objects content
            System.out.println(obj1.getName());
            System.out.println(obj2.getName());
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
