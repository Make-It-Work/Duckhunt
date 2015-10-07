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
		
		p.x += (int)(vect.x * 0.03);
		p.y += (int)(vect.y * 0.03);
		object.setCoords(p);
	}

	
	public boolean checkBounds()
	{
		return ( object.getCoords().getY() > 600
				|| object.getCoords().getX() > 900
				|| object.getCoords().getX() < -50
				|| object.getCoords().getY() < -50
				);
	}

	@Override
	public MoveBehaviour copy(GameObject object, Container container) {
		return new MoveBehaviour(object, container);
	}
	
	
}
