package FinalProject;

import javafx.scene.shape.Rectangle;


public class End extends Moveable {

	public End(double x, double y, double width, double height) {
		super(x, y, width, height);
	}
	
	public boolean intersects(Rectangle r) 
	{
		return (super.intersects(r.getX() + r.getTranslateX(), r.getY() + r.getTranslateY(), r.getWidth(), r.getHeight()));
	}
}