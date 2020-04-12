
import javafx.scene.shape.Rectangle;



public class Avatar extends Moveable {



	private boolean collisionY1 = false;
	private boolean collisionY2 = false;
	private boolean collisionX1 = false;
	private boolean collisionX2 = false;
	private boolean canJump = false;
	private boolean reverse = true;

public Avatar(double x, double y, double width, double height) {
		super(x, y, width, height);
	}

public boolean getCollisionX1() {
	return collisionX1;
}
public boolean getCollisionX2() {
	return collisionX2;
}
public boolean getCollisionY1() {
	return collisionY1;
}
public boolean getCollisionY2() {
	return collisionY2;
}
public boolean getReverse() {
	return reverse;
}
public boolean getCanJump() {
	return canJump;
}

public void setCollisionX1(boolean b) {
	collisionX1 = b;
}
public void setCollisionX2(boolean b) {
	collisionX2 = b;
}
public void setCollisionY1(boolean b) {
	collisionY1 = b;
}
public void setCollisionY2(boolean b) {
	collisionY2 = b;
}
public void setCanJump(boolean b) {
	canJump = b;
}
public void setReverse(boolean b) {
	reverse = b;
}


public void collisionCheck(Obstacle o) {

	// moving right
	if(getX()+getWidth() >= o.getX()-3 && getX()+getWidth() <= o.getX()+3) {
		if((getY()>= o.getY() && getY()<= o.getY()+o.getHeight()) || (getY()+getHeight()>= o.getY() && getY()+getHeight()<= o.getY()+o.getHeight())) {
			setCollisionX1(true);
		}
		else if((o.getY()>= getY() && o.getY()<= getY()+getHeight()) || (o.getY()+o.getHeight()>= getY() && o.getY()+o.getHeight()<= getY()+getHeight())) {
			setCollisionX1(true);
		}
	}
//	// moving left
	else if(getX() <= o.getX()+o.getWidth()+3 && getX() >= o.getX()+o.getWidth()-3) {
		if((getY()>= o.getY() && getY()<= o.getY()+o.getHeight()) || (getY()+getHeight()>= o.getY() && getY()+getHeight()<= o.getY()+o.getHeight())) {
			setCollisionX2(true);
		}
		else if((o.getY()>= getY() && o.getY()<= getY()+getHeight()) || (o.getY()+o.getHeight()>= getY() && o.getY()+o.getHeight()<= getY()+getHeight())) {
			setCollisionX2(true);
		}
	}
	// moving up
	if(getY() == o.getY()+o.getHeight()) {
		if((getX()>= o.getX() && getX()<= o.getX()+o.getWidth()) || (getX()+getWidth()>= o.getX() && getX()+getWidth()<= o.getX()+o.getWidth())) {
		setCollisionY2(true);
		setCollisionY1(false);
		setCanJump(true);
		}
		if((o.getX()>= getX() && o.getX()<= getX()+getWidth()) || (o.getX()+o.getWidth()>= getX() && o.getX()+o.getWidth()<= getX()+getWidth())) {
			setCollisionY2(true);
			setCollisionY1(false);
			setCanJump(true);
			}
	}
	// moving down
	else if(getY()+getHeight() == o.getY()) {
		if((getX()>= o.getX() && getX()<= o.getX()+o.getWidth()) || (getX()+getWidth()>= o.getX() && getX()+getWidth()<= o.getX()+o.getWidth())) {
		setCollisionY1(true);
		setCollisionY2(false);
		setCanJump(true);
		}
		if((o.getX()>= getX() && o.getX()<= getX()+getWidth()) || (o.getX()+o.getWidth()>= getX() && o.getX()+o.getWidth()<= getX()+getWidth())) {
			setCollisionY1(true);
			setCollisionY2(false);
			setCanJump(true);
			}
	}
}

public void unCollisionCheck(Obstacle o) {
	
	// moving right
	if(getX()+getWidth() >= o.getX()-3 && getX()+getWidth() <= o.getX()+3) {
		if((getY()>= o.getY() && getY()<= o.getY()+o.getHeight()) == false || (getY()+getHeight()>= o.getY() && getY()+getHeight()<= o.getY()+o.getHeight()) == false) {
		setCollisionX1(false);
		}
	}
//	// moving left
	else if(getX() <= o.getX()+o.getWidth()+3 && getX() >= o.getX()+o.getWidth()-3) {
		if((getY()>= o.getY() && getY()<= o.getY()+o.getHeight()) == false || (getY()+getHeight()>= o.getY() && getY()+getHeight()<= o.getY()+o.getHeight()) == false) {
		setCollisionX2(false);
		}
	}
}

	public boolean outOfBounds() {
		if(getY()<=16) {
			return true;
		}
		else if(getY()>=802) {
			return true;
		}
		else {
			return false;
		}
	}

	public void moveLeft(ObstacleList o, RunnerList e, MeteorList m, EndList end) {
		setCollisionX1(false);
		setCollisionY2(false);
		setCollisionY1(false);
		setCanJump(false);
		if(getCollisionX2() == false) {
			for(Obstacle ob: o) {
				ob.moveRight();
			}
			for(Runner en: e) {
				en.moveRight();
			}
			for(Meteor n : m) {
				n.moveRight();
			}
			for(End s: end) {
				s.moveRight();
			}
		}
	}

	public void moveRight(ObstacleList o, RunnerList e, MeteorList m, EndList end) {
		setCollisionX2(false);
		setCollisionY2(false);
		setCollisionY1(false);
		setCanJump(false);
		if(getCollisionX1() == false) {
			for(Obstacle ob: o) {
				ob.moveLeft();
			}
			for(Runner en: e) {
				en.moveLeft();
			}
			for(Meteor n : m) {
				n.moveLeft();
			}
			for(End s: end) {
				s.moveLeft();
			}
		}
	}

	public void jump() {	
		if (getCanJump() == false || getCollisionY2() == false) {
			setReverse(false);
			super.jump();
		}
	}

	public void grav() {
		if (getCanJump() == false || getCollisionY1() == false) {
			setReverse(true);
		super.grav();
	}
	}


	public boolean intersects(Rectangle r) 
	{
		return (super.intersects(r.getX() + r.getTranslateX(), r.getY() + r.getTranslateY(), r.getWidth(), r.getHeight()));
	}

}