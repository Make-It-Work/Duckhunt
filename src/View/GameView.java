package View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Helpers.InputContainer;

public class GameView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private InputContainer inputContainer;
	
	public GameView(InputContainer input)
	{
		super("Duck Hunt");
		this.inputContainer = input;
		
		contentPane = new HuntingGroundView();
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

		addMouseListener(new MouseAdapter() {
			@Override
		    public void mousePressed(MouseEvent e) {
				inputContainer.addEvent(new ActionEvent(e.getSource(), e.getID(), e.paramString()));
		    }
		});
	}
	
}
