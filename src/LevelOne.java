import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LevelOne {
	
	Scene theScene;
	Group root;
	Stage primaryStage;
	int counter = 0;
	
	public LevelOne(Stage stage, Group root, Scene scene) {
		theScene = scene;
		this.root = root;
		primaryStage = stage;
	}
	
	ObstacleList obstacleList = new ObstacleList(1);
	RunnerList runnerList = new RunnerList(1);
	Avatar avatar = new Avatar(300,765,25,25);
	EnemyList enemyList = new EnemyList(1);
	EndList endList = new EndList(1);
	
	
	public void start(Stage primaryStage) {

	
		AvatarMovement avatarHandler = new AvatarMovement(avatar, obstacleList, runnerList, enemyList, endList);
		theScene.setOnKeyPressed(avatarHandler);
		
		Canvas canvas = new Canvas(1350,800);
		root.getChildren().add(canvas);
		
		avatar.setFill(Color.BLUE);
		root.getChildren().add(avatar);
		root.getChildren().addAll(runnerList);
		root.getChildren().addAll(obstacleList);
		root.getChildren().addAll(endList);
		
     	Timeline timeline = new Timeline(
     			new KeyFrame(Duration.millis(10),
     	               new EventHandler <ActionEvent>()
     				   {
     				   	@Override
     				   	public void handle(ActionEvent event)
     				   	{
								if(avatar.intersects(endList.get(0))) {
 									counter = counter+1;
     								root.getChildren().remove(avatar);
 									root.getChildren().removeAll(runnerList);
 									root.getChildren().removeAll(obstacleList);
 									root.getChildren().removeAll(endList);
 								LevelTwo two = new LevelTwo(primaryStage, root, theScene);
 								if(counter == 1) {
 								two.start(primaryStage);
 								}
 								}
     						for(Obstacle o: obstacleList) 
     						{
     							avatar.unCollisionCheck(o);
     							avatar.collisionCheck(o);
     							}
     						if(avatar.reverse == false) 
     						{
     							avatar.jump();
     						}
     						else if(avatar.reverse == true) 
     						{
        						avatar.grav();
     						}
     						}
     				   }
     			)
     			);
     	timeline.setCycleCount(Timeline.INDEFINITE);
    	timeline.setAutoReverse(true);
    	timeline.play();
    	
		primaryStage.show();
	}
	

}
