package TeamProject;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.event.ActionEvent;

public class Avatar extends Rectangle

{

	private double velocityX, velocityY;
	
	public Avatar(double x, double y, double width, double height) {
		super(x, y, width, height);
		velocityX = 0;
		velocityY = 0;
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		double x = getX();
		double y = getY();
		x += velocityX;
		y += velocityY;
		setX(x);
		setY(y);
	}
	
	public void up() {
		velocityY = -1.5;
		velocityX = 0.0;
	}
	
	public void down() {
		velocityY = 1.5;
		velocityX = 0.0;
	}
	
	public void left() {
		velocityX = -1.5;
		velocityY = 0.0;
	}
	
	public void right() {
		velocityX = 1.5;
		velocityY = 0.0;
	}
	
	public void keyTyped(KeyEvent e) {
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getCode() == KeyCode.RIGHT) {
			right();
		}
		if(e.getCode() == KeyCode.LEFT) {
			left();
		}
		if(e.getCode() == KeyCode.UP) {
			up();
		}
		if(e.getCode() == KeyCode.DOWN) {
			down();
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if(e.getCode() == KeyCode.RIGHT) {
			velocityX = 0.0;
		}
		if(e.getCode() == KeyCode.LEFT) {
			velocityX = 0.0;
		}
		if(e.getCode() == KeyCode.UP) {
			velocityY = 0.0;
		}
		if(e.getCode() == KeyCode.DOWN) {
			velocityY = 0.0;
		}
	}


}


