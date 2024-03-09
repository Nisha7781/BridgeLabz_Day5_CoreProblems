import java.util.Scanner;

class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Harmonic Value N: ");
        int N = sc.nextInt();

        if (N == 0) {
            System.out.println("N should be a non-zero integer.");
            return;
        }


        double harmonicValue = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonicValue = harmonicValue + 1.0 / i;
        }

        System.out.println("Nth Harmonic Value: " + harmonicValue);
    }
}
