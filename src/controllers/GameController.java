package controllers;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import Model.Duck;
import Model.GameObject;
import View.GameView;
import containers.HitContainer;
import containers.InputContainer;
import containers.MoveContainer;
import factories.DuckFactory;
import factories.LevelFactory;
import levels.LevelBase;

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
	HitContainer hitc = new HitContainer(input);
	
	//models
	private ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	//views
	GameView gui;
	
	private LevelBase startLevel;
	
	
	public GameController()
	{
		gui = new GameView(input, objects);
		try {
			startLevel = LevelFactory.create("FirstLevel");
			startLevel.handle();
			loop();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	private void loop()
	{
		createDuck();
		while(playing) {
			//Read input
			//Move objects
			hitc.Run();
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
			final Duck redDuck = DuckFactory.create("RedDuck", new Dimension(50, 50), new Point(0, 2), new Point(30,100), movec, hitc);
			objects.add(redDuck);
			final Duck greenDuck = DuckFactory.create("GreenDuck", new Dimension(50, 50), new Point(0, 2), new Point(100,30), movec, hitc);
			objects.add(greenDuck);
		}
		catch ( IllegalArgumentException exception )
		{
			exception.printStackTrace();
		}
	}
	
	
}