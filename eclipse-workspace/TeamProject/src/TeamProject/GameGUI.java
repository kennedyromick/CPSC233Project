package TeamProject;

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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;


public class GameGUI extends Application{

	ArrayList<Obstacle> obstacleList = new ArrayList<Obstacle>();
	
	Avatar avatar = new Avatar(0,765,35,35);
	Obstacle one = new Obstacle(0,800,1350,50);
	Obstacle two = new Obstacle(300,725,200,50);
	Obstacle three = new Obstacle(500,650,100,50);
	Obstacle four = new Obstacle(600,725,200,50);
	Obstacle five = new Obstacle(250,575,200,50);
	//Obstacle six = new Obstacle(800,800,200,50);
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

		AvatarMovement avatarHandler = new AvatarMovement(avatar);
		theScene.setOnKeyPressed(avatarHandler);
		
		Canvas canvas = new Canvas(1350,800);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		avatar.setFill(Color.BLUE);
		root.getChildren().addAll(avatar, one, two, three, four, five, seven, eight, nine);
		root.getChildren().addAll(ten, eleven, tweleve, thirteen, fourteen, fifteen, sixteen);
		
     	createObjList();
     	
     	Timeline timeline = new Timeline(
     			new KeyFrame(Duration.millis(10),
     	               new EventHandler <ActionEvent>()
     				   {
     				   	@Override
     				   	public void handle(ActionEvent event)
     				   	{
     						for(Obstacle o: obstacleList) {
         						//avatar.grav();
     							avatar.collisionCheck(o);
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
	
	public void createObjList() {
		obstacleList.add(one);
		obstacleList.add(two);
		obstacleList.add(three);
		obstacleList.add(four);
		obstacleList.add(five);
		//obstacleList.add(six);
		obstacleList.add(seven);
		obstacleList.add(eight);
		obstacleList.add(nine);
		obstacleList.add(ten);
		obstacleList.add(eleven);
		obstacleList.add(tweleve);
		obstacleList.add(thirteen);
		obstacleList.add(fourteen);
		obstacleList.add(fifteen);
		obstacleList.add(sixteen);
	}
	

}
