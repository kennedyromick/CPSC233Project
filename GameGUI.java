import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;



public class GameGUI extends Application{

	ObstacleList obstacleList = new ObstacleList(1);
	RunnerList runnerList = new RunnerList(1);
	ObstacleList obstacleList2 = new ObstacleList(2);
	RunnerList runnerList2 = new RunnerList(2);
	
	Avatar avatar = new Avatar(10,765,25,25);
	Avatar avatar2 = new Avatar(50,765,25,25);
	
	
	
	 public static void main(String[] args)
	   {
	      Application.launch(args);
	      
	   }
	
	public void start(Stage Stage) {
		
		Stage.setTitle("Astroblast!");
		
		Group root = new Group();
		Scene theScene = new Scene(root);
		Stage.setScene(theScene);
		

		LevelOne one = new LevelOne(Stage, root, theScene);
		one.start(Stage);
	}
	
	

}
