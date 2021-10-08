package fedorov;

import java.util.Scanner;

public class ex7 {
	
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		
        System.out.println("Hello, Enter N:");
        n = in.nextInt();
       
        in.close();
        
        execution(n);
    }
	
	public static void execution(int n)
	{
		int [] matrix = new int[n];
		
		matrix = random(matrix);
		output(matrix);
		sortingShell(matrix);
	}
	
	public static int [] random(int [] matrix)
	{
		for(int i=0; i < matrix.length; i++)
		{
			matrix[i]=(int)(Math.random()*100+1);
		}
	
		return matrix;
	}
	
	
	public static void sortingShell(int [] matrix)
	{
		
		for(int j = 0; j < matrix.length; j++)
		{
			if(j!=(matrix.length-1) && matrix[j]>matrix[j+1])
			{
				int temp = matrix[j];
				matrix[j] = matrix[j+1];
				matrix[j+1] = temp;
				if(j != 0)
					j -= 2;
			}
		}
		
		output(matrix);
	}
	
	
	public static void output(int [] matrix)
	{
		for(int i = 0; i < matrix.length; i++)
		{
			System.out.print(matrix[i]+" ");
		}
		System.out.println();
		
	}
}