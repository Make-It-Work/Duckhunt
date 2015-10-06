package levels;

public class FirstLevel extends LevelBase{
	public FirstLevel() {
		this.ID = 1;
		System.out.println("Level.....1!!!!");
	}
	
	@Override
	public LevelBase copy() {
		// TODO Auto-generated method stub
		return new FirstLevel();
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Handling level 1");
		nextLevel(this);
	}
}