public class MagicDate {

    //class attributes are declared
    private int month;
    private int day;
    private int year;

    //Constructor of the class is declared
    public MagicDate (int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }

    //Checking the value if it is magic or not
    public boolean isMagic()
    {
        if (month * day == year){
            return(true);
        }
        else{
            return(false);
        }
    }
}
