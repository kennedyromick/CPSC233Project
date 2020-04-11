package FinalProject;
import javafx.scene.paint.Color;

public class Runner extends Moveable{
	
	int leftEnd;
	int rightEnd;
	int upEnd;
	int downEnd;
	boolean collisionY1 = false;
	boolean collisionY2 = false;
	boolean collisionX1 = false;
	boolean collisionX2 = false;
	int velX;
	int velY;
	
	public Runner(double x, double y, double width, double height, int end1, int end2, int vY) {
		super(x,y,width,height);
		upEnd = end1;
		downEnd = end2;
		velY = vY;
		this.setFill(Color.RED);
	}
	
	 public void reverseX()
	  {
		  velX *= -1;
	  }

	  public void reverseY()
	  {
		  velY *= -1;
	  }
	
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
