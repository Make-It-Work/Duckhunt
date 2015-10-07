package levels;

import containers.HitContainer;
import containers.MoveContainer;

public class LevelFinished extends LevelBase {

	public LevelFinished() {
		super();
		this.ID = 3;
	}
	public LevelFinished(MoveContainer mc, HitContainer hitc) {
		super(mc, hitc);
		this.ID = 3;
		amountOfUnits = 0;
		createObjects();
	}
	
	@Override
	public LevelBase copy(MoveContainer mc, HitContainer hitc) {
		// TODO Auto-generated method stub
		return new LevelFinished(mc, hitc);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Finish!");
	}

}
