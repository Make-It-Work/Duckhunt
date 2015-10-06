package View;

import java.awt.Color;
import java.awt.Graphics2D;
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
			String fileString = "src/duck.png";
			if(go.getColor().equals("Red")) {
				fileString = "src/redduck.png";
			}
			BufferedImage img = ImageIO.read(new File(fileString));
			BufferedImage resizedImage = new BufferedImage(go.getSize().width, go.getSize().height, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = resizedImage.createGraphics();
			g.drawImage(img, 0, 0, go.getSize().width, go.getSize().height, null);
			g.dispose();		
			JLabel duck = new JLabel(new ImageIcon(resizedImage));
			duck.setBounds(go.getCoords().x, go.getCoords().y, go.getSize().width, go.getSize().height);
			gui.add(duck);
		} catch (IOException e) {
			this.setBackground(Color.black);
			e.printStackTrace();
		}
	}
}
