package states;

public class DuckDead extends DuckState{

	public DuckDead() {
		super();
		this.ID = 2;
	}
	
	@Override
	public DuckState copy() {
		// TODO Auto-generated method stub
		return new DuckDead();
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("X_X");
	}
}
