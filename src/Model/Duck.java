package Model;

import java.awt.Dimension;
import java.awt.Point;

import behaviours.FallBehaviour;
import behaviours.HitBehaviour;
import behaviours.MoveBehaviour;
import containers.Container;
import containers.HitContainer;
import containers.MoveContainer;
import factories.DuckFactory;
import states.DuckState;

public abstract class Duck extends GameObject {
	protected DuckState ds;
	protected Container mc;
	protected Container hc;
	protected MoveBehaviour mb;
	protected HitBehaviour hb;
	
	public Duck() {
		super();
	}
	
	public Duck(int l, int w, int vecX, int vecY, int x, int y, MoveContainer mc, HitContainer hc) {
		super(l, w, vecX, vecY, x, y);
		this.mc = mc;
		this.hc = hc;
		MoveBehaviour mb = new MoveBehaviour((GameObject)this, (Container)mc);
		HitBehaviour hb = new HitBehaviour((GameObject)this, (Container)hc);
		// TODO Auto-generated constructor stub
	} 
	public Duck(Dimension size, Point vector, Point coords, MoveContainer mc, HitContainer hc) {
		super(size, vector, coords);
		this.mc = mc;
		this.hc = hc;
		this.mb = new MoveBehaviour((GameObject)this, (Container)mc);
		this.hb = new HitBehaviour((GameObject)this, (Container)hc);
	}
	
	public void initState() {
		this.ds = DuckFactory.changeState(ds);
	}
	
	public void changeState() {
		this.ds = DuckFactory.changeState(ds);
		if(!this.ds.handle()) {
			die();
		}
	}
	
	public void die() {
		mc.removeBehaviour(mb);
		mc.addBehaviour(new FallBehaviour((GameObject)this, (Container)mc));
		hc.removeBehaviour(hb);
	}
	
	public abstract Duck copy(Dimension size, Point vector, Point coords, MoveContainer moveContainer, HitContainer hc);
	public abstract void kwaak();
}
