package VisitorPattern;

import Market.Ball;
import Market.MP3;

public interface IVisitor 
{
	public abstract void visit(MP3 m);
	public abstract void visit(Ball ball);
}
