package fedorov;

import java.util.Scanner;

public class ex6 {
	
	public static void main(String[] args) {
		int n, a1;
		Scanner in = new Scanner(System.in);
		
        System.out.println("Hello, Enter N:");
        n = in.nextInt();
        
        System.out.println("Hello, Enter a1:");
        a1 = in.nextInt();
       
        in.close();
        
        execution(n, a1);
    }
	
	public static void execution(int n, int a1)
	{
		int [] [] matrix = new int[n][n];
		
		matrix = createMatrix(matrix, a1);
	    output(matrix);
	}
	
	public static int [][] createMatrix(int [][] matrix, int a1)
	{
		
		for(int i=0; i < matrix.length; i++, a1++)
		{
				matrix[0][i] = a1;
		}
		
		a1=  matrix[0][0];
		int key = 1;
		for(int j=1; j < matrix.length; j++, key++)
		{
			for(int i=0; i < matrix.length; i++, a1++)
			{
				matrix[j][i] = a1 + key;
				if (matrix[j][i]==matrix[0][matrix.length-1])
					a1 = matrix[0][0] - key - 1;
					
			}
		}
		return matrix;
	}
	
	
	public static void output(int [] [] matrix)
	{
		System.out.println();
		for(int j = 0; j < matrix.length; j++)
		{
			for(int i = 0; i < matrix.length; i++)
			{
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
}