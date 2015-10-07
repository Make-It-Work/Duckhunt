package states;

import factories.DuckFactory;


public abstract class DuckState {
	protected int ID;
	public DuckState() {
		this.ID = 0;
	}
	
	public abstract DuckState copy();
	public abstract boolean handle();
	public int getID() {
		return ID;
	}
}
