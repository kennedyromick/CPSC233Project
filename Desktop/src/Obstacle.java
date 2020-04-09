

import javafx.scene.shape.Rectangle;


public class Obstacle extends Moveable {
	
	public Obstacle(double x, double y, double width, double height) {
		super(x, y, width, height);
	}
	public boolean intersects(Rectangle r) 
	{
		return (super.intersects(r.getX() + r.getTranslateX(), r.getY() + r.getTranslateY(), r.getWidth(), r.getHeight()));
	}
}
