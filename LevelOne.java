import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
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
	
	public ImageView prepareImageView() {
		Image image = new Image(LevelOne.class.getResourceAsStream("stars.jpg"));
		ImageView imageView = new ImageView(image);
	      //Setting the position of the image 
	      imageView.setX(0); 
	      imageView.setY(0); 
	      
	      //setting the fit height and width of the image view 
	      imageView.setFitHeight(820); 
	      imageView.setFitWidth(5000); 
		imageView.setPreserveRatio(true);
		return imageView;
	}
	
	ObstacleList obstacleList = new ObstacleList(1);
	RunnerList runnerList = new RunnerList(1);
	Avatar avatar = new Avatar(300,765,25,25);
	EndList endList = new EndList(1);
	MeteorList meteorList = new MeteorList(1);
	LevelText text = new LevelText(1);
	
	
	public void start(Stage primaryStage) {

	
		AvatarMovement avatarHandler = new AvatarMovement(avatar, obstacleList, runnerList, meteorList, endList);
		theScene.setOnKeyPressed(avatarHandler);
		
		Canvas canvas = new Canvas(1350,800);
		root.getChildren().add(canvas);
		
		avatar.setFill(
			      new ImagePattern(
			    	        new Image("space35.png"), 0, 0, 1, 1, true
			    	      )
			    	    );
		for(Obstacle o: obstacleList) {
			o.setFill(
				      new ImagePattern(
				    	        new Image("bump.jpg"), 0, 0, 1, 1, true
				    	      )
				    	    );
		}
		for(End e: endList) {
			e.setFill(
				      new ImagePattern(
				    	        new Image("bump.jpg"), 0, 0, 1, 1, true
				    	      )
				    	    );
		}
		root.getChildren().add(prepareImageView());
		root.getChildren().add(avatar);
		root.getChildren().addAll(runnerList);
		root.getChildren().addAll(obstacleList);
		root.getChildren().addAll(endList);
		root.getChildren().add(text);
		
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
 									root.getChildren().remove(text);
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
     						if(avatar.getReverse() == false) 
     						{
     							avatar.jump();
     						}
     						else if(avatar.getReverse() == true) 
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
