package Market;

import VisitorPattern.IVisitor;

public class SomethingOperation implements IVisitor {

	@Override
	public void visit(MP3 m) 
	{
		System.out.println("Do something with the MP3");
	}

	@Override
	public void visit(Ball ball)
	{
		System.out.println("Do something with the ball");
	}

}
