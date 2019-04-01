package calltovoidmethod;

public class CallToVoidMethod {
    public static void RankPoints(double points)
    {
        if (points >= 202.5) 
        {
            System.out.println("Rank:A1");
        }
        else if (points >= 122.4) 
        {
            System.out.println("Rank:A2");
        }
        else 
        {
            System.out.println("Rank:A3");
        }
    }
    public static void main(String[] args) {
        RankPoints(255.57);
    }
}