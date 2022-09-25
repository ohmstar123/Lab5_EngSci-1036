import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //Declare variable
        int number;

        //Declare scanner
        Scanner keyboard = new Scanner(System.in);

        //Ask user to input a number
        System.out.print("Please enter a number: ");
        number = keyboard.nextInt();

        //Check if the number the user inputed outputs a 0 as a remainder when it is divided by 2, if so, the number is Even
        if (number % 2 == 0)
        {
            System.out.println("Your number is Even");
        }
        //If the remainder is not 0, the number is Odd
        else
        {
            System.out.println("Your number is Odd");
        }

    }
}
