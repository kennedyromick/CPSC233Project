import javafx.scene.shape.Rectangle;

public class Moveable extends Rectangle{

	private double velocityX, velocityY;

	
	public Moveable(double x, double y, double width, double height) {
		//creates rectangle shape
		super(x,y, width, height);
		//speed in the horizontal and vertical direction
		velocityX = 0;
		velocityY = 0;
	}

	//moves object left by velocity X
	public void moveLeft() {
		velocityX = -3.0;
		double x = getX();
		x += velocityX;
		setX(x);
	}
	//moves object right by velocity X
	public void moveRight() {
		velocityX = 3.0;
		double x = getX();
		x += velocityX;
		setX(x);
	}
	//reverse gravity
	public void revGrav() {	
		velocityY =-5.0;
		double y = getY();
		y += velocityY;
		setY(y);
		}
	//normal gravity
	public void grav() {
		velocityY =5.0;
		double y = getY();
		y += velocityY;
		setY(y);
	}
	


}