package fedorov;
import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
        
		double x, y;
		Scanner in = new Scanner(System.in);
		
        System.out.println("Hello, Enter x:");
        x = in.nextDouble();
        System.out.println("Hello, Enter y:");
        y = in.nextDouble();
        in.close();
        
        System.out.println("Result: "+execution(x,y));
    }
	
	static double execution(double x, double y)
	{
		double sum;
		
		sum = Up(x,y) / Down(x,y) + x;
		
		
		return sum; 
	}
	
	static double Down(double x, double y)
	{
		double down;
		down = 2 + Math.abs(x -(2*x)/(1+Math.pow(x*y, 2)));
		
		return down; 
	}
	
	static double Up(double x, double y)
	{
		double up, sum= x+y;
		up = 1 + Math.pow(Math.sin(sum), 2);
		
		return up; 
	}
}


