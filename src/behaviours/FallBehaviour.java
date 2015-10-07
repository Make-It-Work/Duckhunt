package behaviours;

import java.awt.Point;

import Model.GameObject;
import containers.Container;

public class FallBehaviour extends MoveBehaviour {

	public FallBehaviour(GameObject object, Container container) {
		super(object, container);
	}
	
	@Override
	public void behave(float dt) {
		Point p = (Point)object.getCoords().clone();
			p.y += 1;
			object.setCoords(p);
	}

	@Override
	public MoveBehaviour copy(GameObject object, Container container) {
		return new MoveBehaviour(object, container);
	}

}
