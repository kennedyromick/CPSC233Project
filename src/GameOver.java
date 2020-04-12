import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GameOver extends Application {
	    public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage primaryStage) {
	    	primaryStage.setTitle("Game Over!");
			Text text = new Text();  

		    text.setText("GAME OVER!"); 
		    text.setFont(Font.font(null, FontWeight.BOLD, 40));
		    text.setFill(Color.RED);


	        	primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
	        	    @Override
	        	    public void handle(WindowEvent t) {
	        	        Platform.exit();
	        	        System.exit(0);
	        	    }
	        	});

	        StackPane root = new StackPane();
	        root.getChildren().add(text);
	        primaryStage.setScene(new Scene(root, 300, 100));
	        primaryStage.show();
	    }
	}