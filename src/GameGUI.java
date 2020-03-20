package main;

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
	
	ArrayList<Obstacle> obstacleList = new ArrayList<Obstacle>();
	
	Avatar avatar = new Avatar(5,765,35,35);
	

	
	Obstacle one = new Obstacle(0,800,13500,50);
	Obstacle two = new Obstacle(300,725,200,10);
	Obstacle three = new Obstacle(500,650,100,10);
	Obstacle four = new Obstacle(600,725,200,10);
	Obstacle five = new Obstacle(250,575,200,10);
	Obstacle six = new Obstacle(0,0,13500,50);
	Obstacle seven = new Obstacle(150,500,100,10);
	Obstacle eight = new Obstacle(0,425,150,10);
	Obstacle nine = new Obstacle(650,575,200,10);
	Obstacle ten = new Obstacle(850,500,200,10);
	Obstacle eleven = new Obstacle(1050,425,150,10);
	Obstacle tweleve = new Obstacle(675,425,125,10);
	Obstacle thirteen = new Obstacle(475,350,200,10);
	Obstacle fourteen = new Obstacle(275,275,200,10);
	Obstacle fifteen = new Obstacle(1000,725,200,10);
	Obstacle sixteen = new Obstacle(1200,350,100,10);
//	Obstacle seventeen = new Obstacle(1200,800,1350,50);
	Obstacle eighteen = new Obstacle(1500,725,200,10);
	Obstacle nineteen = new Obstacle(1900,650,100,10);
	Obstacle twenty = new Obstacle(2050,725,200,10);
	Obstacle xxi = new Obstacle(2550,0,1350,10);
//	Obstacle xxii = new Obstacle(2600,500,100,50);
	Obstacle xxiii = new Obstacle(2800,425,150,10);
	Obstacle xxiv = new Obstacle(2900,575,200,10);
	Obstacle xxv = new Obstacle(3110,500,200,10);
	Obstacle xxvi = new Obstacle(3200,425,150,10);
	Obstacle xxvii = new Obstacle(3300,425,125,10);
	Obstacle xxviii = new Obstacle(3500,350,200,10);
	Obstacle xxix = new Obstacle(3700,275,200,10);
	Obstacle xxx = new Obstacle(3700,725,200,10);
	Obstacle xxxi = new Obstacle(3900,350,100,10);
	Obstacle xxxii = new Obstacle(4000,350,100,10);

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
		
		Enemy.makeEnemies();
		
		avatar.setFill(Color.BLUE);
		root.getChildren().addAll(avatar, one, two, three, four, five, six, seven, eight, nine, ten, eleven, tweleve, thirteen);
		root.getChildren().addAll(fourteen, fifteen, sixteen, eighteen, nineteen, twenty);
		root.getChildren().addAll(xxiii, xxiv, xxv, xxvi, xxvii, xxviii, xxix, xxx, xxxi, xxxii);
		root.getChildren().addAll(Enemy.getList());
	
		createObjList();
     	
    		
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
     						for(Enemy e: Enemy.getList())
     						{
     							ArrayList<Enemy> enemies = Enemy.getList();
     				    		for(int w = 0; w < enemies.size(); w++)
     				    		{
     				    			Enemy f = enemies.get(w);
     				    			//code runs fine until here, then nothing happens after
     				    			if (avatar.intersects(Enemy.getBounds(f)) == true)
     				    			{
     				    				System.exit(0);
     				    			}
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
     				   
	
     	public void createObjList()
     	{
     		obstacleList.add(one);
			obstacleList.add(two);
     		obstacleList.add(three);
     		obstacleList.add(four);
     		obstacleList.add(five);
     		obstacleList.add(six);
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
     	//	obstacleList.add(seventeen);
     		obstacleList.add(eighteen);
     		obstacleList.add(nineteen);
     		obstacleList.add(twenty);
   			obstacleList.add(xxi);
    	//	obstacleList.add(xxii);
     		obstacleList.add(xxiii);
     		obstacleList.add(xxiv);
     		obstacleList.add(xxv);
     		obstacleList.add(xxvi);
     		obstacleList.add(xxvii);
     		obstacleList.add(xxviii);
     		obstacleList.add(xxix);
     		obstacleList.add(xxx);
     		obstacleList.add(xxxi);
     		obstacleList.add(xxxii);

     					}


}


