package TeamProject;

import javafx.scene.shape.Rectangle;

public class Avatar extends Rectangle

{

	private double velocityX, velocityY;
	boolean collisionY1 = false;
	boolean collisionY2 = false;
	boolean collisionX1 = false;
	boolean collisionX2 = false;

	
	public Avatar(double x, double y, double width, double height) {
		super(x, y, width, height);
		velocityX = 0;
		velocityY = 0;
	}

	
	public void collisionCheck(Obstacle o) {
		// moving right
		if(getX()+getWidth() == o.getX()) {
			if((getY()>= o.getY() && getY()<= o.getY()+o.getHeight()) || (getY()+getHeight()>= o.getY() && getY()+getHeight()<= o.getY()+o.getHeight())) {
			collisionX1 = true;
			}
		}
		// moving left
		else if(getX() == o.getX()+o.getWidth()) {
			if((getY()>= o.getY() && getY()<= o.getY()+o.getHeight()) || (getY()+getHeight()>= o.getY() && getY()+getHeight()<= o.getY()+o.getHeight())) {
			collisionX2 = true;
			}
		}
		// moving up
		else if(getY() == o.getY()+o.getHeight()) {
			if((getX()>= o.getX() && getX()<= o.getX()+o.getWidth()) || (getX()+getWidth()>= o.getX() && getX()+getWidth()<= o.getX()+o.getWidth())) {
			collisionY2 = true;
			}
		}
		// moving down
		else if(getY()+getHeight() == o.getY()) {
			if((getX()>= o.getX() && getX()<= o.getX()+o.getWidth()) || (getX()+getWidth()>= o.getX() && getX()+getWidth()<= o.getX()+o.getWidth())) {
			collisionY1 = true;
			}
		}
	}
	
	
	public void moveUp() {
		collisionX2 = false;
		collisionX1 = false;
		collisionY1 = false;
		if(collisionY2 == false) {
		velocityY = -5.0;
		double y = getY();
		y += velocityY;
		setY(y);
		}
	}
	public void moveDown() {
		collisionX2 = false;
		collisionY2 = false;
		collisionX1 = false;
		if(collisionY1 == false) {
		velocityY = 5.0;
		double y = getY();
		y += velocityY;
		setY(y);
		}
	}
	public void moveLeft() {
		collisionX1 = false;
		collisionY2 = false;
		collisionY1 = false;
		if(collisionX2 == false) {
		velocityX = -5.0;
		double x = getX();
		x += velocityX;
		setX(x);
		}
	}
	public void moveRight() {
		collisionX2 = false;
		collisionY2 = false;
		collisionY1 = false;
		if(collisionX1 == false) {
		velocityX = 5.0;
		double x = getX();
		x += velocityX;
		setX(x);
		}
	}


}


