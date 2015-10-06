package states;

public class DuckAlive extends DuckState {
	
	public DuckAlive() {
		super();
		this.ID = 1;
	}
	
	@Override
	public DuckState copy() {
		// TODO Auto-generated method stub
		return new DuckAlive();
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Alive");
	}

}
