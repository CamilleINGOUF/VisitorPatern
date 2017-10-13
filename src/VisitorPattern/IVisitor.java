package VisitorPattern;

import Market.MP3;

public interface IVisitor 
{
	public abstract void visit(MP3 m);
}
