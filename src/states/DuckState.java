package states;

import levels.LevelBase;
import factories.LevelFactory;

public abstract class DuckState {

	protected int ID;
	public DuckState() {
		this.ID = 0;
	}
	
	public LevelBase nextLevel(LevelBase lvl) {
		LevelBase newLevel = LevelFactory.getNextLevel(lvl);
		return newLevel;
	}
	
	public abstract DuckState copy();
	public abstract void handle();
	public int getID() {
		return ID;
	}
}
