package View;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.GameObject;

public class DuckView extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuckView(HuntingGroundView gui, GameObject go) {
		try {
			BufferedImage img = ImageIO.read(new File("src/duck.png"));
			JLabel duck = new JLabel(new ImageIcon(img));
			duck.setBounds(go.getCoords().x, go.getCoords().y, go.getSize().width, go.getSize().height);
			gui.add(duck);
		} catch (IOException e) {
			this.setBackground(Color.black);
			e.printStackTrace();
		}
	}
}
