package Market;

import VisitorPattern.IVisitable;
import VisitorPattern.IVisitor;

public class ConcreteVisitable1 implements IVisitable
{
	@Override
	public void accept(IVisitor v)
	{
		v.visit(this);
	}
}
