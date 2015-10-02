package Helpers;

public class SimpleVector2d {
	private int direction;
	private int speed;
	
	public SimpleVector2d(int direction, int speed) {
		super();
		this.direction = direction;
		this.speed = speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}
