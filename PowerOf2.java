import java.util.Scanner;
 
class PowerOf2 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter value of N: ");
        int N = scanner.nextInt();
 
        if (N < 0 || N >= 31) 
        {
            System.out.println("Enter a valid value for N (0 <= N < 31).");
        }
 
        System.out.println("Powers of 2 up to 2^" + N + ":");
 
        int power = 1;

        for (int i = 0; i <= N; i++) 
        {
           // System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
           power = power * 2;
           System.out.println("2^" + i + " = " + power);
        }
    }
}
