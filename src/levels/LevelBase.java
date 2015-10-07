package levels;

import java.util.ArrayList;

import Model.GameObject;
import containers.HitContainer;
import containers.MoveContainer;
import factories.DuckFactory;
import factories.LevelFactory;

public abstract class LevelBase {
	protected int ID;
	protected ArrayList<GameObject> objects;
	protected MoveContainer movec;
	protected HitContainer hitc;
	protected int amountOfUnits;
	
	public LevelBase() {
		this.ID = 0;
	}
	
	public LevelBase(MoveContainer movec, HitContainer hitc) {
		this.movec = movec;
		this.hitc = hitc;
	}
	
	public LevelBase nextLevel(LevelBase lvl) {
		LevelBase newLevel = LevelFactory.getNextLevel(lvl);
		return newLevel;
	}
	
	public abstract LevelBase copy(MoveContainer mc, HitContainer hitc);
	public abstract void handle();
	public int getID() {
		return ID;
	}
	
	public ArrayList<GameObject> getObjects() {
		return this.objects;
	}
	
	public void createObjects() {
		objects = DuckFactory.getRandomDucks(amountOfUnits, movec, hitc);
	}
}
