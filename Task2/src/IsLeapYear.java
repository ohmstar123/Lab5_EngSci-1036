import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {

        //Declare Variable
        int year;

        //Declare scanner
        Scanner keyboard = new Scanner(System.in);

        //Ask user for a value for a year
        System.out.print("Enter a value for a year to check whether it is a leap year or not: ");
        year = keyboard.nextInt();

        //Check if the year value given by the user is a leap year or not a leap year
        if (year % 4 != 0)
        {
            System.out.println("NOT A LEAP YEAR");
        }
        else if (year % 4 == 0 && year % 100 != 0)
        {
            System.out.println("A LEAP YEAR");
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
        {
            System.out.println("A LEAP YEAR");
        }
        else
        {
            System.out.println("NOT A LEAP YEAR");
        }

    }
}
