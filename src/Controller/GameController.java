package Controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import Model.Duck;
import Model.GameObject;
import View.GameView;
import containers.InputContainer;

public class GameController {
	
	public static void main(String[] args)
	{
		new GameController();
	}
	
	//variables
	boolean playing = true;
	
	//containers
	InputContainer input = new InputContainer();
	
	//models
	private ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	//views
	GameView gui;
	
	
	public GameController()
	{
		objects.add(
				new Duck(50,50,10,10,80,80)
				);
		gui = new GameView(input, objects);
		loop();
	}
	
	private void loop()
	{
		while(playing) {
			//Read input
			
			//Move objects
			gui.repaint();
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				
			}
		}
	}
	
	
}
