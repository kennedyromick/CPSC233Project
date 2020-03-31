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

	ObstacleList obstacleList = new ObstacleList(1);
	RunnerList runnerList = new RunnerList(1);
	ObstacleList obstacleList2 = new ObstacleList(2);
	RunnerList runnerList2 = new RunnerList(2);
	
	Avatar avatar = new Avatar(10,765,25,25);
	Avatar avatar2 = new Avatar(50,765,25,25);
	
	
	
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
		
     	
     	Timeline timeline = new Timeline(
     			new KeyFrame(Duration.millis(10),
     	               new EventHandler <ActionEvent>()
     				   {
     				   	@Override
     				   	public void handle(ActionEvent event)
     				   	{
     						for(Obstacle o: obstacleList) 
     						{
     							avatar.collisionCheck(o);
     							if(o == obstacleList.get(41)) {
     								if(avatar.intersects(o)) {
     									root.getChildren().remove(avatar);
     									root.getChildren().removeAll(runnerList);
     									root.getChildren().removeAll(obstacleList);
     									root.getChildren().addAll(runnerList2);
     									root.getChildren().addAll(obstacleList2);
     									root.getChildren().add(avatar2);
     									avatar2.setFill(Color.BLUE);
     									AvatarMovement avatarHandler2 = new AvatarMovement(avatar2, obstacleList2, runnerList2);
     									theScene.setOnKeyPressed(avatarHandler2);
     									Timeline timeline2 = new Timeline(
     							     			new KeyFrame(Duration.millis(10),
     							     	               new EventHandler <ActionEvent>()
     							     				   {
     							     				   	@Override
     							     				   	public void handle(ActionEvent event)
     							     				   	{
     							     				   	for(Obstacle p: obstacleList2) {
     						     							avatar2.collisionCheck(p);
     						     						}
     						     						if(avatar2.reverse == false) 
     						     						{
     						     							avatar2.jump();
     						     						}
     						     						else if(avatar2.reverse == true) 
     						     						{
     						        						avatar2.grav();
     						     						}
     						      						for(Runner r: runnerList) {
     						     							if(avatar.intersects(r)) {
     						     								Platform.exit();
     						     							}
     						     							}
     						      						for(Runner r: runnerList2) {
     						     							if(avatar2.intersects(r)) {
     						     								Platform.exit();
     						     							}
     						     							}
     						        				   	for(Runner r: runnerList2) {
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
     							     						}
     							     				   }
     							     			)
     							     			);
     							     	timeline2.setCycleCount(Timeline.INDEFINITE);
     							    	timeline2.setAutoReverse(true);
     							    	timeline2.play();

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



