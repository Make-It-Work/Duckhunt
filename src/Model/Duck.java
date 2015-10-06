package Model;

import java.awt.Dimension;
import java.awt.Point;

public abstract class Duck extends GameObject {
	public Duck() {
		super();
	}
	public Duck(int l, int w, int vecX, int vecY, int x, int y) {
		super(l, w, vecX, vecY, x, y);
		// TODO Auto-generated constructor stub
	} 
	public Duck(Dimension size, Point vector, Point coords) {
		super(size, vector, coords);
	}
	public abstract Duck copy(Dimension size, Point vector, Point coords);
	public abstract void kwaak();
}
