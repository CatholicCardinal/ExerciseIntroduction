package fedorov;

import java.util.Scanner;

public class ex4 {
	
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
		findMaxChain(matrix);
	}
	
	public static int [] random(int [] matrix)
	{
		for(int i=0; i < matrix.length; i++)
		{
			matrix[i]=(int)(Math.random()*100+1);
		}
	
		return matrix;
	}
	
	
	public static void findMaxChain(int [] matrix)
	{
		int [] num = new int[matrix.length];
		int min, longth;
		
		num=initialization(num);
		
		for(int j = 1; j < matrix.length; j++)
		{
			min = matrix[0];
			longth = 1;
			for(int i = 0; i < j; i++)
			{
				if((matrix[i]<matrix[j]) && (min<=matrix[i]))
				{
					longth++;
					min = matrix[i];
				}
			}
			num[j] = longth; 
		}
		
		output(matrix, num);
	}
	
	public static int[] initialization(int [] num)
	{
		for(int i=0; i < num.length; i++)
		{
			num[i] = 1;
		}
		return num;
	}
	
	public static void output(int [] matrix, int [] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(matrix[i]+" ");
		}
		System.out.println();
		int min=0;
		for(int i = 0; i < num.length; i++)
		{
			if(min < num[i])
			{
				min = num[i];
			}
		}
		System.out.println("Output:" + (num.length - min));
	}
}
