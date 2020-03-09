package TeamProject;

import javafx.scene.shape.Rectangle;

public class Avatar extends Rectangle

{

	private double velocityX, velocityY;
	boolean collision = false;
	
	public Avatar(double x, double y, double width, double height) {
		super(x, y, width, height);
		velocityX = 0;
		velocityY = 0;
	}
	
	public void collisionCheck() {
		//code for collisions with obstacles should go here
	}
	
	
	public void moveUp() {
		velocityY = -5.0;
		double y = getY();
		y += velocityY;
		setY(y);
	}
	public void moveDown() {
		velocityY = 5.0;
		double y = getY();
		y += velocityY;
		setY(y);
	}
	public void moveLeft() {
		velocityX = -5.0;
		double x = getX();
		x += velocityX;
		setX(x);
	}
	public void moveRight() {
		velocityX = 5.0;
		double x = getX();
		x += velocityX;
		setX(x);
	}


}


