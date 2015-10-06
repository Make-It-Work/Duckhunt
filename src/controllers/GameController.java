package controllers;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import Model.Duck;
import Model.GameObject;
import View.GameView;
import behaviours.MoveBehaviour;
import containers.Container;
import containers.InputContainer;
import containers.MoveContainer;
import factories.DuckFactory;

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
	
	private void createDuck() {
		try
		{
			final Duck redDuck = DuckFactory.create("RedDuck", new Dimension(50, 50), new Point(0, 2), new Point(30,100), movec);
			objects.add(redDuck);
			final Duck greenDuck = DuckFactory.create("GreenDuck", new Dimension(50, 50), new Point(0, 2), new Point(100,30), movec);
			objects.add(greenDuck);
		}
		catch ( IllegalArgumentException exception )
		{
			exception.printStackTrace();
		}
	}
	
	
}