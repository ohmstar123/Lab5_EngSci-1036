import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {

        //Declaring Variable
        int number;

        //Declaring Scanner
        Scanner keyboard = new Scanner(System.in);

        //Ask user for a value between 1 and 4
        System.out.println("Please enter a rank between 1 and 4");
        number = keyboard.nextInt();

        //Output a certain statement depending on what the user entered
        if (number == 1)
        {
            System.out.println("Unacceptable");
        }
        else
        {
            if (number == 2)
            {
                System.out.println("Below Expectations");
            }
            else
            {
                if (number == 3)
                {
                    System.out.println("Meets Expectations");
                }
                else
                {
                    if (number == 4)
                    {
                        System.out.println("Exceeds Expectations");
                    }
                    else
                    {
                        System.out.println("This rank is not in the range");
                    }
                }
            }
        }
    }
}
