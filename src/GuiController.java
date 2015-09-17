import java.awt.Color;

import javax.swing.*;


public class GuiController {
	private JFrame frame;
	private JButton button;
	private JPanel panel;
	private DuckComponent duck;
	
	public GuiController() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		duck = new DuckComponent(200, 300, 1, 0, 15);
		
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(duck);
		panel.setBackground(Color.gray);
		frame.add(panel);
		
	}
	
	public void repaint() {
		duck.move();
		System.out.println("repaint");
	}
}
