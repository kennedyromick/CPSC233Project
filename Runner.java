package TeamProject;

public class Runner extends Enemy
{
	public Runner(double x, double y, double width, double height, int centreX, int centreY)
	{
		super(x, y, width, height);
		setCentreX(centreX);
		setCentreY(centreY);
	}

}
