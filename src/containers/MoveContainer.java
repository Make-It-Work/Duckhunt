package containers;

import java.util.Iterator;

import behaviours.Behaviour;
import behaviours.MoveBehaviour;

public class MoveContainer extends Container {

	public void Run(long dt)
	{
		//System.out.println(behaviours.size());
		Iterator<Behaviour> ib = behaviours.iterator();
		while(ib.hasNext()){
			MoveBehaviour mb = (MoveBehaviour)ib.next();
			mb.behave(dt);
			if(mb.checkBounds()) ib.remove();
		}
	}
	
	public boolean isEmpty() {
		if(behaviours.iterator().hasNext()) {
			return false;
		}
		return true;
	}
}
