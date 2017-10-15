package Market;

import VisitorPattern.IVisitor;

public class PriceOperation implements IVisitor 
{
	float totalPrice = 0;
	
	@Override
	public void visit(MP3 m) 
	{
		totalPrice += m.getPrice();
		System.out.println("[!] PriceOperation - visit(MP3)");
	}

	@Override
	public void visit(Ball ball) 
	{
		totalPrice += ball.getUnitPrice() * ball.getCount();
		System.out.println("[!] PriceOperation - visit(Ball)");
	}
}
