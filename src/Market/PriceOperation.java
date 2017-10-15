package Market;

import VisitorPattern.IVisitor;

public class Cashier implements IVisitor 
{
	float totalPrice = 0;
	
	@Override
	public void visit(MP3 m) 
	{
		totalPrice += m.getPrice();
	}
}
