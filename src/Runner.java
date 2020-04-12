import javafx.scene.paint.Color;

public class Runner extends Moveable{
	
	private int leftEnd;
	private int rightEnd;
	private int upEnd;
	private int downEnd;
	private int velX;
	private int velY;
	
	public Runner(double x, double y, double width, double height, int end1, int end2, int vY) {
		super(x,y,width,height);
		//upEnd and downEnd define the range of movement
		upEnd = end1;
		downEnd = end2;
		//speed of moveable enemy
		velY = vY;
	}
	public int getLeftEnd() {
		return leftEnd;
	}
	public int getRightEnd() {
		return rightEnd;
	}
	public int getUpEnd() {
		return upEnd;
	}
	public int getDownEnd() {
		return downEnd;
	}
	
	//reverse methods keep the enemy within range
	 public void reverseX()
	  {
		  velX *= -1;
	  }

	  public void reverseY()
	  {
		  velY *= -1;
	  }
	
	  //moves the moveable enemies
	 public void updateLocation()
	  {
		 double x = getX();
		 double y = getY();
		 x += velX;
		 y += velY;
		 setY(y);
		 setX(x);

	  }

}
