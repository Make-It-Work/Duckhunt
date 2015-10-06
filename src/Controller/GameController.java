package Controller;

import java.util.ArrayList;

import Model.Duck;
import Model.GameObject;
import View.GameView;
import behaviours.MoveBehaviour;
import containers.Container;
import containers.InputContainer;
import containers.MoveContainer;

public class GameController {
	
	public static void main(String[] args)
	{
		new GameController();
	}
	
	//variables
	boolean playing = true;
	
	//containers
	InputContainer input = new InputContainer();
	MoveContainer movec = new MoveContainer();
	
	//models
	private ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	//views
	GameView gui;
	
	
	public GameController()
	{
		Duck d = new Duck(30,30,10,10,80,80);
		MoveBehaviour mb = new MoveBehaviour((GameObject)d, (Container)movec);
		objects.add(
					d
				);
		gui = new GameView(input, objects);
		loop();
	}
	
	private void loop()
	{
		while(playing) {
			System.out.println("looping");
			//Read input
			
			//Move objects
			movec.Run();
			gui.repaint();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
	
	
}
