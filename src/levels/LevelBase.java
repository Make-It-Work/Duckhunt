package levels;

import java.util.ArrayList;

import containers.MoveContainer;
import factories.DuckFactory;
import factories.LevelFactory;
import Model.GameObject;

public abstract class LevelBase {
	protected int ID;
	protected ArrayList<GameObject> objects;
	protected MoveContainer movec;
	protected int amountOfUnits;
	
	public LevelBase() {
		this.ID = 0;
	}
	
	public LevelBase(MoveContainer movec) {
		this.movec = movec;
	}
	
	public LevelBase nextLevel(LevelBase lvl) {
		LevelBase newLevel = LevelFactory.getNextLevel(lvl);
		return newLevel;
	}
	
	public abstract LevelBase copy(MoveContainer mc);
	public abstract void handle();
	public int getID() {
		return ID;
	}
	
	public ArrayList<GameObject> getObjects() {
		return this.objects;
	}
	
	public void createObjects() {
		objects = DuckFactory.getRandomDucks(amountOfUnits, movec);
	}
}
