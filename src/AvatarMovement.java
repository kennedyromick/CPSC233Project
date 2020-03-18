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

		case RIGHT: if(avatar.getX() <= 1310) {avatar.moveRight();}
			break;

		case LEFT: if(avatar.getX() >= 5) {avatar.moveLeft();}
			break;
			
		case UP:if(avatar.getY() >= 5) {avatar.jump();}
			break;

		case DOWN:if(avatar.getY() <= 800) { avatar.grav();}
			break;

		}

	}
}

