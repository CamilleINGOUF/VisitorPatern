package Market;

import java.util.ArrayList;

import VisitorPattern.IVisitable;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<IVisitable> caddy = new ArrayList<IVisitable>();
		caddy.add(new MP3());
	}
}
