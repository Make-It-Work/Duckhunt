package Model;

import java.awt.Dimension;
import java.awt.Point;

import containers.HitContainer;
import containers.MoveContainer;
import factories.DuckFactory;

public class RedDuck extends Duck{
	
	public RedDuck() {
		super();
	}

	public RedDuck(int l, int w, int vecX, int vecY, int x, int y, MoveContainer mc, HitContainer hc) {
		super(l, w, vecX, vecY, x, y, mc, hc);
		// TODO Auto-generated constructor stub
	}
	public RedDuck(Dimension size, Point vector, Point coords, MoveContainer mc, HitContainer hc) {
		super(size, vector, coords, mc, hc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Duck copy(Dimension size, Point vector, Point coords, MoveContainer moveContainer, HitContainer hc) {
		// TODO Auto-generated method stub
		RedDuck duck = new RedDuck(size, vector, coords, moveContainer, hc);
		duck.changeState();
		duck.color = "Red";
		vector.x = vector.x*2;
		vector.y = vector.y*2;
		duck.setVector(vector);
		return duck;
	}
	
	public void kwaak() {
		// TODO Auto-generated method stub
		System.out.println("Kwaaaaaak");
	}

}
