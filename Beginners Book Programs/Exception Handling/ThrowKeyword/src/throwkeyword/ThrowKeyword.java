package throwkeyword;

class ThrowKeyword {
    static void CheckElegibility(int age,int weight){
       if(age <= 12 && weight <=40){
           throw new ArithmeticException("You Are Not Eligible");
       }
       else{
           System.out.println("You Are Registered!");
       }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Registration Process");
        CheckElegibility(10,39);
        System.out.println("Have A Nice Day!");
    }
}
