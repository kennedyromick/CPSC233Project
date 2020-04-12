import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

public class Runner extends Moveable{
	
	private int leftEnd;
	private int rightEnd;
	private int upEnd;
	private int downEnd;
	private int velX;
	private int velY;
	
	public Runner(double x, double y, double width, double height, int end1, int end2, int vY) {
		super(x,y,width,height);
		upEnd = end1;
		downEnd = end2;
		velY = vY;
		this.setFill	(			
			      new ImagePattern(
			    	        new Image("space35.png"), 0, 0, 1, 1, true
			    	      )
			    	    );
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
