package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Helpers.InputContainer;

public class HuntingGroundView extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HuntingGroundView(){
		configure();
	}
	
	private void configure(){
		try {
			BufferedImage img = ImageIO.read(new File("src/background.png"));
			JLabel background = new JLabel(new ImageIcon(img));
			this.add(background);
		} catch (IOException e) {
			this.setBackground(Color.black);
			e.printStackTrace();
		}
		this.setPreferredSize(new Dimension(891, 558));
		//this.setLayout(null);
		
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	
}
