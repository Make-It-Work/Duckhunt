import java.awt.Graphics;

import javax.swing.JComponent;

public class DuckComponent extends JComponent{
	private int l;
	private int w;
	private int s;
	private int x;
	private int y;
	
	public DuckComponent(int length, int width, int speed, int x, int y) {
		l = length;
		w = width;
		s = speed;
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics g) {
		g.drawRect(x, y, l, w);
	}
	
	public void move() {
		x += 1;
		y += 2;
		try {
			Thread.sleep(100/s);
		} catch (InterruptedException e) {}
	}

	public int getL() {
		return l;
	}

	public int getW() {
		return w;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
