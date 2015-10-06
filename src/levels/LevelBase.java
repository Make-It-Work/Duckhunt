package levels;

import factories.LevelFactory;

public abstract class LevelBase {
	protected int ID;
	public LevelBase() {
		this.ID = 0;
	}
	
	public LevelBase nextLevel(LevelBase lvl) {
		LevelBase newLevel = LevelFactory.getNextLevel(lvl);
		return newLevel;
	}
	
	public abstract LevelBase copy();
	public abstract void handle();
	public int getID() {
		return ID;
	}

}
