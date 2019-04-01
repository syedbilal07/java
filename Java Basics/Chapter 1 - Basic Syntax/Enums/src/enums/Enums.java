package enums;

class FreshJuice{
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE};
    FreshJuiceSize size;
}

public class Enums {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("The Size Of Juice Is " + juice.size);
    }
}
