package levels;

import java.awt.Dimension;
import java.awt.Point;

import containers.MoveContainer;
import Model.Duck;
import factories.DuckFactory;

public class FirstLevel extends LevelBase{
	public FirstLevel() {
		super();
	}
	
	public FirstLevel(MoveContainer movec) {
		super(movec);
		this.ID = 1;
		amountOfUnits = 10;
		createObjects();
	}
	
	@Override
	public LevelBase copy(MoveContainer mc) {
		// TODO Auto-generated method stub
		return new FirstLevel(mc);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Handling level 1");
		nextLevel(this);
	}
}