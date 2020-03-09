package TeamProject;

import java.util.ArrayList;
import java.util.LinkedList;

import javafx.scene.shape.Rectangle;

public class Avatar extends Rectangle

{

	private double velocityX, velocityY;
	private boolean falling = true;
	private boolean jumping = false;
	boolean collisionY = false;
	boolean collisionX = false;
	private float gravity = 1.0f;
	
	public Avatar(double x, double y, double width, double height) {
		super(x, y, width, height);
		velocityX = 0;
		velocityY = 0;
	}
//	//public void tick(LinkedList<Rectangle> avatar) {
//		x += velocityX;
//		y += velocityY;
//		if (falling || jumping) {
//			velocityY += gravity;
//		//	if(velocityY > )
//			
//		}
		
	
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

	public void grav() {
		velocityY = 0.05;
		double y = getY();
		y += velocityY;
		setY(y);
	
	}
	public void moveUp() {
		if(collisionY == false) {
		velocityY = -50.0;
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

