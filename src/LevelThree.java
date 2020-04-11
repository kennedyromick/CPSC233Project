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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LevelThree {
	
	Scene theScene3;
	Group root3;
	Stage primaryStage3;
	int counter = 0;
	
	public LevelThree(Stage stage, Group root, Scene scene) {
		theScene3 = scene;
		this.root3 = root;
		primaryStage3 = stage;
	}
	
	
	ObstacleList obstacleList3 = new ObstacleList(3);
	RunnerList runnerList3 = new RunnerList(3);
	Avatar avatar3 = new Avatar(300,755,25,25);
	EndList endList = new EndList(3);
	MeteorList meteorList = new MeteorList(3);
	LevelText text = new LevelText(3);
	GameOver gmOver = new GameOver();
	
	public void start(Stage primaryStage) {

		AvatarMovement avatarHandler3 = new AvatarMovement(avatar3, obstacleList3, runnerList3, meteorList, endList);
		theScene3.setOnKeyPressed(avatarHandler3);
		
		Canvas canvas = new Canvas(1350,800);
		root3.getChildren().add(canvas);
		
		avatar3.setFill(Color.LIGHTBLUE);
		for(Obstacle o: obstacleList3) {
			o.setFill(Color.WHITE);
		}
		for(End e: endList) {
			e.setFill(Color.WHITE);
		}
		for(Meteor m : meteorList) {
			m.setFill(Color.BROWN);
		}
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
     				   		if(avatar3.outOfBounds()==true) {
     				   			gmOver.start(primaryStage);
     				   		}
 								if(avatar3.intersects(endList.get(0))) {
 									gmOver.start(primaryStage);
 								}
     						for(Obstacle o: obstacleList3) 
     						{
     							avatar3.collisionCheck(o);
     							avatar3.unCollisionCheck(o);
     						}
     						if(avatar3.getReverse() == false) 
     						{
     							avatar3.jump();
     						}
     						else if(avatar3.getReverse() == true) 
     						{
        						avatar3.grav();
     						}
       						for(Runner r: runnerList3) {
      							if(avatar3.intersects(r)) {
      								gmOver.start(primaryStage);
      							}
      							}
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
         				   for(Meteor m: meteorList) {
    							if(avatar3.intersects(m)) {
    								gmOver.start(primaryStage);
    							}
    						}
    				   	
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
