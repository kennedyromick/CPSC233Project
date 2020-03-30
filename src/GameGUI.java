
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;



public class GameGUI extends Application{

	ObstacleList obstacleList = new ObstacleList();
//	EnemyList enemyList = new EnemyList();
	RunnerList runnerList = new RunnerList();
	
	Avatar avatar = new Avatar(10,765,25,25);
	
	
	 public static void main(String[] args)
	   {
	      Application.launch(args);
	      
	   }
	
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Astroblast!");
		
		Group root = new Group();
		Scene theScene = new Scene(root);
		primaryStage.setScene(theScene);
		

		AvatarMovement avatarHandler = new AvatarMovement(avatar, obstacleList, runnerList);
		theScene.setOnKeyPressed(avatarHandler);
		
		Canvas canvas = new Canvas(1350,800);
		root.getChildren().add(canvas);
		
		avatar.setFill(Color.BLUE);
		root.getChildren().add(avatar);
		root.getChildren().addAll(runnerList);
		root.getChildren().addAll(obstacleList);
//		root.getChildren().addAll(enemyList);
		
//     	createRunnerList();
//     	colourRunner();
     	
     	Timeline timeline = new Timeline(
     			new KeyFrame(Duration.millis(10),
     	               new EventHandler <ActionEvent>()
     				   {
     				   	@Override
     				   	public void handle(ActionEvent event)
     				   	{
     				   	for(Runner r: runnerList) {
     						r.updateLocation();
     						if(r.leftEnd != r.rightEnd) {
     							 if(r.getX()<= r.leftEnd) {
     								 r.reverseX();
     							 }
     							 else if(r.getX()>= r.rightEnd) {
     								r.reverseX();
     							 }
     						 }
     						 if(r.upEnd != r.downEnd) {
     							 if(r.getY()< r.upEnd) {
     								 r.reverseY();
     							 }
     							 if(r.getY()>= r.downEnd) {
     								 r.reverseY();
     							 }
     						 }
      						}
     						for(Obstacle o: obstacleList) 
     						{
     							avatar.collisionCheck(o);
     							if(o == obstacleList.get(41)) {
     								if(avatar.intersects(o)) {
     									System.exit(0);
     								}
     							}
     						}
     						if(avatar.reverse == false) 
     						{
     							avatar.jump();
     						}
     						else if(avatar.reverse == true) 
     						{
        						avatar.grav();
     						}
//     						for(Enemy e: enemyList)
//     						{
//     				    		if (avatar.intersects(e))
//     				    		{
//     				    			System.exit(0);
//     				    		}
//     				    	}
      						for(Runner r: runnerList) {
     							if(avatar.intersects(r)) {
     								Platform.exit();
     							}
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
