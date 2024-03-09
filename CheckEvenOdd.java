import java.util.*;

class CheckEvenOdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0)
        {
            System.out.println("numbers is even ");
        }
        else
        {
            System.out.println("numbers is odd ");
        }

    }
}