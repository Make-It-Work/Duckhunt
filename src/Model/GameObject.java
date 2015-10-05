package Model;
import java.awt.Dimension;
import java.awt.Point;



public abstract class GameObject{
	private Dimension size;
	private Point coords;
	private Point vector;
	
	public GameObject(Dimension size, Point vector, Point coords) {
		this.size = size;
		this.coords = coords;
		this.vector = vector;
	}

	public GameObject(int l, int w, int vecX, int vecY, int x, int y) {
		this.size = new Dimension(l, w);
		this.vector = new Point(vecX, vecY);
		this.coords = new Point(x, y);
	}
	/*
	public void move() {
		x += 1;
		y += 2;
		try {
			Thread.sleep(100/s);
		} catch (InterruptedException e) {}
	}
	*/

	public Dimension getSize() {
		return size;
	}

	public void setSize(Dimension size) {
		this.size = size;
	}

	public Point getCoords() {
		return coords;
	}

	public void setCoords(Point coords) {
		this.coords = coords;
	}

	public Point getVector() {
		return vector;
	}

	public void setVector(Point vector) {
		this.vector = vector;
	}
	
}
