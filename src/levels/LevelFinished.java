package levels;

public class LevelFinished extends LevelBase {

	public LevelFinished() {
		this.ID = 3;
		System.out.println("Finished...");
	}
	
	@Override
	public LevelBase copy() {
		// TODO Auto-generated method stub
		return new LevelFinished();
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Finish!");
	}

}
