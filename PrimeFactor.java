import java.util.Scanner;
 
class PrimeFactor {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
 
        System.out.print("Prime factors of "+ N +": ");
        
        for(int i=2; i*i <= N; i++)
        {
            while(N % i == 0)
            {
                System.out.print(i + " ");
                N = N/i;
            }
        }

        if(N > 1)
        {
            System.out.print(N);
        }

    }
}
