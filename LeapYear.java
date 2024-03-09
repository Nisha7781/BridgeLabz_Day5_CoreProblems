import java.util.*;

class LeapYear
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year: ");
        int year = sc.nextInt();

        if(year < 1000 || year > 9999)
        {
            System.out.println("Enter the Year in 4 digit");
        }

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year+ " is not a leap year");
        }
    }
}