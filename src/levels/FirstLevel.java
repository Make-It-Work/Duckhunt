package levels;

import containers.HitContainer;
import containers.MoveContainer;

public class FirstLevel extends LevelBase{
	public FirstLevel() {
		super();
	}
	
	public FirstLevel(MoveContainer movec, HitContainer hitc) {
		super(movec, hitc);
		this.ID = 1;
		amountOfUnits = 10;
		createObjects();
	}
	
	@Override
	public LevelBase copy(MoveContainer mc, HitContainer hitc) {
		// TODO Auto-generated method stub
		return new FirstLevel(mc, hitc);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Handling level 1");
		nextLevel(this);
	}
}