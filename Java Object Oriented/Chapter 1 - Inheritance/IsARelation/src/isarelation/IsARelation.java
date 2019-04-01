package isarelation;

class Animal 
{
    
}

class Mammal extends Animal 
{
    
}

class Reptile extends Animal 
{
    
}

public class IsARelation extends Mammal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        IsARelation d = new IsARelation();
        
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}