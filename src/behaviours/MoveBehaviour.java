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
		System.out.println("behaving");
		Point p = (Point)object.getCoords().clone();
		Point vect = object.getVector();
		
		p.x += (vect.x * dt);
		p.y += (vect.y * dt);
		
		object.setCoords(p);
	}
	
	
}
