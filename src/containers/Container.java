package containers;

import java.util.LinkedList;
import java.util.Queue;

import behaviours.Behaviour;

public abstract class Container {

	protected LinkedList<Behaviour> behaviours = new LinkedList<Behaviour>();
	
	
	public void addBehaviour(Behaviour b)
	{
		behaviours.add(b);
	}
	
	public void removeBehaviour(Behaviour b)
	{
		behaviours.remove(b);
	}
	
	public void Run(long dt)
	{
		for(Behaviour b : behaviours)
			b.behave(dt);
	}
}
