
public class GameController {
	
	public static void main(String[] args)
	{
		GuiController gui = new GuiController();
		
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
