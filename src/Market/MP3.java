package Market;

import VisitorPattern.IVisitable;
import VisitorPattern.IVisitor;

public class MP3 implements IVisitable 
{
	private float price;
	
	public MP3()
	{
		this.price = 15.5f;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	@Override
	public void accept(IVisitor v) 
	{
		v.visit(this);
	}
}
