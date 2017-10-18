package Market;

import java.util.ArrayList;

import VisitorPattern.IVisitable;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<IVisitable> elements = new ArrayList<IVisitable>();
		
		elements.add(new ConcreteVisitable1());
		elements.add(new ConcreteVisitable2());
		elements.add(new ConcreteVisitable2());
		
		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		
		for(IVisitable v : elements)
		{
			v.accept(v1);
			v.accept(v2);
		}
	}
}
