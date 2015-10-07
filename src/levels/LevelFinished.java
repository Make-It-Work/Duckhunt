package levels;

import containers.MoveContainer;

public class LevelFinished extends LevelBase {

	public LevelFinished() {
		super();
	}
	public LevelFinished(MoveContainer mc) {
		super(mc);
		this.ID = 3;
		amountOfUnits = 0;
		createObjects();
	}
	
	@Override
	public LevelBase copy(MoveContainer mc) {
		// TODO Auto-generated method stub
		return new LevelFinished(mc);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Finish!");
	}

}
