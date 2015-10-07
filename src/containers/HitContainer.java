package containers;

import java.awt.Point;

import behaviours.Behaviour;
import behaviours.HitBehaviour;

public class HitContainer extends Container {
	
	private InputContainer input;
	
	public HitContainer(InputContainer input)
	{
		this.input = input;
	}
	
	@Override
	public void Run(long dt)
	{
		//System.out.println("checking hits");
		Point event;
		while((event = input.getEvent()) != null){
			//System.out.println("checking input");
			//System.out.println(event.toString());
			for(Behaviour b : behaviours){
				HitBehaviour hb = (HitBehaviour)b;
				if(hb.CheckHit(event.x, event.y)){
					System.out.println("hit!");
					break;
				}
			}
		}
		
	}
}
