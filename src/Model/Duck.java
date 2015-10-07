package Model;

import java.awt.Dimension;
import java.awt.Point;

import behaviours.HitBehaviour;
import behaviours.MoveBehaviour;
import containers.Container;
import containers.HitContainer;
import containers.MoveContainer;
import states.DuckState;

public abstract class Duck extends GameObject {
	protected DuckState ds;
	public Duck() {
		super();
	}
	
	public Duck(int l, int w, int vecX, int vecY, int x, int y, MoveContainer mc, HitContainer hc) {
		super(l, w, vecX, vecY, x, y);
		MoveBehaviour mb = new MoveBehaviour((GameObject)this, (Container)mc);
		HitBehaviour hb = new HitBehaviour((GameObject)this, (Container)hc);
		// TODO Auto-generated constructor stub
	} 
	public Duck(Dimension size, Point vector, Point coords, MoveContainer mc, HitContainer hc) {
		super(size, vector, coords);
		MoveBehaviour mb = new MoveBehaviour((GameObject)this, (Container)mc);
		HitBehaviour hb = new HitBehaviour((GameObject)this, (Container)hc);
	}
	public abstract Duck copy(Dimension size, Point vector, Point coords, MoveContainer moveContainer, HitContainer hc);
	public abstract void kwaak();
}
