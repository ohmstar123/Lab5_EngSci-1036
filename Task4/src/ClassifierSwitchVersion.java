import java.util.Scanner;

public class ClassifierSwitchVersion {
    public static void main(String[] args) {

        //Declare Variable
        int rank;

        //Declare Scanner
        Scanner keyboard = new Scanner(System.in);

        //Ask user for a value for the rank between 1 and 4
        System.out.println("Please enter a value for the rank between 1 and 4");
        rank = keyboard.nextInt();

        //Output a different statement depending on the rank that is given by the user
        switch (rank)
        {
            case 1:
                System.out.println("Unacceptable");
                break;
            case 2:
                System.out.println("Below Expectations");
                break;
            case 3:
                System.out.println("Meets Expectations");
                break;
            case 4:
                System.out.println("Exceeds Expectations");
                break;
            default:
                System.out.println("The value you entered does not exist in the range");
        }
    }
}
