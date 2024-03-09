import java.util.*;

class QuotientReminder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();
        
        int quotient = dividend / divisor;
        int reminder = dividend % divisor;

        System.out.println("Quotient is: " + quotient );
        System.out.println("Reminder is: " + reminder );

    }
}