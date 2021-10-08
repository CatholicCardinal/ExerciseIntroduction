package fedorov;

import java.util.Scanner;

public class ex8 {
	
	public static void main(String[] args) {
		int n, m;
		Scanner in = new Scanner(System.in);
		
        System.out.println("Hello, Enter n:");
        n = in.nextInt();
        
        System.out.println("Enter m:");
        m = in.nextInt();
       
        in.close();
        
        execution(n, m);
    }
	
	public static void execution(int n, int m)
	{
		int [] a = new int[n];
		int [] b = new int[m];
		
		a = random(a);
		b = random(b);
		output(a);
		output(b);
		joint(a, b);
	}
	
	public static int [] random(int [] matrix)
	{
		int c;
		for(int i=0; i < matrix.length; i++)
		{
			if(i!=0)
			{
				c = (int)(Math.random()*10*i+1);
				if(c > matrix[i-1])
				{
					matrix[i]= c;
				} 
				else {
					i--;
				}
			}
			else
			{
				c = (int)(Math.random()*10+1);
				matrix[i]= c;
			}
		}
	
		return matrix;
	}
	
	
	public static void joint(int [] a, int [] b)
	{
		int [] res = new int[a.length+b.length];
		
	
		for(int i = 0, j = 0, k = 0; i < b.length || j < a.length;)
		{
			if(j!=a.length && a[j]<=b[i])
			{
				res[k] = a[j];
				k++;
				j++;
			}
			else
			{
				if(i!=b.length)
				{
					res[k] = b[i];
					k++;
					i++;
				}
			}
		}
		output(res);
		
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