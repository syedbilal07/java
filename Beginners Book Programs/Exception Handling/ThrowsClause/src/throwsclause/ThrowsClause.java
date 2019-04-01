package throwsclause;

class ThrowsClause {
    static void throwMethod() throws NullPointerException{
        System.out.println("Inside Throws Method");
        throw new NullPointerException("ThrowsClause");
}
    public static void main(String[] args) {
        try{
            throwMethod();
        }
        catch(NullPointerException e){
            System.out.println("The Exception Has Been Caught " + e);
        }
    }
}
