package Model;

import java.awt.Dimension;
import java.awt.Point;

import behaviours.MoveBehaviour;
import containers.Container;
import containers.MoveContainer;

public abstract class Duck extends GameObject {
	public Duck() {
		super();
	}
	
	public Duck(int l, int w, int vecX, int vecY, int x, int y, MoveContainer mc) {
		super(l, w, vecX, vecY, x, y);
		MoveBehaviour mb = new MoveBehaviour((GameObject)this, (Container)mc);
		// TODO Auto-generated constructor stub
	} 
	public Duck(Dimension size, Point vector, Point coords, MoveContainer mc) {
		super(size, vector, coords);
		MoveBehaviour mb = new MoveBehaviour((GameObject)this, (Container)mc);
	}
	public abstract Duck copy(Dimension size, Point vector, Point coords, MoveContainer moveContainer);
	public abstract void kwaak();
}
