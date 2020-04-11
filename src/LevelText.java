import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class LevelText extends Text{
	
	public LevelText(int i)
	{
	if(i == 1) {
		makeText1();
	}
	else if (i==2) {
		makeText2();
	}
	else if(i==3) {
		makeText3();
	}
	}
	
	
	public void makeText3() {
		setText("LEVEL 3"); 
	    setFont(Font.font(null, FontWeight.BOLD, 25));
	    setX(50); 
	    setY(100); 
	    setFill(Color.WHITE);
	}
	
	public void makeText2() {
		setText("LEVEL 2"); 
	    setFont(Font.font(null, FontWeight.BOLD, 25));
	    setX(50); 
	    setY(100); 
	    setFill(Color.WHITE);
	}
	
	public void makeText1() {
		setText("LEVEL 1"); 
	    setFont(Font.font(null, FontWeight.BOLD, 25));
	    setX(50); 
	    setY(100); 
	    setFill(Color.WHITE);
	}

}
