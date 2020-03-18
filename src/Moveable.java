import javafx.scene.shape.Rectangle;

public class Moveable extends Rectangle{

	private double velocityX, velocityY;

	
	public Moveable(double x, double y, double width, double height) {
		super(x,y, width, height);
		velocityX = 0;
		velocityY = 0;
	}

	public void moveUp() {
		velocityY = -2.0;
		double y = getY();
		y += velocityY;
		setY(y);
	}

	public void moveDown() {
		velocityY = 2.0;
		double y = getY();
		y += velocityY;
		setY(y);
	}

	public void moveLeft() {
		velocityX = -2.0;
		double x = getX();
		x += velocityX;
		setX(x);
	}

	public void moveRight() {
		velocityX = 2.0;
		double x = getX();
		x += velocityX;
		setX(x);
	}

	public void jump() {	
		velocityY =-1.25;
		double y = getY();
		y += velocityY;
		setY(y);
		}

	public void grav() {
		velocityY =1.25;
		double y = getY();
		y += velocityY;
		setY(y);
	}
	


}