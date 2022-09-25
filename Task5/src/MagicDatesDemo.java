import java.util.Scanner;

public class MagicDatesDemo {
    public static void main(String[] args) {

        //Declaring Variables
        int m;
        int d;
        int y;

        //Declaring Scanner
        Scanner keyboard = new Scanner(System.in);

        //Asking user for values for days, months, and years
        System.out.println("Enter a value for Day");
        d = keyboard.nextInt();

        System.out.println("Enter a value for Month");
        m = keyboard.nextInt();

        System.out.println("Enter a value for Year");
        y = keyboard.nextInt();

        //An object of MagicDate class is declared
        MagicDate mm = new MagicDate(m, d, y);

        //Checking if the date is magic
        if (mm.isMagic()){
            System.out.println("The date is magic");
        }
        else{
            System.out.println("The date is not magic");
        }




    }
}
