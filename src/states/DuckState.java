package states;

import factories.DuckFactory;

public abstract class DuckState {
	protected int ID;
	public DuckState() {
		this.ID = 0;
	}
	
	public DuckState nextState(DuckState ds) {
		DuckState newState = DuckFactory.getNextState(ds);
		return newState;
	}
	
	public abstract DuckState copy();
	public abstract boolean handle();
	public int getID() {
		return ID;
	}
}
