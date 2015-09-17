package View;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameView extends JFrame{
	private JPanel contentPane = new HuntingGroundView();
	
	public GameView()
	{
		super("Duck Hunt");
		Configure();
		
		pack();
		this.setVisible(true);
	}
	
	private void Configure()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setResizable(false);
		this.setContentPane(contentPane);
		contentPane.revalidate();
	}
	
}
