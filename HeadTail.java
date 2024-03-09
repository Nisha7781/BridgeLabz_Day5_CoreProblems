import java.util.*;

class HeadTail
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of flips: ");
        int flips = sc.nextInt();

        if(flips<=0)
        {
            System.out.println("Enter a positive number.");
        }

        int heads = 0;
        int tails = 0;
 
        for (int i = 0; i < flips; i++) {
            double num = Math.random();
 
            if (num < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double headsPercentage = (double) heads / flips * 100;
        double tailsPercentage = (double) tails / flips * 100;

        System.out.println("Percentage of heads: " + headsPercentage);
        System.out.println("Percentage of tails: " + tailsPercentage);
        
    
    }
}