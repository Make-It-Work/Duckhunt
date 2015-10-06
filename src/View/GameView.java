package View;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.GameObject;
import containers.InputContainer;

public class GameView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel contentPane;
	private InputContainer inputContainer;
	
	public GameView(InputContainer input, ArrayList<GameObject> objects)
	{
		super("Duck Hunt");
		this.inputContainer = input;
		BufferedImage img;
		try {
			img = ImageIO.read(new File("src/background.png"));
			ImageIcon image = new ImageIcon(img);
			contentPane = new HuntingGroundView(objects, image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
