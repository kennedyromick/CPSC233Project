package FinalProject;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
	public ImageView prepareImageView() {
		Image image = new Image(LevelTwo.class.getResourceAsStream("stars.jpg"));
		ImageView imageView = new ImageView(image);
	      //Setting the position of the image 
	      imageView.setX(0); 
	      imageView.setY(0); 
	      
	      //setting the fit height and width of the image view 
	      imageView.setFitHeight(800); 
	      imageView.setFitWidth(5000); 
		imageView.setPreserveRatio(true);
		return imageView;
	}
	
	ObstacleList obstacleList2 = new ObstacleList(2);
	RunnerList runnerList2 = new RunnerList(2);
	Avatar avatar2 = new Avatar(300,765,25,25);
	EnemyList enemyList = new EnemyList(2);
	EndList endList = new EndList(2);
	
	
	public void start(Stage primaryStage) {

		

		AvatarMovement avatarHandler2 = new AvatarMovement(avatar2, obstacleList2, runnerList2, enemyList, endList);
			theScene2.setOnKeyPressed(avatarHandler2);
			
			avatar2.setFill(Color.LIGHTBLUE);
			for(Obstacle o: obstacleList2) {
				o.setFill(Color.WHITE);
			}
			for(End e: endList) {
				e.setFill(Color.WHITE);
			}
			for(Runner r: runnerList2) {
				r.setFill(Color.LIGHTGREEN);
			}
			root2.getChildren().add(prepareImageView());
			root2.getChildren().add(avatar2);
			root2.getChildren().addAll(runnerList2);
			root2.getChildren().addAll(obstacleList2);
			root2.getChildren().addAll(endList);
			
			
			Timeline timeline2 = new Timeline(
	     			new KeyFrame(Duration.millis(10),
	     	               new EventHandler <ActionEvent>()
	     				   {
	     				   	@Override
	     				   	public void handle(ActionEvent event)
	     				   	{
	     				   			if(avatar2.intersects(endList.get(0))) {
	     				   				counter = counter+1;
	     				   				root2.getChildren().remove(avatar2);
	     				   				root2.getChildren().removeAll(runnerList2);
	     				   				root2.getChildren().removeAll(obstacleList2);
	     				   				root2.getChildren().removeAll(endList);
	     				   				LevelThree three = new LevelThree(primaryStage2, root2, theScene2);
 								if(counter == 1) {
 								three.start(primaryStage2);
 								}
  								}
	     				   	for(Obstacle p: obstacleList2) {
	     				   		avatar2.unCollisionCheck(p);
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
