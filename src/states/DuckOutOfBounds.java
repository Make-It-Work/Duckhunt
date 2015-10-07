package states;

public class DuckOutOfBounds extends DuckState {

	public DuckOutOfBounds() {
		super();
		this.ID = 3;
	}
	
	@Override
	public DuckState copy() {
		// TODO Auto-generated method stub
		return new DuckOutOfBounds();
	}

	@Override
	public boolean handle() {
		// TODO Auto-generated method stub
		System.out.println("out of bounds");
		return false;
	}

}
