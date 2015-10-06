package behaviours;

import Model.GameObject;
import containers.Container;

public abstract class Behaviour {
	
	protected GameObject object;
	protected Container container;
	
	public Behaviour(GameObject object, Container container)
	{
		this.object = object;
		this.container = container;
		container.addBehaviour(this);
	}
	public abstract void behave(float dt);
}
