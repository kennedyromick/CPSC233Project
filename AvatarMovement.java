package TeamProject;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class AvatarMovement implements EventHandler<KeyEvent>{
	
	private Avatar avatar;
	
	
	public AvatarMovement(Avatar avatar) {
		this.avatar = avatar;
	}


	@Override

	public void handle(KeyEvent e) {

		switch(e.getCode()) {

		case D: if(avatar.getX() <= 1310) {avatar.moveRight();}
			break;

		case A: if(avatar.getX() >= 5) {avatar.moveLeft();}
			break;
			
		case W:if(avatar.getY() >= 5) {avatar.jump();}
			break;

		case S:if(avatar.getY() <= 800) { avatar.grav();}
			break;

		}

	}




//	@Override
//	public void handle(KeyEvent e) {
//		switch(e.getCode()) {
//		case RIGHT: avatar.moveRight();
//			break;
//		case LEFT: avatar.moveLeft();
//			break;
//		case UP: avatar.moveUp();
//			break;
//		case DOWN: avatar.moveDown();
//			break;
//		}
//	}

}