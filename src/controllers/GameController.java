package controllers;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import levels.LevelBase;
import Model.Duck;
import Model.GameObject;
import View.GameView;
import containers.InputContainer;
import containers.MoveContainer;
import factories.DuckFactory;
import factories.LevelFactory;

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
	
	private LevelBase currentLevel;
	
	public GameController()
	{
		
		try {
			currentLevel = LevelFactory.create("FirstLevel", movec);
			currentLevel.handle();
			objects = currentLevel.getObjects();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		gui = new GameView(input, objects);
		loop();
	}
	
	private void loop()
	{
		while(playing) {
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