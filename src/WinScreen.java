import javafx.application.Application;
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

public class WinScreen extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	primaryStage.setTitle("Game Completed!");
		Text text = new Text();  
		
	    text.setText("MISSION ACCOMPLISHED!"); 
	    text.setFont(Font.font(null, FontWeight.BOLD, 40));
	    text.setFill(Color.GREEN);
	    
        Button btn = new Button();
        btn.setText(null);
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(text);
        primaryStage.setScene(new Scene(root, 550, 100));
        primaryStage.show();
    }
}