package staticmodifier;

public class StaticModifier {
    private static int numInstance = 0;
    protected static int getCount()
    {
        return numInstance;
    }
    private static void addInstance()
    {
        numInstance++;
    }
    StaticModifier()
    {
        addInstance();
    }
    public static void main(String[] args) {
        System.out.println("Starting With " + StaticModifier.numInstance + " Instances");
        for(int i = 0; i < 500; i++)
        {
            new StaticModifier();
        }
        System.out.println("Created : " + StaticModifier.getCount() + " Instances");
    }
}
