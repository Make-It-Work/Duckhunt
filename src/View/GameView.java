package View;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.GameObject;
import containers.InputContainer;

public class GameView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private InputContainer inputContainer;
	
	public GameView(InputContainer input, ArrayList<GameObject> objects)
	{
		super("Duck Hunt");
		this.inputContainer = input;
		
		contentPane = new HuntingGroundView(objects);
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
