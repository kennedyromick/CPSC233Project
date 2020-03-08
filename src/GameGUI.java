package TeamProject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;

public class GameGUI extends Application{
	
	Avatar avatar = new Avatar(50,50,0,0);
	
	
	 public static void main(String[] args)
	   {
	      Application.launch(args);
	   }
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Astroblast!");
		
		Group root = new Group();
		Scene theScene = new Scene(root);
		primaryStage.setScene(theScene);
		
		Canvas canvas = new Canvas(800,600);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		avatar.setFill(Color.BLUE);
		root.getChildren().addAll(avatar);
		
		primaryStage.show();
	}
	
	//this is where I was trying to set up the timer, I'm not 100% sure if 
	//the code for the timer should go in the class or the Avatar class
	//you can even create a new Moveable class if that made it easier
//	public void startGame() {
//		AnimationTimer gameLoop = new AnimationTimer() {
//			@Override
//			public void handle(long now) {
//				//I can't figure out what should be in this method
//			}
//		};
//		gameLoop.start();
//	}

}
