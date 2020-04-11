import javafx.event.EventHandler;

import javafx.scene.input.KeyEvent;

public class AvatarMovement implements EventHandler<KeyEvent>{

	private Avatar avatar;
	private ObstacleList obstacleList = new ObstacleList(1);
	private RunnerList runnerList = new RunnerList(1);
	private EndList endList = new EndList(1);
	private MeteorList meteorList = new MeteorList(1);

	public AvatarMovement(Avatar avatar, ObstacleList obstacleList, RunnerList runnerList, MeteorList meteorList, EndList endList) {
		this.avatar = avatar;
		this.obstacleList = obstacleList;
		this.runnerList = runnerList;
		this.meteorList = meteorList;
		this.endList = endList;
	}

	@Override
	public void handle(KeyEvent e) {
		switch(e.getCode()) {

		case RIGHT: if(avatar.getX() <= 1350) {avatar.moveRight(obstacleList, runnerList, meteorList, endList);}
			break;

		case LEFT: if(avatar.getX() >= 5) {avatar.moveLeft(obstacleList, runnerList, meteorList, endList);}
			break;

		case UP:if(avatar.getY() >= 5) {avatar.jump();}
			break;

		case DOWN:if(avatar.getY() <= 800) {avatar.grav();}
			break;

		}

	}
}

