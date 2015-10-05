package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import Model.GameObject;

import Model.GameObject;

public class HuntingGroundView extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<GameObject> drawables = new ArrayList<GameObject>();

	public HuntingGroundView(ArrayList<GameObject> objects){
		configure();
		drawables = objects;
	}
	
	private void configure(){
		this.setPreferredSize(new Dimension(500, 500));
		this.setLayout(null);
		this.setBackground(Color.black);
		
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(GameObject go : drawables)
			g.fillRect(go.getCoords().x, go.getCoords().y, go.getSize().width, go.getSize().height);
	}
	
	
}
