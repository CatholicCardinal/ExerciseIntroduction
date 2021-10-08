package fedorov;

import java.util.ArrayList;

public class basket {
	static ArrayList<ball> basket = new ArrayList<ball>();
	
	public void putBallInBasket(ball ball)
	{
		basket.add(ball);
	}
	
	public  void cleanBasket()
	{
		basket.clear();
	}
	
	public  int numberBalls()
	{
		return basket.size();
	}
	
	public void sort()
	{
		System.out.println("All balls:");
		for (int b = 0; b!=basket.size(); b++)
		{
	        System.out.println(basket.get(b).size+"|"+basket.get(b).color+"|"+ basket.get(b).size);
		}
	}
	
	public void findBlue()
	{
		int num = 0;
		System.out.println("\n");
		System.out.println("All blue balls");
		for (int b = 0; b!=basket.size(); b++)
		{
			if(basket.get(b).color==color.blue)
			{
				System.out.println(basket.get(b).size+"|"+basket.get(b).color+"|"+ basket.get(b).size);
				num++;
			}
		}
		System.out.println("Summury:"+ num);
	}
}
