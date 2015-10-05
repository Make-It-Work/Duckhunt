package behaviours;

import java.awt.Point;

import Model.GameObject;

public class MoveBehaviour extends Behaviour {

	public MoveBehaviour(GameObject object) {
		super(object);
	}

	@Override
	public void behave(float dt) {
		
		Point p = object.getCoords();
		Point vect = object.getVector();
		
		p.x += (vect.x * dt);
		p.y += (vect.y * dt);
	}

}
