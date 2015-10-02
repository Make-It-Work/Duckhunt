package Model;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import Helpers.SimpleVector2d;


public class GameObject{
	private Dimension size;
	private Point coords;
	private SimpleVector2d vector;
	
	public GameObject(Dimension size, SimpleVector2d vector, Point coords) {
		this.size = size;
		this.coords = coords;
		this.vector = vector;
	}

	public GameObject(int l, int w, int speed, int dir, int x, int y) {
		this.size = new Dimension(l, w);
		this.vector = new SimpleVector2d(dir, speed);
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
	
}
