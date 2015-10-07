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
	public boolean handle() {
		// TODO Auto-generated method stub
		return false;
	}
}
