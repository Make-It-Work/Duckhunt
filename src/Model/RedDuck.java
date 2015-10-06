package Model;

import java.awt.Dimension;
import java.awt.Point;

import containers.MoveContainer;

public class RedDuck extends Duck{
	
	public RedDuck() {
		super();
	}

	public RedDuck(int l, int w, int vecX, int vecY, int x, int y, MoveContainer mc) {
		super(l, w, vecX, vecY, x, y, mc);
		// TODO Auto-generated constructor stub
	}
	public RedDuck(Dimension size, Point vector, Point coords, MoveContainer mc) {
		super(size, vector, coords, mc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Duck copy(Dimension size, Point vector, Point coords, MoveContainer moveContainer) {
		// TODO Auto-generated method stub
		RedDuck duck = new RedDuck(size, vector, coords, moveContainer);
		duck.color = "Red";
		return duck;
	}
	public void kwaak() {
		// TODO Auto-generated method stub
		System.out.println("Kwaaaaaak");
	}

}
