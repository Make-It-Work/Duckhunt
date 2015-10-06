package Model;

import java.awt.Dimension;
import java.awt.Point;

public class GreenDuck extends Duck{
	
	public GreenDuck() {
		super();
	}

	public GreenDuck(int l, int w, int vecX, int vecY, int x, int y) {
		super(l, w, vecX, vecY, x, y);
		// TODO Auto-generated constructor stub
	}
	public GreenDuck(Dimension size, Point vector, Point coords) {
		super(size, vector, coords);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Duck copy(Dimension size, Point vector, Point coords) {
		// TODO Auto-generated method stub
		RedDuck duck = new RedDuck(size, vector, coords);
		duck.color = "Green";
		return duck;
	}
	public void kwaak() {
		// TODO Auto-generated method stub
		System.out.println("Kwaaaaaak");
	}

}
