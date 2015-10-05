package containers;

import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class InputContainer {

	private Queue<ActionEvent> events = new LinkedList<ActionEvent>();
	
	public InputContainer()
	{
		
	}
	
	public void addEvent(ActionEvent e)
	{
		System.out.println("new event");
		events.add(e);
	}
	
	public ActionEvent getEvent()
	{
		return (ActionEvent)events.poll();
	}
	
	public void print()
	{
		for(ActionEvent e : events)
			System.out.println("a");
	}
}
