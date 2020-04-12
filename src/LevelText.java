import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class LevelText extends Text{
	
	private String levelNum;
	
	public LevelText(int level)
	{
		//makes level one label
	if(level == 1) {
		setLevelNum("LEVEL 1");
		makeText();
	}
	//makes level two label
	else if (level ==2) {
		setLevelNum("LEVEL 2");
		makeText();
	}
	//makes level three label
	else if(level ==3) {
		setLevelNum("LEVEL 3");
		makeText();
	}
	}
	
	public void setLevelNum(String label) {
		levelNum = label;
	}
	
	//creates bold white level labels 
	public void makeText() {
		setText(levelNum); 
	    setFont(Font.font(null, FontWeight.BOLD, 25));
	    setX(50); 
	    setY(100); 
	    setFill(Color.WHITE);
	}

}
