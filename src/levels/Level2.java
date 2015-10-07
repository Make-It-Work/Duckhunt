package levels;

import containers.MoveContainer;

public class Level2 extends LevelBase{
	public Level2() {
		super();
	}
	
	public Level2(MoveContainer movec) {
		super(movec);
		amountOfUnits = 4;
		this.ID = 2;
		createObjects();
	}
	
	@Override
	public LevelBase copy(MoveContainer mc) {
		// TODO Auto-generated method stub
		return new Level2(mc);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Now handling level 2");
		nextLevel(this);
	}
}
