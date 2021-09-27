package fedorov;

public class ex8 {
	public static void main(String[] args) {
		ball b1 = new ball(1, color.black, size.medium);
		ball b2 = new ball(2, color.blue, size.small);
		ball b3 = new ball(3, color.purple, size.medium);
		ball b4 = new ball(4, color.pink, size.big);
		ball b5 = new ball(5, color.blue, size.big);
		basket basket = new basket();
		
		basket.putBallInBasket(b5);
		basket.putBallInBasket(b4);
		basket.putBallInBasket(b3);
		basket.putBallInBasket(b2);
		basket.putBallInBasket(b1);
		
		basket.sort();
		basket.findBlue();
		
	}
	
	
}
