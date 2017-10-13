package VisitorPattern;

public interface IVisitable 
{
	public abstract void accept(IVisitor v);
}