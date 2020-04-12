import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GameGUI extends Application{
	
	 public static void main(String[] args)
	   {
	      Application.launch(args);
	      
	   }
	
	public void start(Stage Stage) {
		//sets the title
		Stage.setTitle("Astroblast!");
		
		Group root = new Group();
		//makes the playing screen 1350 pixels by 820 pixels
		Scene theScene = new Scene(root, 1350, 820);
		Stage.setScene(theScene);
		Stage.setResizable(false);
		
		//initializes and starts level one
		LevelOne one = new LevelOne(Stage, root, theScene);
		one.start(Stage);
	}
	
	

}
