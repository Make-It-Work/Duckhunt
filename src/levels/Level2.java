package levels;

import containers.HitContainer;
import containers.MoveContainer;
import factories.DuckFactory;

public class Level2 extends LevelBase{
	public Level2() {
		super();
		this.ID = 2;
		this.amountOfUnits = 4;
	}
	
	public Level2(MoveContainer movec, HitContainer hitc) {
		super(movec, hitc);
		System.out.println("Correct");
		this.amountOfUnits = 4;
		this.ID = 2;
	}
	
	@Override
	public LevelBase copy(MoveContainer mc, HitContainer hitc) {
		// TODO Auto-generated method stub
		System.out.println("Copy");
		return new Level2(mc, hitc);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Now handling level 2");
		this.createObjects();
	}
	
	public int getAmountOfUnits() {
		return this.amountOfUnits;
	}
	
	public void createObjects() {
		System.out.println(this.amountOfUnits);
		this.objects = DuckFactory.getRandomDucks(this.amountOfUnits, movec, hitc);
	}
}
