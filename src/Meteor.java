
public class Meteor extends Moveable
{	
	
	private int leftEnd;
	private int rightEnd;
	private int upEnd;
	private int downEnd;
	private double velX;
	private double velY;
	
	public Meteor(double x, double y, double width, double height, int end1, int end2, int end3, int end4, double vX, double vY) {
		super(x,y,width,height);
		leftEnd = end1;
		rightEnd = end2;
		upEnd = end3;
		downEnd = end4;
		velX = vX;
		velY = vY;
	}
	
	public int getEndPoint()
	{
		return rightEnd;
	}
	
	public int getStartPoint()
	{
		return leftEnd;
	}
	public int getUpPoint() {
		return upEnd;
	}
	public int getDownPoint() {
		return downEnd;
	}
	
	public void setStartPoint(int i)
	{
		leftEnd = i;
	}
	
	public void setEndPoint(int i)
	{
		rightEnd = i;
	}
	public double getVelX() {
		return velX;
	}
	
	public void reset(Meteor m)
	{
		double x = m.getStartPoint();
		double y = m.getUpPoint();
		setY(y);
		setX(x);
	}
	
	public void moveRight() {
		setEndPoint(getEndPoint() + 3);
		setStartPoint(getStartPoint() +3);
	}
	
	public void moveLeft() {
		setEndPoint(getEndPoint() - 3);
		setStartPoint(getStartPoint() -3);
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