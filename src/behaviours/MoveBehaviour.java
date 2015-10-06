package behaviours;

import java.awt.Point;

import Model.GameObject;
import containers.Container;

public class MoveBehaviour extends Behaviour {

	public MoveBehaviour(GameObject object, Container container) {
		super(object, container);
	}

	@Override
	public void behave(float dt) {
		Point p = (Point)object.getCoords().clone();
		Point vect = object.getVector();
		
		p.x += (vect.x * dt);
		p.y += (vect.y * dt);
		
		object.setCoords(p);
	}

	@Override
	public MoveBehaviour copy(GameObject object, Container container) {
		return new MoveBehaviour(object, container);
	}
	
	
}
