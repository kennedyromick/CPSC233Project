import javafx.scene.image.Image;

public class Avatar extends Moveable {

	boolean collisionY1 = false;
	boolean collisionY2 = false;
	boolean collisionX1 = false;
	boolean collisionX2 = false;
	boolean canJump = false;
	boolean reverse = true;
	private int w;
	private int h;
	private Image image;


	public Avatar(double x, double y, double width, double height) {
		super(x, y, width, height);
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

	public void moveUp() {
		collisionX2 = false;
		collisionX1 = false;
		collisionY1 = false;
		if(collisionY2 == false) {
		super.moveUp();
		}
	}

	public void moveDown() {
		collisionX2 = false;
		collisionY2 = false;
		collisionX1 = false;
		if(collisionY1 == false) {
		super.moveDown();
		}
	}

	public void moveLeft() {
		collisionX1 = false;
		collisionY2 = false;
		collisionY1 = false;
		if(collisionX2 == false) {
		super.moveLeft();
		}
	}

	public void moveRight() {
		collisionX2 = false;
		collisionY2 = false;
		collisionY1 = false;
		if(collisionX1 == false) {
		super.moveRight();
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

	
}