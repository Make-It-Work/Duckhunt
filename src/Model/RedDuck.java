package Model;

import java.awt.Dimension;
import java.awt.Point;

public class RedDuck extends Duck{
	
	public RedDuck() {
		super();
	}

	public RedDuck(int l, int w, int vecX, int vecY, int x, int y) {
		super(l, w, vecX, vecY, x, y);
		// TODO Auto-generated constructor stub
	}
	public RedDuck(Dimension size, Point vector, Point coords) {
		super(size, vector, coords);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Duck copy(Dimension size, Point vector, Point coords) {
		// TODO Auto-generated method stub
		return new RedDuck(size, vector, coords);
	}
	public void kwaak() {
		// TODO Auto-generated method stub
		System.out.println("Kwaaaaaak");
	}

}
