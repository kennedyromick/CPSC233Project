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
	Avatar avatar3 = new Avatar(300,765,25,25);
	EnemyList enemyList = new EnemyList(3);
	
	
	public void start(Stage primaryStage) {

		AvatarMovement avatarHandler3 = new AvatarMovement(avatar3, obstacleList3, runnerList3, enemyList);
		theScene3.setOnKeyPressed(avatarHandler3);
		
		Canvas canvas = new Canvas(1350,800);
		root3.getChildren().add(canvas);
		
		avatar3.setFill(Color.BLUE);
		root3.getChildren().add(avatar3);
		root3.getChildren().addAll(runnerList3);
		root3.getChildren().addAll(obstacleList3);
		root3.getChildren().addAll(enemyList);
		
     	
     	Timeline timeline = new Timeline(
     			new KeyFrame(Duration.millis(10),
     	               new EventHandler <ActionEvent>()
     				   {
     				   	@Override
     				   	public void handle(ActionEvent event)
     				   	{
     						for(Obstacle o: obstacleList3) 
     						{
     							avatar3.collisionCheck(o);
     							if(o == obstacleList3.get(1)) {
     								if(avatar3.intersects(o)) {
     									System.exit(0);
     								}
     							}
     						}
     						if(avatar3.reverse == false) 
     						{
     							avatar3.jump();
     						}
     						else if(avatar3.reverse == true) 
     						{
        						avatar3.grav();
     						}
       						for(Runner r: runnerList3) {
      							if(avatar3.intersects(r)) {
      								System.exit(0);
      							}
      							}
       						for(Runner r: runnerList3) {
      							if(avatar3.intersects(r)) {
      								System.exit(0);
      							}
      							}
         				   	for(Runner r: runnerList3) {
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
         				   for(Enemy e: enemyList) {
     							if(avatar3.intersects(e)) {
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
