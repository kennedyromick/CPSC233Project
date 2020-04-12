import javafx.event.EventHandler;

import javafx.scene.input.KeyEvent;

public class AvatarMovement implements EventHandler<KeyEvent>{

	private Avatar avatar;
	private ObstacleList obstacleList = new ObstacleList(1);
	private RunnerList runnerList = new RunnerList(1);
	private EndList endList = new EndList(1);
	private MeteorList meteorList = new MeteorList(1);

	public AvatarMovement(Avatar avatar, ObstacleList obstacleList, RunnerList runnerList, MeteorList meteorList, EndList endList) {
		//takes in every object that moves
		this.avatar = avatar;
		this.obstacleList = obstacleList;
		this.runnerList = runnerList;
		this.meteorList = meteorList;
		this.endList = endList;
	}

	@Override
	public void handle(KeyEvent e) {
		switch(e.getCode()) {

		//for the screen scrolling that avatar doesn't move left and right, every other object does
		//takes right arrow key as input
		case RIGHT: if(avatar.getX() <= 1350) {avatar.moveRight(obstacleList, runnerList, meteorList, endList);}
			break;
		//takes left arrow key as input
		case LEFT: if(avatar.getX() >= 5) {avatar.moveLeft(obstacleList, runnerList, meteorList, endList);}
			break;

		//for reverse gravity only the avatar moves up and down
		//takes up arrow key as input
		case UP:if(avatar.getY() >= 5) {avatar.revGrav();}
			break;
		//takes down arrow key as input
		case DOWN:if(avatar.getY() <= 800) {avatar.grav();}
			break;

		}

	}
}

