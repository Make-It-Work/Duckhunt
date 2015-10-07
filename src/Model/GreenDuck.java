package Model;

import java.awt.Dimension;
import java.awt.Point;

import containers.HitContainer;
import containers.MoveContainer;

public class GreenDuck extends Duck{
	
	public GreenDuck() {
		super();
	}

	public GreenDuck(int l, int w, int vecX, int vecY, int x, int y, MoveContainer mc, HitContainer hc) {
		super(l, w, vecX, vecY, x, y, mc, hc);
		// TODO Auto-generated constructor stub
	}
	public GreenDuck(Dimension size, Point vector, Point coords, MoveContainer mc, HitContainer hc) {
		super(size, vector, coords, mc, hc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Duck copy(Dimension size, Point vector, Point coords, MoveContainer moveContainer, HitContainer hc) {
		// TODO Auto-generated method stub
		GreenDuck duck = new GreenDuck(size, vector, coords, moveContainer, hc);
		duck.color = "Green";
		duck.changeState();
		return duck;
	}
	public void kwaak() {
		// TODO Auto-generated method stub
		System.out.println("Kwaaaaaak");
	}
}
