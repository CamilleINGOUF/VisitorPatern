package Market;

import VisitorPattern.IVisitable;
import VisitorPattern.IVisitor;

public class Ball implements IVisitable 
{	
	private int ballCount;
	private int ballUnitPrice = 5;
	
	public Ball() 
	{
		ballCount = 1;
	}
	
	public Ball(int count) 
	{
		ballCount = count;
	}
	
	public int getUnitPrice()
	{
		System.out.println("[!] Ball - getUnitPrice");
		return ballUnitPrice;
	}
	
	public int getCount()
	{
		System.out.println("[!] Ball - getUnitCount");
		return ballCount;
	}
	
	@Override
	public void accept(IVisitor v) 
	{
		v.visit(this);
	}
}
