package levels;

public class Level2 extends LevelBase{
	public Level2() {
		this.ID = 2;
		System.out.println("Level.....2!!!!");
	}
	
	@Override
	public LevelBase copy() {
		// TODO Auto-generated method stub
		return new Level2();
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Now handling level 2");
		nextLevel(this);
	}
}
