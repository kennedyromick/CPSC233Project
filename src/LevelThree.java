import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LevelThree {
	
	private Scene theScene3;
	private Group root3;
	private Stage primaryStage3;
	private int counter = 0;
	
	public LevelThree(Stage stage, Group root, Scene scene) {
		theScene3 = scene;
		this.root3 = root;
		primaryStage3 = stage;
	}
	
	//initiates avatar, moving enemies, platforms, end wall, game over screen,
	//meteors, game beat screen and Level label
	private ObstacleList obstacleList3 = new ObstacleList(3);
	private RunnerList runnerList3 = new RunnerList(3);
	private Avatar avatar3 = new Avatar(300,745,35,35);
	private EndList endList = new EndList(3);
	private MeteorList meteorList = new MeteorList(3);
	private LevelText text = new LevelText(3);
	private GameOver gmOver = new GameOver();
	private WinScreen win = new WinScreen();
	
	public void start(Stage primaryStage) {

		//handles key arrow input
		AvatarMovement avatarHandler3 = new AvatarMovement(avatar3, obstacleList3, runnerList3, meteorList, endList);
		theScene3.setOnKeyPressed(avatarHandler3);
		
		Canvas canvas = new Canvas(1350,800);
		root3.getChildren().add(canvas);
		
		//sets avatar to spaceship image
		avatar3.setFill(
			      new ImagePattern(
			    	        new Image("space35.png"), 0, 0, 1, 1, true
			    	      )
			    	    );
		//sets platforms to platform images
		for(Obstacle o: obstacleList3) {
			o.setFill(
				      new ImagePattern(
				    	        new Image("bump.jpg"), 0, 0, 1, 1, true
				    	      )
				    	    );
		}
		//sets end wall to end wall image
		for(End e: endList) {
			e.setFill(
				      new ImagePattern(
				    	        new Image("bump.jpg"), 0, 0, 1, 1, true
				    	      )
				    	    );
		}
		//sets meteors to meteor images
		for(Meteor m : meteorList) {
			m.setFill(
				      new ImagePattern(
				    	        new Image("download2.png"), 0, 0, 1, 1, true
				    	      )
				    	    );
		}
		//sets enemies to alien images
		for(Runner r: runnerList3) {
			r.setFill	(			
				      new ImagePattern(
				    	        new Image("alien.png"), 0, 0, 1, 1, true
				    	      )
				    	    );
		}
		//adds avatar, enemies, platforms, end wall, meteors and level label to the game
		root3.getChildren().add(avatar3);
		root3.getChildren().addAll(runnerList3);
		root3.getChildren().addAll(obstacleList3);
		root3.getChildren().addAll(endList);
		root3.getChildren().addAll(meteorList);
		root3.getChildren().add(text);
		
     	
     	Timeline timeline = new Timeline(
     			new KeyFrame(Duration.millis(10),
     	               new EventHandler <ActionEvent>()
     				   {
     				   	@Override
     				   	public void handle(ActionEvent event)
     				   	{
     				   		//if avatar falls through floor gaps, game over screen
     				   		if(avatar3.outOfBounds()==true) {
     				   			gmOver.start(primaryStage);
     				   		}
     				   		//if avatar reaches end wall, game beat screen
 								if(avatar3.intersects(endList.get(0))) {
 									win.start(primaryStage);
 								}
 								//checks for collisions with platforms
     						for(Obstacle o: obstacleList3) 
     						{
     							avatar3.collisionCheck(o);
     							avatar3.unCollisionCheck(o);
     						}
     						//reverses gravity
     						if(avatar3.getReverse() == false) 
     						{
     							avatar3.revGrav();
     						}
     						else if(avatar3.getReverse() == true) 
     						{
        						avatar3.grav();
     						}
     						//if avatar touches enemy, game over screen
       						for(Runner r: runnerList3) {
      							if(avatar3.intersects(r)) {
      								gmOver.start(primaryStage);
      							}
      							}
       						//moves runners
         				   	for(Runner r: runnerList3) {
         						r.updateLocation();
         						if(r.getLeftEnd() != r.getRightEnd()) {
         							 if(r.getX()<= r.getLeftEnd()) {
         								 r.reverseX();
         							 }
         							 else if(r.getX()>= r.getRightEnd()) {
         								r.reverseX();
         							 }
         						 }
         						 if(r.getUpEnd() != r.getDownEnd()) {
         							 if(r.getY()< r.getUpEnd()) {
         								 r.reverseY();
         							 }
         							 if(r.getY()>= r.getDownEnd()) {
         								 r.reverseY();
         							 }
         						 }
          						}
         				   	//if avatar touches meteors, game over screen
         				   for(Meteor m: meteorList) {
    							if(avatar3.intersects(m)) {
    								gmOver.start(primaryStage);
    							}
    						}
    				   	//moves meteors
    				   for(Meteor m: meteorList)
      				 {
      					m.updateLocation();
  						if(m.getStartPoint() != m.getEndPoint()) 
  							{
  							if(m.getVelX() > 0) {
  							 	if(m.getX()<= m.getStartPoint()) 
  							 	{
  							 		m.reset(m);
  							 	}
  							 	else if(m.getX()>= m.getEndPoint()) 
  							 	{
  							 		m.reset(m);
  							 	}
  							}
  							}
  						else if(m.getVelX()<0) {
  							 	if(m.getX()>= m.getStartPoint()) 
  							 	{
  							 		m.reset(m);
  							 	}
  							 	else if(m.getX()<= m.getEndPoint()) 
  							 	{
  							 		m.reset(m);
  							 	}
  						}
  						 if(m.getUpPoint() != m.getDownPoint()) 
  						 	{
  							 if(m.getY()< m.getUpPoint()) {
  								 m.reset(m);
  							 }
  							 if(m.getY()>= m.getDownPoint()) {
  								 m.reset(m);
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
	


}
