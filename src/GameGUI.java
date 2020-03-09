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
	
	Avatar avatar = new Avatar(0,800,50,50);
	Obstacle one = new Obstacle(100,800,200,50);
	Obstacle two = new Obstacle(300,725,200,50);
	Obstacle three = new Obstacle(500,650,100,50);
	Obstacle four = new Obstacle(600,725,200,50);
	Obstacle five = new Obstacle(250,575,200,50);
	Obstacle six = new Obstacle(800,800,200,50);
	Obstacle seven = new Obstacle(150,500,100,50);
	Obstacle eight = new Obstacle(0,425,150,50);
	Obstacle nine = new Obstacle(650,575,200,50);
	Obstacle ten = new Obstacle(850,500,200,50);
	Obstacle eleven = new Obstacle(1050,425,150,50);
	Obstacle tweleve = new Obstacle(675,425,125,50);
	Obstacle thirteen = new Obstacle(475,350,200,50);
	Obstacle fourteen = new Obstacle(275,275,200,50);
	Obstacle fifteen = new Obstacle(1000,725,200,50);
	Obstacle sixteen = new Obstacle(1200,350,100,50);
	
	
	 public static void main(String[] args)
	   {
	      Application.launch(args);
	   }
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Astroblast!");
		
		Group root = new Group();
		Scene theScene = new Scene(root);
		primaryStage.setScene(theScene);
		
		Canvas canvas = new Canvas(1350,800);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		avatar.setFill(Color.BLUE);
		root.getChildren().addAll(avatar, one, two, three, four, five, six, seven, eight, nine);
		root.getChildren().addAll(ten, eleven, tweleve, thirteen, fourteen, fifteen, sixteen);
		
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
