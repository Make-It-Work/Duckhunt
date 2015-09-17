package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class HuntingGroundView extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HuntingGroundView(){
		configure();
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
	}

}
