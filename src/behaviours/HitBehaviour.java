package behaviours;

import Model.GameObject;
import containers.Container;

public class HitBehaviour extends Behaviour {

	private boolean isHit;
	

	public HitBehaviour(GameObject object, Container container) {
		super(object, container);
	}
	
	@Override
	public void behave(float dt) {
	}

	public boolean CheckHit(int x, int y) {
		System.out.println(object.getCoords().toString());
		System.out.println(object.getSize().toString());
		if(
				object.getCoords().x < x
				&& object.getCoords().x + object.getSize().getWidth() > x
				&&
				object.getCoords().y < y
				&& object.getCoords().y + object.getSize().getWidth() > y
				)
		{
			processHit();
			return true;
		}
		return false;
	}
	
	private void processHit(){
		isHit = true;
	}

	public boolean isHit() {
		return isHit;
	}

	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}


	@Override
	public Behaviour copy(GameObject object, Container container) {
		return new MoveBehaviour(object, container);
	}
}
