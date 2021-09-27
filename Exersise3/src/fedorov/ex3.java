package fedorov;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		float a, b, h;
		Scanner in = new Scanner(System.in);
		
        System.out.println("Hello, Enter a:");
        a = in.nextFloat();
        System.out.println("Enter b:");
        b = in.nextFloat();
        System.out.println("Enter h steps:");
        h = in.nextFloat();
        in.close();
        
        execution(a, b, h);
    }
	
	public static void execution(float a,float b,float h)
	{
		double[][] date = new double[lengthArray(a, b, h)][2];
		
		double x = a;
		for(int m = 0; m < lengthArray(a, b, h); m++, x += h )
		{
			date[m][0] = x;
			date[m][1] = Math.tan(x);
		}
		
		output(a, b, h, date);
		
	}
	
	public static int lengthArray(float a, float b, float h)
	{
		return (int)(Math.abs(a-b)/h);
	}
	
	public static void output(float a, float b, float h, double[][] date)
	{
		System.out.println("| F(x) | x | ");
		for(int i = 0; i < lengthArray(a, b, h); i++)
		{
			System.out.println("| "+date[i][0]+"| "+date[i][1]+"|");
		}
	}
}
