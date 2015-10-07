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
		
		p.x += (int)(vect.x * 0.1);
		p.y += (int)(vect.y * 0.1);
		object.setCoords(p);
	}

	@Override
	public MoveBehaviour copy(GameObject object, Container container) {
		return new MoveBehaviour(object, container);
	}
	
	
}
