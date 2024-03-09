import java.util.*;
import java.io.PrintWriter;  

class TwoDArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);  
        writer.write("Enter no of rows: ");
        writer.flush();
		int rows = sc.nextInt();
        writer.write("Enter no of columns: ");
        writer.flush();
		int columns = sc.nextInt();


		int[][] array = new int[rows][columns];

		for (int i = 0; i < rows; i++) 
        {
			for (int j = 0; j < columns; j++) 
            {
				array[i][j] = sc.nextInt();
				
			}
		}

		System.out.println("The 2D array is: ");
		for (int i = 0; i < rows; i++) 
        {
			for (int j = 0; j < columns; j++) 
            {
                
				writer.write(array[i][j] + " ");
                writer.flush();
			}
			    System.out.println();
		}
	}
}
