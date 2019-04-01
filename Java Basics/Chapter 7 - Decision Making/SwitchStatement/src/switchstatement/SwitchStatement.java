package switchstatement;

public class SwitchStatement {
    public static void main(String[] args) {
         // char grade = args[0].charAt(0);
        char grade = 'C';

        switch(grade) 
        {
            case 'A' :
                System.out.println("Excellent! \n"); 
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done \n");
                break;
            case 'D' :
                System.out.println("You passed \n");
            case 'F' :
                System.out.println("Better try again\n");
                break;
            default :
                System.out.println("Invalid grade \n");
        }
                System.out.println("Your grade is : " + grade); 
    } 
}