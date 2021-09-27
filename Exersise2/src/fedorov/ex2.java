package fedorov;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		int x, y;
		Scanner in = new Scanner(System.in);
		
        System.out.println("Hello, Enter x:");
        x = in.nextInt();
        
        System.out.println("Hello, Enter y:");
        y = in.nextInt();
        
        System.out.println("Is include: " + check(x, y) );
    }
	
	public static boolean check(int x, int y)
	{
		
		if (x < 6 && x >- 6 && y < 5 && y > -3)
		{
			if ((x > -6 && x < -4 && y > 0 && y < 6) || (x < 6 && x > 4 && y > 0 && y < 6))
			{
				return false;
			}
			return true;
		}
		
		return false;
	}
}
