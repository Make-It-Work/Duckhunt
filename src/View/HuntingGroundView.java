package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
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

import Model.GameObject;

public class HuntingGroundView extends JLabel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<GameObject> drawables = new ArrayList<GameObject>();

	public HuntingGroundView(ArrayList<GameObject> objects, ImageIcon img){
		super(img);
		drawables = objects;
		configure();
	}
	
	private void configure(){
		this.setPreferredSize(new Dimension(891, 558));
		//this.setLayout(null);
		repaint();
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(GameObject go : drawables) {
			try {
				String fileString = "src/duck.png";
				if(go.getColor().equals("Red")) {
					fileString = "src/redduck.png";
				}
				BufferedImage img = ImageIO.read(new File(fileString));
				g.drawImage(img, go.getCoords().x, go.getCoords().y, this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//g.fillRect(go.getCoords().x, go.getCoords().y, go.getSize().width, go.getSize().height);
		}
			
	}
	
}
