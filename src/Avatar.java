package FinalProject;
import javafx.scene.shape.Rectangle;



public class Avatar extends Moveable {



	boolean collisionY1 = false;
	boolean collisionY2 = false;
	boolean collisionX1 = false;
	boolean collisionX2 = false;
	boolean canJump = false;
	boolean reverse = true;

public Avatar(double x, double y, double width, double height) {
		super(x, y, width, height);
	}

public void collisionCheck(Obstacle o) {

	// moving right
	if(getX()+getWidth() == o.getX() && getX()+getWidth() <= o.getX()+o.getWidth()) {
		if((o.getY()>= getY() && o.getY()<= getY()+getHeight()) || (o.getY()+o.getHeight()>= getY() && o.getY()+o.getHeight()<= getY()+getHeight())) {
		collisionX1 = true;
		}
		else if((getY()>= o.getY() && getY()<= o.getY()+o.getHeight()) || (getY()+getHeight()>= o.getY() && getY()+getHeight()<= o.getY()+o.getHeight())) {
			collisionX1 = true;
			}
	}
	// moving left
	else if(getX() == o.getX()+o.getWidth()&& getX()+getWidth() >= o.getX()+o.getWidth()) {
		if((o.getY()>= getY() && o.getY()<= getY()+getHeight()) || (o.getY()+o.getHeight()>= getY() && o.getY()+o.getHeight()<= getY()+getHeight())) {
		collisionX2 = true;
		}
		else if((getY()>= o.getY() && getY()<= o.getY()+o.getHeight()) || (getY()+getHeight()>= o.getY() && getY()+getHeight()<= o.getY()+o.getHeight())) {
			collisionX2 = true;
			}
	}
	// moving up
	else if(getY() == o.getY()+o.getHeight()) {
		if((getX()>= o.getX() && getX()<= o.getX()+o.getWidth()) || (getX()+getWidth()>= o.getX() && getX()+getWidth()<= o.getX()+o.getWidth())) {
		collisionY2 = true;
		canJump = true;
		}
	}

// moving down
	else if(getY()+getHeight() == o.getY()) {
		if((getX()>= o.getX() && getX()<= o.getX()+o.getWidth()) || (getX()+getWidth()>= o.getX() && getX()+getWidth()<= o.getX()+o.getWidth())) {
		collisionY1 = true;
		canJump = true;
		}
	}
}


	public void moveLeft(ObstacleList o, RunnerList e) {
		collisionX1 = false;
		collisionY2 = false;
		collisionY1 = false;
		if(collisionX2 == false) {
			for(Obstacle ob: o) {
				ob.moveRight();
			}
			for(Runner en: e) {
				en.moveRight();
			}
		}
	}

	public void moveRight(ObstacleList o, RunnerList e) {
		collisionX2 = false;
		collisionY2 = false;
		collisionY1 = false;
		if(collisionX1 == false) {
			for(Obstacle ob: o) {
				ob.moveLeft();
			}
			for(Runner en: e) {
				en.moveLeft();
			}
		}
	}

	public void jump() {	
		if (canJump == false || collisionY2 == false) {
			reverse = false;
			super.jump();
		}
	}

	public void grav() {
		if (canJump == false || collisionY1 == false) {
			reverse = true;
		super.grav();
	}
	}


	public boolean intersects(Rectangle r) 
	{
		return (super.intersects(r.getX() + r.getTranslateX(), r.getY() + r.getTranslateY(), r.getWidth(), r.getHeight()));
	}

}