package containers;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class InputContainer extends Container {

	private Queue<Point> events = new LinkedList<Point>();
	
	public InputContainer()
	{
		
	}
	
	public void addEvent(Point p)
	{
		events.add(p);
	}
	
	public Point getEvent()
	{
		return (Point)events.poll();
	}
	
	public void print()
	{
		for(Point p : events)
			System.out.println("a");
	}
}
