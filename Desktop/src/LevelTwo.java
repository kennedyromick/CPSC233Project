import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LevelTwo {
	int counter = 0;
	Scene theScene2;
	Group root2;
	Stage primaryStage2;
	
	public LevelTwo(Stage stage, Group root, Scene scene) {
		theScene2 = scene;
		this.root2 = root;
		primaryStage2 = stage;
	}
	
	ObstacleList obstacleList2 = new ObstacleList(2);
	RunnerList runnerList2 = new RunnerList(2);
	Avatar avatar2 = new Avatar(300,765,25,25);
	EnemyList enemyList = new EnemyList(2);
	
	
	public void start(Stage primaryStage) {

//		primaryStage2.setTitle("Astroblast!");
//		
//		Group root2 = new Group();
//		Scene theScene2 = new Scene(root2);
//		primaryStage2.setScene(theScene2);
		

		AvatarMovement avatarHandler2 = new AvatarMovement(avatar2, obstacleList2, runnerList2, enemyList);
			theScene2.setOnKeyPressed(avatarHandler2);
			
			avatar2.setFill(Color.BLUE);
			root2.getChildren().add(avatar2);
			root2.getChildren().addAll(runnerList2);
			root2.getChildren().addAll(obstacleList2);
			
			Timeline timeline2 = new Timeline(
	     			new KeyFrame(Duration.millis(10),
	     	               new EventHandler <ActionEvent>()
	     				   {
	     				   	@Override
	     				   	public void handle(ActionEvent event)
	     				   	{
	     				   	for(Obstacle p: obstacleList2) {
  							avatar2.collisionCheck(p);
  							if(p==obstacleList2.get(2)) {
  								if(avatar2.intersects(p)) {
 									counter = counter+1;
     								root2.getChildren().remove(avatar2);
 									root2.getChildren().removeAll(runnerList2);
 									root2.getChildren().removeAll(obstacleList2);
 								LevelThree three = new LevelThree(primaryStage2, root2, theScene2);
 								if(counter == 1) {
 								three.start(primaryStage2);
 								}
  								}
  							}
  						}
  						if(avatar2.reverse == false) 
  						{
  							avatar2.jump();
  						}
  						else if(avatar2.reverse == true) 
  						{
     						avatar2.grav();
  						}
   						for(Runner r: runnerList2) {
  							if(avatar2.intersects(r)) {
  								System.exit(0);
  							}
  							}
   						for(Runner r: runnerList2) {
  							if(avatar2.intersects(r)) {
  								System.exit(0);
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


primaryStage.show();
}
	


}
