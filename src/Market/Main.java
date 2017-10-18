package Market;

import java.util.ArrayList;

import VisitorPattern.IVisitable;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<IVisitable> caddy = new ArrayList<IVisitable>();
		caddy.add(new MP3());
		caddy.add(new Ball(3));
		
		PriceOperation priceOpe = new PriceOperation();
		SomethingOperation somethingOpe = new SomethingOperation();
		
		for(IVisitable product : caddy)
		{
			product.accept(priceOpe);
			product.accept(somethingOpe);
		}
		
		System.out.println("Total price is "+priceOpe.totalPrice+" €");
	}
}
