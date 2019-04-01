package bankdemo;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        check.deposit(500);
        try 
        {
            System.out.println("\nWithdrawing $100...");
            check.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            check.withdraw(600.00);
        }
        catch(InsufficientFundsException e) 
        {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}