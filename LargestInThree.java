import java.util.*;

class LargestInThree
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int Largest = num1;

        if(num2 > Largest)
        {
            Largest = num2;
        }
        if(num3 > Largest)
        {
            Largest = num3;
        }

        System.out.println("Largest number is: " + Largest );

    }
}