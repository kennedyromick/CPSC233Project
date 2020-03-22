package FinalProject;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.ArrayList;


public class GameGUI extends Application{
	
	ObstacleList obstacleList = new ObstacleList();
	EnemyList enemyList = new EnemyList();
	
	Avatar avatar = new Avatar(5,765,35,35);
	
	 public static void main(String[] args)
	   {
	      Application.launch(args);
	      
	   }
	
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Astroblast!");
		Group root = new Group();
		Scene theScene = new Scene(root);
		primaryStage.setScene(theScene);
		

		AvatarMovement avatarHandler = new AvatarMovement(avatar);
		theScene.setOnKeyPressed(avatarHandler);
		
		Canvas canvas = new Canvas(1350,800);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);	
		
		avatar.setFill(Color.BLUE);
		root.getChildren().addAll(obstacleList);
		root.getChildren().addAll(enemyList);
		root.getChildren().addAll(avatar);
     	
    		
     	Timeline timeline = new Timeline(
     			new KeyFrame(Duration.millis(1),
     	               new EventHandler <ActionEvent>()
     				   {
     				   	@Override
     				   	public void handle(ActionEvent event)
     				   	{
     						for(Obstacle o: obstacleList) 
     						{
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
     						for(Enemy e: enemyList)
     						{
     				    		if (avatar.intersects(e))
     				    		{
     				    			System.exit(0);
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


