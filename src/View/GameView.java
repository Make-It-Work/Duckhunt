package View;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Model.GameObject;
import containers.InputContainer;

public class GameView extends JFrame implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel contentPane;
	private InputContainer inputContainer;
	List<Image> icons = new ArrayList<Image>();
	
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

		contentPane.addMouseListener(new MouseAdapter() {
			@Override
		    public void mousePressed(MouseEvent e) {
				inputContainer.addEvent(new Point(e.getX(),e.getY()));
		    }
		});
	}

	@Override
	public void run() {
		while(true) {
			this.repaint();
		}
	}
	
}
