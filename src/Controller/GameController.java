package Controller;

import View.GameView;

public class GameController {
	
	public static void main(String[] args)
	{
		GameView gui = new GameView();
		
		boolean playing = true;
		
		while(playing) {
			gui.repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				
			}
			playing = false;
		}
	}
}
