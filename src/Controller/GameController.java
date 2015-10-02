package Controller;

import java.awt.event.ActionEvent;

import Helpers.InputContainer;
import View.GameView;

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

	//views
	GameView gui = new GameView(input);
	
	
	public GameController()
	{
		loop();
	}
	
	private void loop()
	{
		while(playing) {
			ActionEvent ae;
			while((ae = input.getEvent()) != null)
				System.out.println(ae.getActionCommand());
			gui.repaint();
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				
			}
		}
	}
	
	
}
