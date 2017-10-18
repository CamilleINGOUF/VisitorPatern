package VisitorPattern;

import Market.ConcreteVisitable1;
import Market.ConcreteVisitable2;

public interface IVisitor 
{
	void visit(ConcreteVisitable1 c);
	void visit(ConcreteVisitable2 c);
}
