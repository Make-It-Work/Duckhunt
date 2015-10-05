package behaviours;

import Model.GameObject;

public abstract class Behaviour {
	
	protected GameObject object;
	
	public Behaviour(GameObject object)
	{
		this.object = object;
	}
	public abstract void behave(float dt);
}
