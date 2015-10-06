package Controller;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import Model.Duck;
import Model.GameObject;
import Model.RedDuck;
import View.GameView;
import containers.InputContainer;
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
	
	//models
	private ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	//views
	GameView gui;
	
	
	public GameController()
	{
		try
		{
			final Duck redDuck = DuckFactory.create("RedDuck", new Dimension(50, 50), new Point(0, 2), new Point(30,100));
			objects.add(redDuck);
		}
		catch ( IllegalArgumentException exception )
		{
			System.out.println( exception.getMessage() );
		}
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
