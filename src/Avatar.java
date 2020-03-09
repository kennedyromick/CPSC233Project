package TeamProject;

import javafx.scene.shape.Rectangle;

public class Avatar extends Rectangle

{

	private double velocityX, velocityY;
	boolean collisionY = false;
	boolean collisionX = false;
	
	public Avatar(double x, double y, double width, double height) {
		super(x, y, width, height);
		velocityX = 0;
		velocityY = 0;
	}
	
	public void collisionCheck(Obstacle o) {
		if(getX()+getWidth() == o.getX() - 10 || getX() == o.getX() - o.getWidth()+ 10) {
			System.out.println(getX());
			System.out.println(o.getX());
			collisionX = true;
		}
		if(getY() == o.getY() - 5 || getY() == o.getY()-o.getHeight()+5) {
			collisionY = true;
		}
	}
	
	
	public void moveUp() {
		if(collisionY == false) {
		velocityY = -5.0;
		double y = getY();
		y += velocityY;
		setY(y);
		}
	}
	public void moveDown() {
		if(collisionY == false) {
		velocityY = 5.0;
		double y = getY();
		y += velocityY;
		setY(y);
		}
	}
	public void moveLeft() {
		if(collisionX == false) {
		velocityX = -5.0;
		double x = getX();
		x += velocityX;
		setX(x);
		}
	}
	public void moveRight() {
		if(collisionX == false) {
		velocityX = 5.0;
		double x = getX();
		x += velocityX;
		setX(x);
		}
	}


}


